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

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/button_Login'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/li_All Applicants'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A20217926635')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/button_Clone to another application'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/div_Select Position Type'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/a_Agent'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/div_Select Position Applied For'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/span_Customer Service Representative'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/textarea_Remarks_remarks'), 
    'Test Remarks')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndCloneAHtoNAH/Page_Applicare/button_Recommend'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/button_OK'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/button_OK'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Applicare_MyQueue/LoginAndCloneNAHtoAH/Page_Applicare/div_Success  The application has been succe_ca16f8'), 
    FailureHandling.CONTINUE_ON_FAILURE)

