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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ph247iris.247-inc.com/staging-applicare/#/Login')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2HH1jA4cQPLYA==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/button_Login'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A2021111379888')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/li_feedAssessments'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/button_Add new assessmentadd'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/div_Add new assessment'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/a_OCA'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/mat-icon_add'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/div_Success  The new assessment has been saved'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/mat-icon_visibility'))

WebUI.navigateToUrl('https://ph247iris.247-inc.com/staging-oldiris/login.aspx?ReturnUrl=%2fstaging-oldiris%2fMemberPages%2fCBMG%2fApplicantTracking%2fPeopleTrack%2fOCAv4.aspx%3fApplicationId%3d563608&ApplicationId=563608')

WebUI.switchToWindowTitle('[24]7 Inc.')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_247 Inc/input_User Name_LoginView1Login1UserName'), 
    'P24717737')

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_247 Inc/input_Password_LoginView1Login1Password'), 
    'nB2dBQqcd2HH1jA4cQPLYA==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_247 Inc/input__LoginView1Login1LoginButton'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_3'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_b. Is always able to put the stress o_d6d43c'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_2'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_b. Negligible instances of redundanci_0eaf0e'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_3'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_a. Applicant transitions smoothly fro_127f72'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_3'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_a. Applicant does not stammer and may_c6951d'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/label_Endorsed to Berlitz'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/textarea_Remarks_txtRemarks'), 
    'test remarks')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Oral Communication Assessment/input_Remarks_btnSubmit'))

WebUI.navigateToUrl('https://ph247iris.247-inc.com/staging-applicare/#/Apps/ApplicationView/900896/563608')

WebUI.switchToWindowTitle('Applicare')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/li_feedAssessments'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndTakeOCAAssessment_UAT/Page_Applicare/div_OCA Passedvisibility'))

