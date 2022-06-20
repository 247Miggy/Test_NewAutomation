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

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/button_Login'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A20217926636')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/mat-icon_launch'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Birth Date_dateOfBirth'), '03/01/1990')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/main_face Personal Information Last NameSuf_d73993'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Primary Email_email'), 
    'jose.sanchez@247-inc.com')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Jobstreet.com'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'link')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/a_LinkedIn'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Lot, Block, Street_permanentBlockLotH_ed3606'), 
    'test street')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Subdivision, Barangay_permanentSubdiv_7aa789'), 
    'test barangay')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select city of residence'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_City of Residence_ngx-select__search _9e85b7'), 
    'pas')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/li_Pasay City'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_Pasay City'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Lot, Block, Street_presentBlockLotHou_865d61'), 
    'test street')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Subdivision, Barangay_presentSubdivis_4d25fb'), 
    'test barangay')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select city of residence'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_City of Residence_ngx-select__search _9e85b7'), 
    'pasig')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_Pasig City'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_BachelorsCollege Degree'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_BachelorsCollege Degree'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select a school'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_School_ngx-select__search form-control'), 
    'adam')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_Adamson University'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select a course'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Course_ngx-select__search form-control'), 
    'information')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_BS in Information Technology'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_Date Graduated_dateGraduated'), 
    '03/29/2013')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select a segment'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_Experienced Agent (6 months Internatio_93675d'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/button_Yes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/button_Yes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select call center exp'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_6 months or less'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/button_OK'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Success  Personal Information has been updated'), 
    0)

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select call center exp'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_6 months or less'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/button_OK'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Success  Professional Qualification has_2e36c9'), 
    0)

