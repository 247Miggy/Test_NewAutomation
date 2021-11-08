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

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Username_form-control ng-untouched ng_a05516'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/button_Login'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A20217926650')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/button_Add Work Experience add'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Position Title_positionTitle'), 
    'Test Position 1')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Company_company'), 
    'Test Company 1')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/div_Select an industry'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/span_Transport, Storage  Communication'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Basic Pay_endingSalary'), 
    '13000')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Allowances_startingSalary'), 
    '1500')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Start Date_startDate'), 
    '07/02/2013')

//WebUI.sendKeys(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Start Date_startDate'), 
// Keys.chord(Keys.ENTER))
WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_End Date_endDate'), 
    '14/05/2015')

WebUI.sendKeys(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_End Date_endDate'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/div_Success  Employment summary has been updated'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/mat-icon_edit'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/textarea_Reason for Leaving_reasonForLeaving'), 
    'Test Reason for leaving')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/input_Days Rendered_daysRendered'), 
    '25')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/button_Save and Next'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Applicare_MyQueue/LoginAndAddEmploymentSummaryv2/Page_Applicare/div_Success  Employment summary has been updated'))

