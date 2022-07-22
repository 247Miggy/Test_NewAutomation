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

WebUI.navigateToUrl('https://ph-chat.247-inc.com/ChatbotAIQA/applicationform/')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_First Name_FirstName'), 
    'Doppo')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Middle Name_MiddleName'), 
    'A')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Last Name_LastName'), 
    'Orochi')

WebUI.setText(findTestObject('PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Birth Date(MMDD YYYY)_Birthdate'), 
    '03/03/1989')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Mobile Number(09xxxxxxxxx)_PrimaryMob_06cc24'), 
    '09177931009')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Email Address_Email'), 
    'jose.sanchez@247-inc.com')

WebUI.selectOptionByValue(findTestObject('Page_Index - ISAppAIChatMVC/select_Select Highest Educational Attainmen_02ca02'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select Source247 Website247.ai Acade_38d7d0'), 
    '33', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select Position TitleTechnical Suppo_c1a2fe'), 
    '387', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select Vaccination DetailsFully Vacc_65b08a'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_FB Profile URL_FBProfileId'), 
    'SampleQA')

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/button_Next'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_you want to save these details_btnSubmitNext'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select Experience6 months or less 6 _dbdb46'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select SiteOrtigasCyber SigmaPampang_717d2b'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select type of travelYes - Public Tr_25318a'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Do you have your own Laptop or PC_HasLaptop'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Are you willing to work in shifting s_867183'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select sales experienceYes - BPOYes _ae6c4e'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select your preferred setupYes-TFOWF_75eb8f'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Are you amenable to do BOTH TrainWork_2b03c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/select_Select type of internetFixed LineMob_df847b'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_What is your current DOWNLOAD speed a_0f08af'), 
    '180')

WebUI.setText(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_What is your current UPLOAD speed as _a1c1cb'), 
    '90')

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Are you amenable to do BOTH TrainWork_2b03c1'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/button_Submit Application'))

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/AH_ApplicationForm/Page_Index - ISAppAIChatMVC/input_Are you amenable to do BOTH TrainWork_2b03c1'))

