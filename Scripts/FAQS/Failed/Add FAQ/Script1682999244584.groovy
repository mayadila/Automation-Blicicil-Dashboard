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

'Membuka halaman list FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Failed/div_List FAQs BliCicil Admin as            _3c8d92'))

'Mengklik menu Add FAQ'
WebUI.click(findTestObject('FAQS/Add FAQ Failed/span_New FAQ'))

WebUI.delay(5)

'Tidak menginputkan judul / pertanyaan FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Failed/div_Judul'))

'Tidak menginputkan deskripsi FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Failed/div_Deskripsi                              _57f324'))

WebUI.delay(5)

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Failed/button_Submit'))

'Menmapilkan popup alertnya'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Failed/div_ErrorThe title field is required.OKNoCancel'))

WebUI.delay(5)

'Menginputkan judul / pertanyaan FAQ'
WebUI.setText(findTestObject('Object Repository/FAQS/Add FAQ Failed/input_Judul_txtProductName'), 'hanya saja')

'Tidak menginputkan deskripsi FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Failed/div_Deskripsi                              _57f324'))

WebUI.delay(5)

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Failed/span_Submit'))

'Menmapilkan popup alertnya'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Failed/div_ErrorThe description field is required._797e22'))

WebUI.delay(5)

'Tidak menginputkan judul / pertanyaan FAQ'
WebUI.clearText(findTestObject('Object Repository/FAQS/Add FAQ Failed/input_Judul_txtProductName'))

'Mendeklarasi isi inputan di deskripsi'
def txaContent = 'DDDD'

'Menginputkan isi deskripsi'
WebUI.setText(findTestObject('FAQS/Add FAQ Failed/p'), txaContent)

'Mendapatkan atribut inputan deskripsinya'
input_Value = WebUI.getAttribute(findTestObject('FAQS/Add FAQ Failed/p'), 'value')

WebUI.delay(5)

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Add FAQ Failed/span_Submit'))

'Menmapilkan popup alertnya'
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQ Failed/div_ErrorThe title field is required.OKNoCancel'))

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

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

