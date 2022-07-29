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

WebUI.navigateToUrl('https://careers-philippines.247-inc.com/qa-Ropes-Online')

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/span_-Select Site-'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/li_Cyber Sigma'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/span_-Select Position-'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/li_Customer Support Representative (Day Shift)'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/input_select_CompleteName.FirstName'), 
    'Sasuke')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/input_select_CompleteName.MiddleName'), 
    'A')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/input_I have no middle name_CompleteName.LastName'), 
    'Uchiha')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/input_select_CompleteName.FirstName'), 
    'Sasuke')

WebUI.setText(findTestObject('PostDeployment/SubmitAnApplication/RopesOnline_BirthdateandContactNo/Page_247 ROPES Online/input_I have no middle name_Birthdate.Birthdate'), 
    '03/03/1989')

WebUI.setText(findTestObject('PostDeployment/SubmitAnApplication/RopesOnline_BirthdateandContactNo/Page_247 ROPES Online/input_select_Contact.MobileNumber'), 
    '177931009')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/input_select_Contact.Email'), 
    'jose.sanchez@247-inc.com')

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/span_-Select Educational Attainment-'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/li_BachelorsCollege Degree'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/span_-Select Main Source-'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/li_Online'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/span_-Select Specific Source-'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/li_Bossjob'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/img_motorcycles_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/img_motorcycles_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/img_motorcycles_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/img_motorcycles_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/img_motorcycles_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/img_motorcycles_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/button_Verify'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/button_Verify'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_RopesOnline/Page_247 ROPES Online/button_Submit Application'))

