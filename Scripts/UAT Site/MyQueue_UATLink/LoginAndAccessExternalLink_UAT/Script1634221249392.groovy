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

WebUI.navigateToUrl('https://ph247iris.247-inc.com/staging-applicare/#/Apps')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/input_Username_form-control ng-untouched ng_a05516'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/input_Username_form-control ng-untouched ng_a05516'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2HH1jA4cQPLYA==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/span_Login'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/li_All Applicants'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A2021101379812')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/span_PTrack'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/span_Uploader'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/span_Export Template'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/span_Contract Approval'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/span_Approved Contract'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/span_ROPES BOS'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessExternalLinks/Page_Applicare/span_Springboard'))

