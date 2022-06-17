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

WebUI.navigateToUrl('https://ph247irisqa.247-inc.com/applicare/#/Apps')

WebUI.setText(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/input_Username_form-control ng-untouched ng_a05516'), 
    'P24717737')

WebUI.setEncryptedText(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.doubleClick(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/span_Leads Management'))

WebUI.click(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/button_Filtered (3)'))

WebUI.click(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/li_Possible Duplicate'))

WebUI.click(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/li_Incomplete'))

WebUI.setText(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'Ortil')

WebUI.click(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/button_Sep-09-2021 - Sep-16-2021'))

WebUI.click(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/span_Sep-09-2021 - Sep-16-2021_ngb-dp-navig_c9a922'))

WebUI.click(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/span_1'))

WebUI.click(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/span_30'))

WebUI.verifyElementVisible(findTestObject('Applicare_LeadsManagement/LoginAndSearchNameSourceValidation/td_Ortil, Gorry  D'))

