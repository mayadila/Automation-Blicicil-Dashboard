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

'Maximize Window Chrome'
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Master Headline/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Headline/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Headline/Beranda/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Headline/Beranda/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Headline/Beranda/a_Headline'))

WebUI.getText(findTestObject('Object Repository/Master Headline/Beranda/div_List Headline BliCicil Admin as        _f528db'))

WebUI.getText(findTestObject('Object Repository/Master Headline/Beranda/th_Gambar'))

WebUI.getText(findTestObject('Object Repository/Master Headline/Beranda/th_Headline'))

WebUI.getText(findTestObject('Object Repository/Master Headline/Beranda/th_Kategori'))

WebUI.getText(findTestObject('Object Repository/Master Headline/Beranda/th_Action'))

WebUI.click(findTestObject('Object Repository/Master Headline/Beranda/a_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Headline/Beranda/a_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Headline/Beranda/a_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Headline/Beranda/a_Previous'))

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

