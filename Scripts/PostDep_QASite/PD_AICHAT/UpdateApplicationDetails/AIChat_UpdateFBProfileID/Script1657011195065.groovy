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

WebUI.navigateToUrl('https://ph-chat.247-inc.com/ChatbotAIQA/Identity/Account/Login/')

WebUI.setText(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/input_Employee Id_Input.Email'), 
    ' P2471773')

WebUI.setEncryptedText(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/input_Password_Input.Password'), 
    'nB2dBQqcd2EcVwPhuqgMuQ==')

WebUI.click(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/button_Log in'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/input_Logout_nameSearch'), 
    'Ivica')

WebUI.setText(findTestObject('PostDeployment/AI_Chat/AIChat_Date/Page_247.ai Chat/input_Not Qualified Vaccination Requirement_fromDate'), 
    '30/6/2022')

WebUI.setText(findTestObject('PostDeployment/AI_Chat/AIChat_Date/Page_247.ai Chat/input_Not Qualified Vaccination Requirement_toDate'), 
    '01/07/2022')

WebUI.click(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/button_Filter'))

WebUI.click(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/p_Ivica Zubac                              _8858f6'))

WebUI.setText(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/input_FB Profile Id_leads.FBProfileId'), 
    'Testsample')

WebUI.click(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/PostDeployment/AI_Chat/Update_ApplicationDetails/FBProfileId/Page_247.ai Chat/input_Are you sure you want to update the a_914883'))

