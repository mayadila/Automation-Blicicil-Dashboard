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

WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQ/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Edit FAQ/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/button_Login'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/span_FAQ'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/a_3'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/a_Edit'))

WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/div_Edit FAQs BliCicil Admin as'))

WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQ/input_Judul_txtProductName'), 'Yayayayaya')

WebUI.setText(findTestObject('FAQS/Edit FAQ/p_yayaaaa'), 'Diganti ya')

WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/div_Detail FAQs'))

WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Release Date'))

WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Author'))

WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Views'))

WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Last Update'))

WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Status'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/span_Submit'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/div_SuccessOKNoCancel'))

