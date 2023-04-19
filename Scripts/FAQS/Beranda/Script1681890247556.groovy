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

'Maximize Window'
WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/FAQS/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Login'))

'Mengklik menu FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/span_FAQ'))

'Membuka halaman List FAQ Blicicil\r\n'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/div_List FAQs BliCicil Admin as            _3c8d92'))

'Menampilkan table berisi : Question'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/th_Question'))

'Menampilkan table berisi : Answer'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/th_Answer'))

'Menampilkan table berisi : Status'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/th_Status'))

'Menampilkan table berisi : Action'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/th_Action'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_3'))

'Mengklik button Prev Page'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_Previous'))

'Mengklik button Next Page'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_Next'))

'Mengklik button Unpublish untuk menonaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Unpublish'))

'Menampilkan popup "Are you sure want to unpublish this" ?'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to unpublish this dat_a999af'))

'Mengklik button No "Jika tidak ingin menonaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_No'))

'Mengklik button Unpublish untuk menonaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Unpublish'))

'Menampilkan popup "Are you sure want to unpublish this" ?'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to unpublish this dat_a999af'))

'Mengklik button Yes "Jika ingin menonaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Yes'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_3'))

'Terdapat kolom pencarian\r\n'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/label_Search'))

'Menginputkan kata kunci dikolom pencarian'
WebUI.setText(findTestObject('Object Repository/FAQS/Beranda/input_Search_form-control form-control-sm'), 'NIK')

'Menekan tombol enter keyboard dikolom pencarian yang sudah terisi'
WebUI.sendKeys(findTestObject('Object Repository/FAQS/Beranda/input_Search_form-control form-control-sm'), Keys.chord(Keys.ENTER))

'Menginputkan kata kunci dikolom pencarian'
WebUI.setText(findTestObject('Object Repository/FAQS/Beranda/input_Search_form-control form-control-sm'), 'modal')

'Menekan tombol enter keyboard dikolom pencarian yang sudah terisi'
WebUI.sendKeys(findTestObject('Object Repository/FAQS/Beranda/input_Search_form-control form-control-sm'), Keys.chord(Keys.ENTER))

'Mengklik button Unpublish untuk menonaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Unpublish'))

'Menampilkan popup "Are you sure want to unpublish this" ?'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to unpublish this dat_a999af'))

'Mengklik button Yes "Jika ingin menonaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Yes'))

'Mengklik button Publish untuk mengaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Publish'))

'Menampilkan popup "Are you sure want to publish this" ?'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to publish this dataYesNoNo'))

'Mengklik button No "Jika tidak ingin mengaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_No'))

'Mengklik button Publish untuk mengaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Publish'))

'Menampilkan popup "Are you sure want to publish this" ?'
WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to publish this dataYesNoNo'))

'Mengklik button Yes "Jika ingin mengaktifkan FAQ'
WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Yes'))

'Merefresh halaman'
WebUI.refresh()

