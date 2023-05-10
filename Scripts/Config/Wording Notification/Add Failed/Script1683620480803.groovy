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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/a_Config'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/a_Wording Notification'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/a_New Wording Message'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/input_Title_txtTitle'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/textarea_Desc_txtDesc'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/input_Location_txtLocation'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/div_ErrorThe Wording Title field is require_03ae6c'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/input_Title_txtTitle'), 'tes')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/textarea_Desc_txtDesc'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/input_Location_txtLocation'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/div_ErrorThe Wording Desc field is required_c86839'))

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/input_Title_txtTitle'), 'tesss')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/textarea_Desc_txtDesc'), 'testing')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/input_Location_txtLocation'), '')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Add Failed/div_ErrorThe Wording Location field is requ_33f913'))

WebUI.delay(10)

WebUI.closeBrowser()

