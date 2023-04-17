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
WebUI.setText(findTestObject('Object Repository/Motorcycle/BerandaOld/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginput password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Motorcycle/BerandaOld/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/button_Login'))

'Mengklik menu transaction'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/a_Transaction'))

'Mengklik submenu motorcycle'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/a_Motorcycle'))

'Membuka halaman list motorcycle'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/h6_List Motorcycle Transaction BliCicil Admin as'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/a_10'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/a_7'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/a_3'))

'Mengklik button Next Page'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/a_Next'))

'Mengklik button Prev Page'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/a_Previous'))

'Menampilkan kolom tanggal - waktu transaksi'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/td_Jul 8 2022 - 1035AM'))

'Menampilkan kolom nomor aplikasi'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/td_-'))

'Menampilkan kolom nama customer'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/td_KURNIA RIADHI'))

'Menampilkan kolom nomor kontrak'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/td_BGRCB00182'))

'Menampilkan kolom Rp Item Value'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/td_30,000,000'))

'Status pengajuan nmc Selesai'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Selesai'))

'Mengklik ikon dropdown detail transaksi nmc'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/svg_Selesai_rotate-icon-628c89634a0767038c118b4f'))

'Menampilkan NIK, Member No, Member Origin'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Customer Profile                       _d6f12e'))

'Menampilkan NPP Date, DP, NFA, Admin Fee, Tenor, Installment'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Transaction Detail                     _6487e4'))

'Status pengajuan nmc dibatalkan'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Dibatalkan'))

'Mengklik ikon dropdown detail transaksi nmc'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/svg_Dibatalkan_rotate-icon-628d97fc4a076703_3487e6'))

'Menampilkan NIK, Member No, Member Origin'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Customer Profile                       _d04e85'))

'Menampilkan NPP Date, DP, NFA, Admin Fee, Tenor, Installment'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Transaction Detail                     _6487e4_1'))

'Status pengajuan nmc proses'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Proses'))

'Mengklik ikon dropdown detail transaksi nmc'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/svg_Proses_rotate-icon-633e554999d5751be20ab215'))

'Menampilkan NIK, Member No, Member Origin'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Customer Profile                       _34d76a'))

'Menampilkan NPP Date, DP, NFA, Admin Fee, Tenor, Installment'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Transaction Detail                     _6487e4_1_2'))

'Status pengajuan nmc ditolak'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Ditolak'))

'Mengklik ikon dropdown detail transaksi nmc'
WebUI.click(findTestObject('Object Repository/Motorcycle/BerandaOld/svg_Ditolak_rotate-icon-61e4c8d1b4aaa3728e4c8e32'))

'Menampilkan NIK, Member No, Member Origin'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Customer Profile                       _389b8c'))

'Menampilkan NPP Date, DP, NFA, Admin Fee, Tenor, Installment'
WebUI.getText(findTestObject('Object Repository/Motorcycle/BerandaOld/div_Transaction Detail                     _6487e4 (1)'))

