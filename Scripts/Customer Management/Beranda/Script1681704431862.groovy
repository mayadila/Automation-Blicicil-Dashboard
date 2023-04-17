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

'Membuka Chrome'
WebUI.openBrowser('')

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password'
WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Sukses/button_Login'))

'Mengklik menu customer management'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/span_Customer Management'))

'Mengklik button angka page'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_4'))

'Mengklik button page "Prev"'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_Prev'))

'Mengklik button page "Next"'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_Next'))

'Mengklik dropdown Show baris table '
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Beranda/select_5                                   _cfa6f0'), 
    '10', true)

'Mengklik dropdown show baris tabel'
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Beranda/select_5                                   _cfa6f0'), 
    '25', true)

'Mengklik button angka page'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_3'))

'Mengklik button page "Prev"'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_Next'))

'Mengklik button page Next'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Beranda/a_Prev'))

WebUI.waitForPageLoad(60)

'Menutup chrome'
WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

