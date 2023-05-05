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

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/button_Login'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/span_Customer Management'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Beranda/div_List of Customers'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_Prev'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_Detail'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_Customer Management'))

WebUI.delay(10)

WebUI.closeBrowser()

