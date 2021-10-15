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

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24732391')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2HH1jA4cQPLYA==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/button_Login'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A2021101379822')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/div_CBI Hire'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/a_JO Accepted'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/button_OK'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Status/LoginAndUpdateStatusToJOAccepted/Page_Applicare/button_Exit'))

