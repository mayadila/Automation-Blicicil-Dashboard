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

WebUI.setText(findTestObject('Object Repository/Master Merchants/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Merchants/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/a_Merchants'))

WebUI.getText(findTestObject('Object Repository/Master Merchants/Beranda/div_List Merchant BliCicil Admin as        _d762cc'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/a_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/a_Previous'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/a_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/a_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/button_Hapus'))

WebUI.getText(findTestObject('Object Repository/Master Merchants/Beranda/div_Are you sure want to delete Testing 3YesNoNo'))

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/button_No'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/button_Hapus'))

WebUI.getText(findTestObject('Object Repository/Master Merchants/Beranda/div_Are you sure want to delete Testing 3YesNoNo'))

WebUI.click(findTestObject('Object Repository/Master Merchants/Beranda/button_Yes'))

WebUI.delay(10)

WebUI.closeBrowser()

