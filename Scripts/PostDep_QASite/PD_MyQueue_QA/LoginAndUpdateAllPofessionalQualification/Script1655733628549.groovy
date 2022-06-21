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

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setEncryptedText(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/span_Login'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A20217926638')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/div_BachelorsCollege Degree'))

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_BachelorsCollege Degree'))

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select a school'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_School_ngx-select__search form-control'), 
    'adamson')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_Adamson University'))

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select a course'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Course_ngx-select__search form-control'), 
    'inform')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/span_BS in Information Technology'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/span_Experienced Agent (6 months Internatio_93675d'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/span_Experienced Agent (6 months Internatio_93675d'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/button_Yes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/button_Yes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/span_6 months or less'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/span_6 months or less'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/button_OK'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllProfessionalQualification/Page_Applicare/main_face Personal Information Last NameSuf_828dd8'))

