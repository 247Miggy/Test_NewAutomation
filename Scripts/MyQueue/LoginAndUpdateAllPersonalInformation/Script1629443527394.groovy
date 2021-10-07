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

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/span_Login'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A20217926654')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/mat-icon_launch'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Last Name_lastName'), 
    'Richarded')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_First Name_firstName'), 
    'Barbaraed')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/div_Single'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/span_Married'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/button_Male'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Primary Mobile Number_primaryMobileNumber'), 
    '918353158')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/main_face Personal Information Last NameSuf_828dd8'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Primary Mobile Number_primaryMobileNumber'), 
    '918353158')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Secondary Mobile Number_secondaryMobi_a43af4'), 
    '918353851')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/main_face Personal Information Last NameSuf_828dd8'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Primary Email_email'), 
    'jose.sanchez@247-inc.com')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Lot, Block, Street_permanentBlockLotH_ed3606'), 
    'test street1')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Subdivision, Barangay_permanentSubdiv_7aa789'), 
    'test barangay1')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select city of residence'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_City of Residence_ngx-select__search _9e85b7'), 
    'pasa')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_Pasay City'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Lot, Block, Street_presentBlockLotHou_865d61'), 
    'test street2')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/input_Subdivision, Barangay_presentSubdivis_4d25fb'), 
    'test barangay2')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/div_Select city of residence'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/input_City of Residence_ngx-select__search _9e85b7'), 
    'pasig')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndRequiredFields2/Page_Applicare/span_Pasig City'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndUpdateAllPersonalInformation/Page_Applicare/button_OK'))

