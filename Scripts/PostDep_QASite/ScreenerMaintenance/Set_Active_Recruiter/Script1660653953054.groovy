import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ph247irisqa.247-inc.com/applicare/#/Login')

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setEncryptedText(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2HH1jA4cQPLYA==')

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_Applicare/button_Login'))

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_Applicare/a_manage_accountsPTrack'))

WebUI.navigateToUrl('https://ph247irisqa.247-inc.com/webportal/MemberPages/CBMG/ApplicantTracking/PeopleTrack/PeopleTrack.aspx')

WebUI.switchToWindowTitle('Applicare')

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_247 IRIS - People Track/a_Table Administration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_247 IRIS - Table Administration/select_ApplicantTracking_BIResultsApplicant_b64b89'), 
    'CBMG_UserGroups', true)

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_247 IRIS - Table Administration/a_Select'))

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_247 IRIS - Table Administration/input_Is Active_dvCBMG_UserGroupsbtnEdit'))

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_247 IRIS - Table Administration/input_Is Active_dvCBMG_UserGroupsctl01'))

WebUI.click(findTestObject('Object Repository/PostDeployment/ScreenerMaintenance/Set_Active_Recruiter/Page_247 IRIS - Table Administration/input_Is Active_dvCBMG_UserGroupsbtnUpdate'))

