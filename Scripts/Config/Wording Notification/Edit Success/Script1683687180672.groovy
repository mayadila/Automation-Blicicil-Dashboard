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

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Edit Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Config/Wording Notification/Edit Success/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Success/button_Login'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Success/a_Config'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Success/span_Wording Notification'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Success/a_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Success/a_Edit'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Edit Success/div_Edit Wording Notification BliCicil Admin as'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Edit Success/input_Title_txtTitle'), 'Pengujian Wording Error')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Edit Success/textarea_uji wordings'), 'Error EKYC')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Success/button_Submit'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Success/div_SuccessOKNoCancel'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Success/a_2'))

WebUI.delay(10)

WebUI.closeBrowser()

