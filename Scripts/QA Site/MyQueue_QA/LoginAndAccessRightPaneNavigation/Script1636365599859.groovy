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

WebUI.navigateToUrl('http://ph247irisqa/applicare/#/Login')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/input_Username_form-control ng-untouched ng_a05516'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/button_Login'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/li_All Applicants'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A20219926823')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/a_schoolProfessional Qualification'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/a_work_outlineEmployment Summary'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/a_fact_checkFinalize Assessment'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAccessRightPaneNavigation/Page_Applicare/a_facePersonal Information'))
