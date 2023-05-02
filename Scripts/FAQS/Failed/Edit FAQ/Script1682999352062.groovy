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
WebUI.setText(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik login'
WebUI.click(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/button_Login'))

'Mengklik menu FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/a_FAQ'))

'Membuka halaman list Faq'
WebUI.getText(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/div_List FAQs BliCicil Admin as            _3c8d92'))

WebUI.delay(5)

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/a_3'))

WebUI.delay(5)

'Mengklik button edit pada salah satu FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/a_Edit'))

'Membuka halaman edit FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/div_Edit FAQs BliCicil Admin as'))

'Mengosongkan judul / pertanyaan FAQ'
WebUI.setText(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/input_Judul_txtProductName'), '')

'Deskripsi tetap terisi'
WebUI.getText(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/div_Deskripsi                              _179ac0'))

WebUI.delay(5)

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/button_Submit'))

'Menampilkan popup erorr message'
WebUI.getText(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/div_ErrorThe title field is required.OKNoCancel'))

WebUI.delay(5)

'Merefresh halaman add'
WebUI.refresh()

'Meengganti / menambahkan isi deskripsi FAQ'
WebUI.setText(findTestObject('FAQS/Success/Edit FAQ/p_yayaaaa'), '')

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/FAQS/Failed/Edit FAQ/button_Submit'))

'Menampilkan popup erorr message'
WebUI.getText(findTestObject('FAQS/Failed/Edit FAQ/div_ErrorThe description field is required.OKNoCancel'))

'Disamping kanan ada kolom untuk Detail FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Success/Edit FAQ/div_Detail FAQs'))

'Kolom detail FAQ berisi : Release Date Konten FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Success/Edit FAQ/th_Release Date'))

'Kolom detail FAQ berisi : Author Konten FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Success/Edit FAQ/th_Author'))

'Kolom detail FAQ berisi :  Views Konten FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Success/Edit FAQ/th_Views'))

'Kolom detail FAQ berisi :  Last Update Konten FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Success/Edit FAQ/th_Last Update'))

'Kolom detail FAQ berisi :  Status Konten FAQ [Publish / Unpublish]'
WebUI.getText(findTestObject('Object Repository/FAQS/Success/Edit FAQ/th_Status'))

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

