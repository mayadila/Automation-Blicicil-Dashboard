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

'menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/FAQS/Add FAQ Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Add FAQ Success/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Success/button_Login'))

'Mengklik menu FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Success/a_FAQ'))

'Mengklik button Add FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Success/span_New FAQ'))

'Menginputkan judul / pertanyaan FAQ'
WebUI.setText(findTestObject('Object Repository/FAQS/Add FAQ Success/input_Judul_txtProductName'), 'Testingss')

'Mendeklarasi isi inputan di deskripsi'
def txaContent = 'testing'

'Menginputkan isi deskripsi'
WebUI.setText(findTestObject('Object Repository/FAQS/Add FAQ Success/p'), txaContent)

'Mendapatkan atribut inputan deskripsinya'
input_Value = WebUI.getAttribute(findTestObject('Object Repository/FAQS/Add FAQ Success/p'), 'value')

'Mengklik button Submit'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Success/button_Submit'))

'Menutup chrome'
WebUI.closeBrowser()

