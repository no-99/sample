package com.pmml.upload;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.pmml.vo.PmmlModelMeta;

// TODO return Response instead of void
public class PmmlUploader {
	
	private static Gson convertor = new Gson();

	public static PmmlModelMeta upload(String modelName, byte[] pmmlModel) throws Exception {
		HttpPut put = new HttpPut("http://localhost:9080/openscoring-webapp-1.2.0/model/" + modelName);
//		String textFileName = "C:/Users/spark/workspace_os/pmml-mgr/DecisionTreeIris.pmml";
//		File file = new File(textFileName );
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.setContentType(ContentType.TEXT_XML);
//		builder.setCharset(Charsets.UTF_8);
//		builder.setBoundary("");
//		put.setHeader("Accept", "*/*");
		

//		String fileStr = new String(Files.readAllBytes(Paths.get(textFileName)));
//		System.out.println(fileStr.getBytes().length);
//		FileBody fileBody = new FileBody(file);
//		builder.addPart("ent_gbm1.pmml", fileBody);
		builder.addBinaryBody("credit_tbl_ksvm.pmml", pmmlModel, ContentType.APPLICATION_XML, "credit_tbl_ksvm.pmml");
		

		
		HttpEntity entity = builder.build();
		put.setEntity(entity);
		
		CloseableHttpClient client = HttpClients.createDefault();
		HttpResponse response = client.execute(put);
		StatusLine statusLine = response.getStatusLine();
		int statusCode = statusLine.getStatusCode();
		if(statusCode == 200) {
			System.out.println(statusCode);
			String string = EntityUtils.toString(response.getEntity());
			System.out.println(string);
			
			PmmlModelMeta pmmlResp = convertor.fromJson(string, PmmlModelMeta.class);
			return pmmlResp;
		} else {
			return null;
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		String fileStr = new String(Files.readAllBytes(Paths.get("C:/Users/spark/workspace_os/admin-console-1.0-SNAPSHOT/credit_tbl_ksvm.pmml")));
		System.out.println(fileStr.getBytes().length);
		PmmlUploader.upload("credit_tbl_ksvm", fileStr.getBytes());
	}

}
