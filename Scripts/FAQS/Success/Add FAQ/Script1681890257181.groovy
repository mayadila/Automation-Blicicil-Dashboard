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

'Membuka halaman list FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/div_List FAQs BliCicil Admin as            _3c8d92'))

WebUI.delay(5)

'Mengklik button Add FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Success/span_New FAQ'))

'Membuka halaman Add FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/div_Add FAQs BliCicil Admin as'))

WebUI.delay(5)

'Menginputkan judul / pertanyaan FAQ'
WebUI.setText(findTestObject('Object Repository/FAQS/Add FAQ Success/input_Judul_txtProductName'), 'Testingss')

WebUI.delay(5)

'Mendeklarasi isi inputan di deskripsi'
def txaContent = 'DDDD'

'Menginputkan isi deskripsi'
WebUI.setText(findTestObject('Object Repository/FAQS/Add FAQ Success/p'), txaContent)

'Mendapatkan atribut inputan deskripsinya'
input_Value = WebUI.getAttribute(findTestObject('Object Repository/FAQS/Add FAQ Success/p'), 'value')

WebUI.delay(5)

'Menampilkan kolom detail FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/div_Detail FAQs'))

'Menampilkan tanggal release'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/th_Release Date'))

'Menampilkan author yang input FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/th_Author'))

'Menampilkan jumlah views FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/th_Views'))

'Menampilkan last update FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/th_Last Update'))

'Menampilkan status FAQ : Publish / Unpublish'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/th_Status'))

'Mengklik button Submit'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Success/button_Submit'))

'Menampilkan popup bahwa sukses ADD FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/div_SuccessOKNoCancel'))

'Meredirect ke halaman list FAQ setelah selesai ADD '
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Success/div_List FAQs BliCicil Admin as            _3c8d92'))

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

