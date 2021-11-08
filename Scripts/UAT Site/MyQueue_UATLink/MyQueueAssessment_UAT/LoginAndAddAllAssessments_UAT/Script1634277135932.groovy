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

WebUI.setText(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/input_Username_form-control ng-untouched ng_a05516'), 
    'P24717737')

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setEncryptedText(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2HH1jA4cQPLYA==')

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/span_Login'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/li_All Applicants'))

WebUI.setText(findTestObject('Applicare_MyQueue/LoginAndViewStatusLogs/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A2021111379894')

WebUI.click(findTestObject('Applicare_MyQueue/LoginAndViewStatusLogs/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/li_feedAssessments'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/button_Add new assessmentadd'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/i_Add new assessment_dropdown-toggle'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/a_CBI'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/mat-icon_add'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/div_Success  The new assessment has been saved'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/i_Add new assessment_dropdown-toggle_1'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/a_Furst Person'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/mat-icon_add'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/div_Success  The new assessment has been saved'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/i_Add new assessment_dropdown-toggle_1_2'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/a_Berlitz'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/mat-icon_add'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/div_Success  The new assessment has been saved'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/div_Add new assessment'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/a_DABA'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/mat-icon_add'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/div_Success  The new assessment has been saved'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/i_Add new assessment_dropdown-toggle_1_2'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/a_OCA'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/mat-icon_add'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/div_Success  The new assessment has been saved'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/span_Add new assessment_ngx-select__toggle-buttons'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/span_Workspace Readiness Survey'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/mat-icon_add'))

WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/LoginAndAddAllAssessments/Page_Applicare/div_Success  The new assessment has been saved'))

