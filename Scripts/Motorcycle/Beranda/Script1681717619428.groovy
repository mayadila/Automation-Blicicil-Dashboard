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

'Membuka chrome'
WebUI.openBrowser('')

WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginput password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Motorcycle/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/button_Login'))

'Mengklik menu transaction'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Transaction'))

'Mengklik submenu motorcycle'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Motorcycle'))

'Mengklik ikon dropdown detail transaksi nmc'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/svg_Proses_rotate-icon-61e28a1d1dac201b017d5bf7'))

'Mengklik ikon dropdown detail transaksi nmc'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/svg_Ditolak_rotate-icon-61e4c8d1b4aaa3728e4c8e32'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_5'))

'Mengklik ikon dropdown detail transaksi nmc'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/svg_Dibatalkan_rotate-icon-6205c2f4da21d203_9f5933'))

'Mengklik button Prev Page'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Previous'))

'Mengklik ikon dropdown detail transaksi nmc'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/svg_Selesai_rotate-icon-62048ea3dc1625770b4d67f5'))

'Mengklik button Next Page'
WebUI.click(findTestObject('Object Repository/Motorcycle/Beranda/a_Next'))

WebUI.refresh()

'Menutup chrome'
WebUI.closeBrowser()

