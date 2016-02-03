package com.openscoring.mgr.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.openscoring.mgr.entity.Pmml;
import com.openscoring.mgr.entity.PmmlMgr;
import com.openscoring.mgr.model.FileMeta;


@Controller
@RequestMapping("/controller")
public class FileController {

	
//	LinkedList<FileMeta> files = new LinkedList<FileMeta>();
	FileMeta fileMeta = null;
	/***************************************************
	 * URL: /rest/controller/upload  
	 * upload(): receives files
	 * @param request : MultipartHttpServletRequest auto passed
	 * @param response : HttpServletResponse auto passed
	 * @return LinkedList<FileMeta> as json format
	 ****************************************************/
	@RequestMapping(value="/upload", method = RequestMethod.POST)
	public @ResponseBody List<FileMeta> upload(MultipartHttpServletRequest request, HttpServletResponse response) {
 
		//1. build an iterator
		 Iterator<String> itr =  request.getFileNames();
		 MultipartFile mpf = null;

		 //2. get each file
		 while(itr.hasNext()){
			 
			 //2.1 get next MultipartFile
			 mpf = request.getFile(itr.next()); 

			 //2.2 if files > 10 remove the first from the list
//			 if(files.size() >= 10)
//				 files.pop();
			 
			 //2.3 create new fileMeta
			 fileMeta = new FileMeta();
			 fileMeta.setUuid(UUID.randomUUID().toString());
			 fileMeta.setFileName(mpf.getOriginalFilename());
			 fileMeta.setFileSize(mpf.getSize()/1024+" Kb");
			 fileMeta.setFileType(mpf.getContentType());
			 
			 try {
				fileMeta.setBytes(mpf.getBytes());
				
				Pmml pmml = new Pmml();
				UUID uuid = UUID.randomUUID();
				pmml.setUuid(uuid.toString());
				pmml.setCode("M001");
				pmml.setEffectDate(new Date());
				pmml.setLastModifiedBy("shenyu");
				pmml.setLastModifiedTime(new Date());
				String fileName = fileMeta.getFileName();
				pmml.setModelDesc(fileName + " model");
				
				int indexOfSeparator = fileName.indexOf(".");
				pmml.setName(fileName.substring(0, indexOfSeparator));
				pmml.setProjectId("pro-1");
				pmml.setVersion("V2.0");
				pmml.setContent(new String(fileMeta.getBytes()));
				
				PmmlMgr.saveModel(pmml);
				
				fileMeta.setModelName(pmml.getName());
				fileMeta.setModelDesc(pmml.getModelDesc());
				fileMeta.setPmmlUuid(pmml.getUuid());
				fileMeta.setStatus(FileMeta.STATUS.UPLOADED.name());
				PmmlMgr.saveFileMeta(fileMeta);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //2.4 add to files
//			 files.add(fileMeta);
			 
		 }
		 
		// result will be like this
		// [{"fileName":"app_engine-85x77.png","fileSize":"8 Kb","fileType":"image/png"},...]
		return PmmlMgr.listFileMeta();
 
	}
	/***************************************************
	 * URL: /controller/get/{value}
	 * get(): get file as an attachment
	 * @param response : passed by the server
	 * @param value : value from the URL
	 * @return void
	 ****************************************************/
	// TODO cache model file content
	@RequestMapping("/get/{fileMetaUuid}")
	 public void get(HttpServletResponse response,@PathVariable String fileMetaUuid){
		 FileMeta getFile = PmmlMgr.getFileMeta(fileMetaUuid);
		 String pmmlUuid = getFile.getPmmlUuid();
		 
		 Pmml model = PmmlMgr.getModel(pmmlUuid);
		 String pmmlModelStr = model.getContent();
		 try {		
			 	response.setContentType(getFile.getFileType());
			 	response.setHeader("Content-disposition", "attachment; filename=\""+getFile.getFileName()+"\"");
		        FileCopyUtils.copy(pmmlModelStr.getBytes(), response.getOutputStream());
		 }catch (IOException e) {
				e.printStackTrace();
		 }
	 }
 
}