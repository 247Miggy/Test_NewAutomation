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

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/button_Login'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/span_ADVANCED'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d'), 
    'Rodriquez')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueue_Filter/LoginAndSearchByApplicantName/Page_Applicare/td_Rodriquez, Derek  N'))

