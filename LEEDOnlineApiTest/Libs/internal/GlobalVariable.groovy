package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p>Profile QAS-US : Explicit Wait Timeout
Profile STG-US : Explicit Wait Timeout</p>
     */
    public static Object timeOut
     
    /**
     * <p></p>
     */
    public static Object env
     
    /**
     * <p>Profile QAS-US : Adding US projects</p>
     */
    public static Object BuildingSheet
     
    /**
     * <p>Profile QAS-US : Adding new team member </p>
     */
    public static Object BuildingTeam
     
    /**
     * <p>Profile QAS-US : Adding Credit Card payment details </p>
     */
    public static Object CCPayment
     
    /**
     * <p></p>
     */
    public static Object rowNumTwo
     
    /**
     * <p></p>
     */
    public static Object rowNumThree
     
    /**
     * <p></p>
     */
    public static Object rowNumFour
     
    /**
     * <p></p>
     */
    public static Object rowNumFive
     
    /**
     * <p></p>
     */
    public static Object rowNumSix
     
    /**
     * <p></p>
     */
    public static Object CitySheet
     
    /**
     * <p></p>
     */
    public static Object CommunitySheet
     
    /**
     * <p></p>
     */
    public static Object CDataInput
     
    /**
     * <p></p>
     */
    public static Object PortfoliosSheet
     
    /**
     * <p></p>
     */
    public static Object rowNumSeven
     
    /**
     * <p></p>
     */
    public static Object rowNumEight
     
    /**
     * <p></p>
     */
    public static Object BDataInput
     
    /**
     * <p>Profile QAS-US : Team Member QAS
Profile STG-US : Team Member STG</p>
     */
    public static Object TeamMember
     
    /**
     * <p></p>
     */
    public static Object adminUrl
     
    /**
     * <p></p>
     */
    public static Object adminUserName
     
    /**
     * <p></p>
     */
    public static Object adminPassword
     
    /**
     * <p>Profile QAS-US : old score version project of Building
Profile STG-US : old score version of Buiding</p>
     */
    public static Object rowNumNine
     
    /**
     * <p></p>
     */
    public static Object teamMemName
     
    /**
     * <p></p>
     */
    public static Object ExcelTemplateData
     
    /**
     * <p></p>
     */
    public static Object TemplateEnergyData
     
    /**
     * <p></p>
     */
    public static Object TemplateWaterData
     
    /**
     * <p></p>
     */
    public static Object TeamMemberPassword
     
    /**
     * <p></p>
     */
    public static Object TemplateWasteData
     
    /**
     * <p>Profile QAS-US : Old score version project of Transit
Profile STG-US : old score version of Transit</p>
     */
    public static Object rowNumTen
     
    /**
     * <p></p>
     */
    public static Object AllProjectUrl
     
    /**
     * <p>Profile QAS-US : Human Experience and Transportation</p>
     */
    public static Object TemplateHE
     
    /**
     * <p></p>
     */
    public static Object appUrl
     
    /**
     * <p></p>
     */
    public static Object rowNumEleven
     
    /**
     * <p>Profile STG-US : payment via credit card</p>
     */
    public static Object cardPayment
     
    /**
     * <p></p>
     */
    public static Object checkPayment
     
    /**
     * <p>Profile STG-US : Certified project</p>
     */
    public static Object rowNumTwentyOne
     
    /**
     * <p>Profile STG-US : Certified Transit Abovegroun Project</p>
     */
    public static Object rowNumTwentyTwo
     
    /**
     * <p></p>
     */
    public static Object notCertified
     
    /**
     * <p>Profile STG-US : New Added Project</p>
     */
    public static Object rowNumTwentyThree
     
    /**
     * <p></p>
     */
    public static Object LEEDURL
     
    /**
     * <p></p>
     */
    public static Object sheetName
     
    /**
     * <p></p>
     */
    public static Object token
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('QAS-US', allVariables['default'] + ['url' : 'http://www.qas.arconline.io/', 'userName' : 'usgbcarc@gmail.com', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'USBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'USCityProject', 'CommunitySheet' : 'USCommunityProject', 'CDataInput' : 'CDataInput', 'PortfoliosSheet' : 'Portfolio', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'BDataInput' : 'BDataInput', 'TeamMember' : 'qas-02@gmail.com', 'adminUrl' : 'qas.app.arconline.io/admin', 'adminUserName' : 'qasgbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'teamMemName' : 'ARC USGBC', 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TeamMemberPassword' : 'initpass', 'TemplateWasteData' : 'Waste', 'rowNumTen' : 10, 'AllProjectUrl' : 'https://qas.app.arconline.io/app/projects/my-projects/?project-type=all', 'TemplateHE' : 'HumanExp', 'appUrl' : 'https://qas.app.arconline.io/', 'rowNumEleven' : 11, 'cardPayment' : 'creditCard', 'checkPayment' : 'check'])
        allVariables.put('STG-US', allVariables['default'] + ['url' : 'https://leedonline-api-stg.usgbc.org/v1/json', 'userName' : 'newserver2@gmail.com', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/ArcTest.xlsx', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'rowNumSeven' : 7, 'rowNumEight' : 8, 'BDataInput' : 'BDataInput', 'TeamMember' : 'stg-01@gmail.com', 'adminUrl' : 'stg.app.arconline.io/admin', 'adminUserName' : 'stggbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumTwentyOne' : 21, 'rowNumTwentyTwo' : 22, 'notCertified' : 'notCertified', 'rowNumTwentyThree' : 23, 'rowNumNine' : 9, 'teamMemName' : 'Saurav K', 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TeamMemberPassword' : 'initpass', 'TemplateWasteData' : 'Waste', 'rowNumTen' : 10, 'AllProjectUrl' : 'https://stg.app.arconline.io/app/projects/my-projects/?project-type=all', 'TemplateHE' : 'HumanExp', 'cardPayment' : 'creditCard', 'checkPayment' : 'check', 'appUrl' : 'https://stg.app.arconline.io', 'LEEDURL' : 'https://leedonline-stg.usgbc.org/', 'sheetName' : 'LEEDONLINE', 'token' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        url = selectedVariables["url"]
        userName = selectedVariables["userName"]
        password = selectedVariables["password"]
        timeOut = selectedVariables["timeOut"]
        env = selectedVariables["env"]
        BuildingSheet = selectedVariables["BuildingSheet"]
        BuildingTeam = selectedVariables["BuildingTeam"]
        CCPayment = selectedVariables["CCPayment"]
        rowNumTwo = selectedVariables["rowNumTwo"]
        rowNumThree = selectedVariables["rowNumThree"]
        rowNumFour = selectedVariables["rowNumFour"]
        rowNumFive = selectedVariables["rowNumFive"]
        rowNumSix = selectedVariables["rowNumSix"]
        CitySheet = selectedVariables["CitySheet"]
        CommunitySheet = selectedVariables["CommunitySheet"]
        CDataInput = selectedVariables["CDataInput"]
        PortfoliosSheet = selectedVariables["PortfoliosSheet"]
        rowNumSeven = selectedVariables["rowNumSeven"]
        rowNumEight = selectedVariables["rowNumEight"]
        BDataInput = selectedVariables["BDataInput"]
        TeamMember = selectedVariables["TeamMember"]
        adminUrl = selectedVariables["adminUrl"]
        adminUserName = selectedVariables["adminUserName"]
        adminPassword = selectedVariables["adminPassword"]
        rowNumNine = selectedVariables["rowNumNine"]
        teamMemName = selectedVariables["teamMemName"]
        ExcelTemplateData = selectedVariables["ExcelTemplateData"]
        TemplateEnergyData = selectedVariables["TemplateEnergyData"]
        TemplateWaterData = selectedVariables["TemplateWaterData"]
        TeamMemberPassword = selectedVariables["TeamMemberPassword"]
        TemplateWasteData = selectedVariables["TemplateWasteData"]
        rowNumTen = selectedVariables["rowNumTen"]
        AllProjectUrl = selectedVariables["AllProjectUrl"]
        TemplateHE = selectedVariables["TemplateHE"]
        appUrl = selectedVariables["appUrl"]
        rowNumEleven = selectedVariables["rowNumEleven"]
        cardPayment = selectedVariables["cardPayment"]
        checkPayment = selectedVariables["checkPayment"]
        rowNumTwentyOne = selectedVariables["rowNumTwentyOne"]
        rowNumTwentyTwo = selectedVariables["rowNumTwentyTwo"]
        notCertified = selectedVariables["notCertified"]
        rowNumTwentyThree = selectedVariables["rowNumTwentyThree"]
        LEEDURL = selectedVariables["LEEDURL"]
        sheetName = selectedVariables["sheetName"]
        token = selectedVariables["token"]
        
    }
}
