package com.arc.ReusableMethods
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import org.json.JSONObject

import com.arc.BaseClass.BaseClass
import com.jayway.restassured.http.ContentType.*
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS


import internal.GlobalVariable
public class ResuableMethodsLEEDOnline extends BaseClass {
	public static KeywordLogger log = new KeywordLogger()
	public static apiRequestId
	public static Float responsetime;
	public static ResponseObject response
	public static String [] testName
	public static int count1


	//To verify the API response time
	public static Float responsetime() {
		return Float.valueOf(response.headerFields("X-Api-Process-Time"));
	}

    //To verify the status code
	public static void statusCode(String code){
		log.logInfo("Verified Status Code : "+ code)
	}

	//To print the log message with message and values
	public static void printLog(String message , String value){
		log.logInfo(message+ ": "+value)
	}

	//to print the log method
	public static void printLog(String message){
		log.logInfo(message)
	}

    //To print the headers of the response
	public static float printHeaderValues(ResponseObject response){
		Map<String, String> header=  response.getHeaderFields()
		println header
		println header.get("X-Api-Request-Id")
		String processID =header.get("X-Api-Request-Id").toString().replaceAll("\\[", "").replaceAll("\\]","")
		String responseTime =header.get("X-Api-Process-Time").toString().replaceAll("\\[", "").replaceAll("\\]","")
		String contentType= header.get("Content-Type").toString().replaceAll("\\[", "").replaceAll("\\]","")
		float time = Float.valueOf(responseTime)*1000
		log.logInfo("X-Api-Request-Id is : "+processID)
		log.logInfo("Response Time (in MiliSeconds) : "+time)
		log.logInfo("Response Header Content Type : "+contentType)
		assertThat(response.getHeaderFields().get('Content-Type').toString()).isEqualTo('[application/json]')
		log.logInfo("Content type verified")
		return time
	}
	
	
	//to check if the error got as response
	public static void apiErrorCheck(){
		if(response.getResponseBodyContent().contains("error"))
		log.logFailed("API request is not processed")
	}

	@Keyword
	public void loginIntoArcApplication() {
		//response from the api
		response = WS.sendRequest(findTestObject('Login/AuthorizationAPI'))
		apiErrorCheck()
		printLog("Startig Test", "Login Authorization")
		WS.verifyResponseStatusCode(response, 200)
		statusCode(response.getStatusCode().toString())
		String token= response.getResponseText()
		float time =printHeaderValues(response)
		JSONObject jsonObj = new JSONObject(response.getResponseText())
		Iterator<?> keys = jsonObj.keys();
		while(keys.hasNext() ) {
			String key = (String)keys.next()
			println key
		}
		printLog("Authorization Token generated : "+ jsonObj.get("token"))
		printLog("API Response Data ", response.getResponseBodyContent())
		GlobalVariable.token="Basic "+jsonObj.get("token")
		writeReportToExcel(GlobalVariable.sheetName, GlobalVariable.rowNumTwo, time.toString(),response.getStatusCode() ,"Generate Authentication Token")

	}

	public static writeReportToExcel(String sheetName, int rowNum, String responseTime, int statusCode, String description){
		String testStatus= getStatus(statusCode)
		short testColor= getColor(testStatus)
		leedReportSheet.setCellData(sheetName, "ResponseTime (MilliSeconds)", rowNum, responseTime);
		leedReportSheet.setCellData(sheetName, "Status", rowNum, testStatus, fontWhite,testColor);
		leedReportSheet.setCellData(sheetName, "Description", rowNum, description);
	}


	public static String getStatus(int statusCode) {
		if(statusCode == 200) {
			return "Pass";
		}else {
			return "Need Discussion";
		}
	}

	public static short getColor(String status) {
		if(status == "Pass") {
			return Green;
		}else {
			return Yellow;
		}
	}




}
