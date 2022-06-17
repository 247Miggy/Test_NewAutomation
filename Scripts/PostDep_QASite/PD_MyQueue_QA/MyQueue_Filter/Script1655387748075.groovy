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

WebUI.navigateToUrl('https://ph247irisqa.247-inc.com/applicare/#/Login')

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_Username_form-control ng-untouched ng_694036'), 
    'P24717737')

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/div_escalator_warningApplicareUsernamePassw_006ffd'))

WebUI.setEncryptedText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/button_Login'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    'A2022616169175')

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/button_Assigned to Me'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/li_All Applicants'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/mat-icon_launch'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/button_Exit'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/span_ADVANCED'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/div_Applicaremenusupervised_user_circleLead_00831e_1'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_My Schedule_with-icon ng-untouched ng_575f4c'), 
    '')

WebUI.setText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d_1'), 
    'Lavine')

WebUI.sendKeys(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d_1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/div_Applicaremenusupervised_user_circleLead_00831e'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d_1_2'), 
    'Deogracias')

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/span_Select Application Date'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/button_Select Application Date_btn btn-link_8cca7e'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/button_Select Application Date_btn btn-link_8cca7e'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/button_Select Application Date_btn btn-link_8cca7e'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/span_1'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/span_6'))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/div_Applicaremenusupervised_user_circleLead_00831e_1_2'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d_1_2'), 
    '')

WebUI.setText(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d'), 
    '915488009')

WebUI.sendKeys(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/input_COLLAPSE_with-icon ng-untouched ng-pr_663e9d'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PostDeployment/My Queue/Filter/Page_Applicare/mat-icon_launch'))

WebUI.closeBrowser()
