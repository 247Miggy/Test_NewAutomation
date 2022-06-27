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

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setEncryptedText(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/span_Login'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A2022316168470')

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/span_Select civil status'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/a_Single'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/button_Female'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/main_face Personal Information Last NameSuf_def16e'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/input_Primary Mobile Number_primaryMobileNumber'), 
    '9177931009')

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/main_face Personal Information Last NameSuf_def16e'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/input_Primary Email_email'), 
    'jose.sanchez@247-inc.com')

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/span_Not Qualified for NAH, endorsed to AH'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/span_CBI Not Hire BehaviorAttitude'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/PostDeployment/MYQueueStatus/CBINotHire_BehaviorAttitude/Page_Applicare/button_OK'))

