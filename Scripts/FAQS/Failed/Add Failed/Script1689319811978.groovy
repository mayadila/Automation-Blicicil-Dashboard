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

'Mazimize Windows Chrome'
WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/FAQS/Add FAQ Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Add FAQ Failed/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Failed/button_Login'))

'Mengklik menu FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Failed/a_FAQ'))

'Mengklik menu Add FAQ'
WebUI.click(findTestObject('FAQS/Add FAQ Failed/span_New FAQ'))

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Failed/button_Submit'))

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Failed/span_Submit'))

'Tidak menginputkan judul / pertanyaan FAQ'
WebUI.clearText(findTestObject('Object Repository/FAQS/Add FAQ Failed/input_Judul_txtProductName'))

'Mendeklarasi isi inputan di deskripsi'
def txaContent = 'DDDD'

'Menginputkan isi deskripsi'
WebUI.setText(findTestObject('FAQS/Add FAQ Failed/p'), txaContent)

'Mendapatkan atribut inputan deskripsinya'
input_Value = WebUI.getAttribute(findTestObject('FAQS/Add FAQ Failed/p'), 'value')

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Failed/span_Submit'))

'Menutup chrome'
WebUI.closeBrowser()

