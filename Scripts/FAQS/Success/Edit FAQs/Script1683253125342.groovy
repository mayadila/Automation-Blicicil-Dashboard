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

WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQs Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Edit FAQs Success/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/button_Login'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/a_FAQ'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/a_3'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/a_Edit'))

WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQs Success/input_Judul_txtProductName'), 'Testing')

WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQs Success/p_DDDD'), 'DDDDD')

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/div_Detail FAQs'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/th_Release Date'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/th_Author'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/th_Views'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/th_Last Update'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/th_Status'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/button_Submit'))

WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQs Success/div_SuccessOKNoCancel'))

