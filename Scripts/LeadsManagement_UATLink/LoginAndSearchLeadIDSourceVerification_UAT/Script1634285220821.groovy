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

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setText(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2HH1jA4cQPLYA==')

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/button_Login'))

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/a_supervised_user_circleLeads Management'))

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/button_Filtered (3)'))

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/li_Possible Duplicate'))

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/li_Incomplete'))

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/span_ADVANCED'))

WebUI.setText(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d'), 
    '817645')

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/button_Sep-09-2021 - Sep-16-2021'))

WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/span_Sep-09-2021 - Sep-16-2021_ngb-dp-navig_c9a922'))

'Date Selection From'
WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/span_1'))

'Date Selection To\r\n'
WebUI.click(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/span_30'))

'Display Lead ID'
WebUI.verifyElementVisible(findTestObject('Object Repository/Applicare_LeadsManagement/LoginAndSearchLeadIDSourceVerification/Page_Applicare/td_817645'))

