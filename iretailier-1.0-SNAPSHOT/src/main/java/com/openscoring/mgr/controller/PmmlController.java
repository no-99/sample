package com.openscoring.mgr.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.openscoring.mgr.entity.Pmml;
import com.openscoring.mgr.entity.PmmlMgr;
import com.openscoring.mgr.model.FileMeta;
import com.pmml.exec.PmmlExecutor;
import com.pmml.upload.PmmlUploader;
import com.pmml.vo.PmmlModelMeta;
import com.pmml.vo.Response;

@Controller
public class PmmlController {

    @RequestMapping("/pmml/show")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        
        List<FileMeta> fileMetas = PmmlMgr.listFileMeta();
        model.addAttribute("fileMetas", fileMetas);
        
        return "pmml";
    }
    
    @RequestMapping("/pmml/publish")
    public @ResponseBody List<Object> publish(@RequestParam(value="id") String id, Model model) {
        
    	FileMeta fileMeta = PmmlMgr.getFileMeta(id);
    	Pmml pmml = PmmlMgr.getModel(fileMeta.getPmmlUuid());
    	PmmlModelMeta resp = new PmmlModelMeta();
    	try {
    		resp = PmmlUploader.upload(pmml.getName(), pmml.getContent().getBytes());
			pmml.setEffectDate(new Date());
			PmmlMgr.updateModel(pmml);
			
			fileMeta.setStatus(FileMeta.STATUS.PUBLISHED.name());
			fileMeta.setEffectDate(pmml.getEffectDate());
			fileMeta.setPmmlUuid(pmml.getUuid());
			PmmlMgr.updateFileMeta(fileMeta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	List<Object> result = new LinkedList<Object>();
    	result.add(fileMeta);
    	result.add(resp);
        return result;
    }
    
    @RequestMapping("/pmml/request")
    public String request(@RequestParam(value="id") String id, Model model) {
    	System.out.println(id);
    	model.addAttribute("name", id);
        return "pmmlrequest";
    }
    
    @RequestMapping("/pmml/exec")
    public @ResponseBody Response exec(@RequestParam(value="id") String id, @RequestParam(value="request") String pmmlrequest) {
        
    	String pmmlresp = "";
    	try {
			pmmlresp = PmmlExecutor.exec(id, pmmlrequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return new Gson().fromJson(pmmlresp, Response.class);
    }

}