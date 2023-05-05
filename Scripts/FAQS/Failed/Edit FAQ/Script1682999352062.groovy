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
WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQ Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Edit FAQ Failed/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik login'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ Failed/button_Login'))

'Mengklik menu FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ Failed/a_FAQ'))

'Membuka halaman list Faq'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ Failed/div_List FAQs BliCicil Admin as            _3c8d92'))

WebUI.delay(5)

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ Failed/a_3'))

WebUI.delay(5)

'Mengklik button edit pada salah satu FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ Failed/a_Edit'))

'Membuka halaman edit FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ Failed/div_Edit FAQs BliCicil Admin as'))

'Mengosongkan judul / pertanyaan FAQ'
WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQ Failed/input_Judul_txtProductName'), '')

'Deskripsi tetap terisi'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ Failed/div_Deskripsi                              _179ac0'))

WebUI.delay(5)

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ Failed/button_Submit'))

'Menampilkan popup erorr message'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ Failed/div_ErrorThe title field is required.OKNoCancel'))

WebUI.delay(5)

'Merefresh halaman add'
WebUI.refresh()

'Meengganti / menambahkan isi deskripsi FAQ'
WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ Failed/button_Submit'))

'Menampilkan popup erorr message'
WebUI.getText(findTestObject('FAQS/Edit FAQ Failed/div_ErrorThe description field is required.OKNoCancel'))

'Disamping kanan ada kolom untuk Detail FAQ'
WebUI.getText(findTestObject('null'))

'Kolom detail FAQ berisi : Release Date Konten FAQ'
WebUI.getText(findTestObject('null'))

'Kolom detail FAQ berisi : Author Konten FAQ'
WebUI.getText(findTestObject('null'))

'Kolom detail FAQ berisi :  Views Konten FAQ'
WebUI.getText(findTestObject('null'))

'Kolom detail FAQ berisi :  Last Update Konten FAQ'
WebUI.getText(findTestObject('null'))

'Kolom detail FAQ berisi :  Status Konten FAQ [Publish / Unpublish]'
WebUI.getText(findTestObject('null'))

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

