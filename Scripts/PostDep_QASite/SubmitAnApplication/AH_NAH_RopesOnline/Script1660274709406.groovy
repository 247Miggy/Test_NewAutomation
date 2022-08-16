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

WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/span_select'))

//WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/a_August 2022'))

//WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/a_2022'))

//WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/a_2020-2029'))

//WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/a_2000 - 2009'))

//WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/td_2000'))

//WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/td_Aug'))

//WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/a_12'))

//jQuery(function(){jQuery("#birthDate").kendoDatePicker({"format":"MM-dd-yyyy","min":new Date(1900,0,1,0,0,0,0),"max":new Date(2099,11,31,0,0,0,0)});});

//String js = 'document.querySelector("#birthDate").value = "03-03-1990";'
//WebUI.executeJavaScript(js, null)


String js = '''
 $("#birthDate").kendoMaskedTextBox({
       value: "03-03-1990"
});

 $("#txtShortFormMobile").kendoMaskedTextBox({
       value: "+63 9177777772"
});

'''
WebUI.executeJavaScript(js,null)
//String js = 'document.querySelector("#txtShortFormMobile").value = "+63 9177777772";'
//WebUI.executeJavaScript(js, null)


//jQuery(function(){jQuery("#txtShortFormMobile").kendoMaskedTextBox({"mask":"+63 \\9000000000","rules":{}});});


WebUI.click(findTestObject('Object Repository/PostDeployment/SubmitAnApplication/SubmitRopesOnline/Page_247 ROPES Online/input_select_Contact.MobileNumber'))

