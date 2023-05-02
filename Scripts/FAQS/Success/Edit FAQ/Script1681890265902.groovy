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

'Mazimize Windows Chrome'
WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQ/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Edit FAQ/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button Login'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/button_Login'))

'Mengklik menu FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/span_FAQ'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/a_3'))

'Mengklik button edit pada salah satu list kontent FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/a_Edit'))

'Membuka halaman edit FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/div_Edit FAQs BliCicil Admin as'))

WebUI.delay(5)

'Mengganti isi Judul FAQ'
WebUI.setText(findTestObject('Object Repository/FAQS/Edit FAQ/input_Judul_txtProductName'), 'Coba edit ya')

'Meengganti / menambahkan isi deskripsi FAQ'
WebUI.setText(findTestObject('FAQS/Edit FAQ/p_yayaaaa'), 'eDIT faq')

'Disamping kanan ada kolom untuk Detail FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/div_Detail FAQs'))

'Kolom detail FAQ berisi : Release Date Konten FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Release Date'))

'Kolom detail FAQ berisi : Author Konten FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Author'))

'Kolom detail FAQ berisi :  Views Konten FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Views'))

'Kolom detail FAQ berisi :  Last Update Konten FAQ'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Last Update'))

'Kolom detail FAQ berisi :  Status Konten FAQ [Publish / Unpublish]'
WebUI.getText(findTestObject('Object Repository/FAQS/Edit FAQ/th_Status'))

'Mengklik button submit untuk menyimpan perubahan konten FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/span_Submit'))

'Menampilkan popup Sukses untuk menyimpan'
WebUI.click(findTestObject('Object Repository/FAQS/Edit FAQ/div_SuccessOKNoCancel'))

'Meredirect ke halaman list FAQ setelah selesai ADD '
WebUI.getText(findTestObject('Object Repository/FAQS/Add FAQs/div_List FAQs BliCicil Admin as            _3c8d92'))

WebUI.delay(10)

WebUI.closeBrowser()

