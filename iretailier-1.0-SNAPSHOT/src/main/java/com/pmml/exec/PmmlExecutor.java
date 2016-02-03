package com.pmml.exec;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class PmmlExecutor {

	public static String exec(String modelName, String request) throws Exception {
		HttpPut put = new HttpPut("http://localhost:9080/openscoring-webapp-1.2.0/model/" + modelName + "/exec");
//		String textFileName = "C:/Users/spark/workspace_os/pmml-mgr/DecisionTreeIris.pmml";
//		File file = new File(textFileName );
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.setContentType(ContentType.TEXT_XML);
//		builder.setCharset(Charsets.UTF_8);
//		builder.setBoundary("");
//		put.setHeader("Accept", "*/*");
		

//		String fileStr = "{'id':'record001','arguments':{'Sepal_Length':5.1,'Sepal_Width':3.5,'Petal_Length':1.4,'Petal_Width':0.2}}";
//		System.out.println(fileStr.getBytes().length);
//		FileBody fileBody = new FileBody(file);
//		builder.addPart("ent_gbm1.pmml", fileBody);
		builder.addBinaryBody(modelName, request.getBytes(), ContentType.APPLICATION_XML, modelName);
		

		
		HttpEntity entity = builder.build();
		put.setEntity(entity);
		
		CloseableHttpClient client = HttpClients.createDefault();
		HttpResponse response = client.execute(put);
		StatusLine statusLine = response.getStatusLine();
		int statusCode = statusLine.getStatusCode();
		System.out.println(statusCode);
		String resp = EntityUtils.toString(response.getEntity());
		System.out.println(resp);
		return resp;
	}

	public static void main(String[] args) throws Exception {
//		PmmlExecutor.exec("credit_tbl_ksvm", "{'id':'record001','arguments':{'Sepal_Length':5.1,'Sepal_Width':3.5,'Petal_Length':1.4,'Petal_Width':0.2}}");
		PmmlExecutor.exec("credit_tbl_ksvm", "{'id' : 'record-001', 'arguments' : { 'checking_status' : 'ZTO200', 'duration' : 16, 'credit_history' : 'critical/other existing credit', 'purpose' : 'new car', 'credit_amount' : 1175, 'savings_status' : 'LT100', 'employment' : 'unemployed', 'installment_commitment' : 2, 'personal_status' : 'male single', 'other_parties': 'none', 'residence_since' : 3, 'property_magnitude' : 'car', 'age' : 68, 'other_payment_plans' : 'none', 'housing' : 'for free', 'existing_credits' : 3, 'job' : 'unemp/unskilled non res', 'num_dependents': 1, 'own_telephone' : '1', 'foreign_worker': TRUE }}");
	}
}
