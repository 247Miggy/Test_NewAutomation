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

WebUI.navigateToUrl('https://ph247iris.247-inc.com/staging-applicare/#/Login')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/div_UsernamePasswordLoginForgot Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2HH1jA4cQPLYA==')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/button_Login'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A202191379787')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/li_feedAssessments'))

'https://gis-lin-stage.247-inc.com/SpringboardPHI/login.htm?token=1F8BB67285AA4A429A9DD05C37B6E2FB'
WebUI.click(findTestObject('Applicare_MyQueue/MyQueueAssessment/ClickCBI/Page_Applicare/button_visibility'))

WebUI.switchToWindowTitle('[24]7 SPRINGBOARD')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/div_Springboard IdPC00000329 ROPES IdROPES0_c36f6a'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Part - 1 Agent Hiring  - JOB FIT_p_b89366'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Part - 1 Agent Hiring  - JOB FIT_p_6598ba'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Part - 1 Agent Hiring  - JOB FIT_p_6abfff'), 
    'test1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/td_Part - 2 Agent Hiring  - MOTIVATIONAL FIT'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Part - 2 Agent Hiring  - MOTIVATIO_781dcf'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Part - 2 Agent Hiring  - MOTIVATIO_89e382'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Motivation - Desire to performDriv_3e4112'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/td_Part - 3 AH - COMPENSATION (Rate fields _a79fb5'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Previous Pay (Basic Pay and allowa_5cd1b4'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Expected Pay (Basic Pay and allowa_e0fc47'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/td_Part - 4 AH - PREFERRED PHONE NAMES (Rat_02d02b'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Names 1-3_part4comment1'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Operational Excellence(Customer De_d9573d'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8_9'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Strategic Thinking(Process Perfect_9f8121'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8_9_10'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Leadership Excellence(Employee Cha_13115b'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8_9_10_11'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Planning  Organizing(Passion to Ou_7e9b42'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/td_Part - 6 Non Agent Hiring - OverAll Fit'))

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Work Experience_part6comment1'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Motivation Fit_part6comment2'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Job Fit_part6comment3'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea_Communication skills_part6comment4'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--No ScoreDoes Not Meet Expe_7d1cb9_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea__strengthsComments'), 
    'test strengths')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea__afiComments'), 
    'test AFI')

WebUI.setText(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/textarea__overAllComment'), 
    'test Comments')

WebUI.selectOptionByValue(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/select_--Select--PassedFailed'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/button_Submit'))

'Display Scored Successfully'
WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_247 SPRINGBOARD/button_Yes'))

WebUI.navigateToUrl('https://ph247iris.247-inc.com/staging-applicare/#/Apps/ApplicationView/900813/563502')

WebUI.switchToWindowTitle('Applicare')

WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/li_feedAssessments'))

'Display CBI Status'
WebUI.click(findTestObject('Object Repository/Applicare_MyQueue/MyQueueAssessment/Assess CBI/Page_Applicare/div_CBI On going'))

