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

WebUI.setText(findTestObject('Object Repository/Motorcycle/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Motorcycle/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/button_Login'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Transaction'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Motorcycle'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Next'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Next'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Next'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/svg_Dibatalkan_rotate-icon-620319cf2a632351_42c78f'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/svg_Proses_rotate-icon-61fbb2ba496976743b6869af'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Previous'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Previous'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/svg_Ditolak_rotate-icon-61e7c5ee8dca76747c46a867'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_1'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/svg_Proses_rotate-icon-61e448c0846f05431c6f30c5'))

WebUI.closeBrowser()

