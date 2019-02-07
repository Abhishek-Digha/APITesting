import org.openqa.selenium.WebDriver
import org.testng.annotations.BeforeMethod

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownIfError
import com.kms.katalon.core.annotation.TearDownIfPassed
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class MasterTestListener extends BaseClass {
	
	public String testCaseName
	public String result
	public String[]  testSuiteId 
	String flag
	String Country
	int count
	public static int count1
	public static String [] testName
	public static String apiTestCaseName
	public static rowNum=2
	@SetUp
	void Setup() {		
		
	}
	
	@BeforeTestSuite
	public void beforeTestSuiteListener(TestSuiteContext testSuite)
	{
			
		println "This is before Test Suit"
		println("Before Test Suite Listener : " + testSuite.getTestSuiteId())
		testSuiteId = testSuite.getTestSuiteId().split("/")
		count= testSuiteId.size()
	}
	
	
	@BeforeTestCase
	public void beforeTestListener(TestSuiteContext testSuite)
	{
		
		println testSuiteId[count-1]
		
	}
	
	@BeforeMethod
	public void beforeTestMethod(TestCaseContext testCase)
	{

	}
	
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
	
		testName = testCaseContext.getTestCaseId().split("/")
		count1 =testName.size()
		leedReportSheet.setCellData(GlobalVariable.sheetName, "RestServiceName", rowNum, testName[count1-1]);
		rowNum+1;
		}
	
	
	@TearDown
	void TearDown(TestCaseContext testCase){
	   println("[--- This is Tear Down Method    1111---]")
        
	   println testCase.getTestCaseStatus()		
	}
	
	
	@TearDownIfPassed
	void TearDownOnPass(){
		println("[--- This is Tear Down Method on Pass ---]")
	}
	
	@TearDownIfError
	void TearDownOnError(){
		println("[--- This is Tear Down Method on Error ---]")
	}
	
	@AfterTestCase
	public void afterTestCase(TestCaseContext testCase){
		KeywordUtil.markWarning("Test Case Name : " + testCase.getTestCaseId())
		KeywordUtil.markWarning("Test Case Status : " + testCase.getTestCaseStatus())

		result = testCase.getTestCaseStatus()
		testName = testCase.getTestCaseId().split("/")
		count1 =testName.size()
		println count1
		println testName[count1-1]
		testCaseName=testName[count1-1]
	}
	
	@AfterTestSuite
	public void afterTestSuite(TestSuiteContext testSuite){
		KeywordUtil.markWarning("After Test Suite Listener : " + testSuite.getTestSuiteId())
		
	
	}
	
}