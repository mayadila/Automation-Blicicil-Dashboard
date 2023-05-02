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
WebUI.setText(findTestObject('Object Repository/Products Status/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Products Status/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Products Status/button_Login'))

'Mengklik menu Products Status'
WebUI.click(findTestObject('Object Repository/Products Status/span_Products Status'))

'Membuka halaman List Products Status Blicicil '
WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _5ccfe3'))

'Menampilkan table berisi nama produk'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Product'))

'Menampilkan table berisi order id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Order ID'))

'Menampilkan table berisi dokumen id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Document ID'))

'Menampilkan table berisi nama yang melakukan pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Requestor'))

'Menampilkan table berisi jumlah OTR/Pinjaman (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_OTR  Pinjaman'))

'Menampilkan table berisi jumlah downpayment (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Downpayment'))

'Menampilkan table berisi status pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Status'))

'Mengklik button Export To Excel untuk melihat detail dari products status'
WebUI.click(findTestObject('Object Repository/Products Status/button_Export to Excel'))

'Mengklik button Proses untuk menampilkan table list products status Prosess'
WebUI.click(findTestObject('Object Repository/Products Status/p_Process'))

'Membuka halaman list products status Prosess'
WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _5ccfe3'))

'Menampilkan table berisi nama produk'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Product'))

'Menampilkan table berisi order id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Order ID'))

'Menampilkan table berisi dokumen id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Document ID'))

'Menampilkan table berisi nama yang melakukan pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Requestor'))

'Menampilkan table berisi jumlah OTR/Pinjaman (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_OTR  Pinjaman'))

'Menampilkan table berisi jumlah downpayment (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Downpayment'))

'Menampilkan table berisi status pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Status'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_4'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_12'))

'Mengklik button Export To Excel untuk melihat detail dari products status'
WebUI.click(findTestObject('Object Repository/Products Status/button_Export to Excel'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

'Mengklik button Proses untuk menampilkan table list products status TTD Kontrak'
WebUI.click(findTestObject('Object Repository/Products Status/p_TTD Kontrak'))

'Membuka halaman list products status TTD Kontrak'
WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _5ccfe3'))

'Menampilkan table berisi nama produk'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Product'))

'Menampilkan table berisi order id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Order ID'))

'Menampilkan table berisi dokumen id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Document ID'))

'Menampilkan table berisi nama yang melakukan pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Requestor'))

'Menampilkan table berisi jumlah OTR/Pinjaman (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_OTR  Pinjaman'))

'Menampilkan table berisi jumlah downpayment (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Downpayment'))

'Menampilkan table berisi status pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Status'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_2'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

'Mengklik button Export To Excel untuk melihat detail dari products status'
WebUI.click(findTestObject('Object Repository/Products Status/button_Export to Excel'))

'Mengklik button Proses untuk menampilkan table list products status Transaksi'
WebUI.click(findTestObject('Object Repository/Products Status/p_Transaksi'))

'Membuka halaman list products status Transaksi'
WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _5ccfe3'))

'Menampilkan table berisi nama produk'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Product'))

'Menampilkan table berisi order id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Order ID'))

'Menampilkan table berisi dokumen id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Document ID'))

'Menampilkan table berisi nama yang melakukan pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Requestor'))

'Menampilkan table berisi jumlah OTR/Pinjaman (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_OTR  Pinjaman'))

'Menampilkan table berisi jumlah downpayment (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Downpayment'))

'Menampilkan table berisi status pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Status'))

'Mengklik button Export To Excel untuk melihat detail dari products status'
WebUI.click(findTestObject('Object Repository/Products Status/button_Export to Excel'))

'Mengklik button Proses untuk menampilkan table list products status Ditolak'
WebUI.click(findTestObject('Object Repository/Products Status/p_Ditolak'))

'Membuka halaman list products status Ditolak'
WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _5ccfe3'))

'Menampilkan table berisi nama produk'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Product'))

'Menampilkan table berisi order id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Order ID'))

'Menampilkan table berisi dokumen id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Document ID'))

'Menampilkan table berisi nama yang melakukan pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Requestor'))

'Menampilkan table berisi jumlah OTR/Pinjaman (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_OTR  Pinjaman'))

'Menampilkan table berisi jumlah downpayment (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Downpayment'))

'Menampilkan table berisi status pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Status'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_9'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_5'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

'Mengklik button Export To Excel untuk melihat detail dari products status'
WebUI.click(findTestObject('Object Repository/Products Status/button_Export to Excel'))

'Mengklik button Proses untuk menampilkan table list products status Dibatalkan'
WebUI.click(findTestObject('Object Repository/Products Status/p_Dibatalkan'))

'Membuka halaman list products status Dibatalkan'
WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _5ccfe3'))

'Menampilkan table berisi nama produk'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Product'))

'Menampilkan table berisi order id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Order ID'))

'Menampilkan table berisi dokumen id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Document ID'))

'Menampilkan table berisi nama yang melakukan pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Requestor'))

'Menampilkan table berisi jumlah OTR/Pinjaman (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_OTR  Pinjaman'))

'Menampilkan table berisi jumlah downpayment (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Downpayment'))

'Menampilkan table berisi status pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Status'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_29'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_25'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

'Mengklik button Export To Excel untuk melihat detail dari products status'
WebUI.click(findTestObject('Object Repository/Products Status/button_Export to Excel'))

'Mengklik button Proses untuk menampilkan table list products status Selesai'
WebUI.click(findTestObject('Object Repository/Products Status/p_Selesai'))

'Membuka halaman list products status Selesai'
WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _5ccfe3'))

'Menampilkan table berisi nama produk'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Product'))

'Menampilkan table berisi order id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Order ID'))

'Menampilkan table berisi dokumen id'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Document ID'))

'Menampilkan table berisi nama yang melakukan pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Requestor'))

'Menampilkan table berisi jumlah OTR/Pinjaman (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_OTR  Pinjaman'))

'Menampilkan table berisi jumlah downpayment (Rp)'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Downpayment'))

'Menampilkan table berisi status pengajuan'
WebUI.getText(findTestObject('Object Repository/Products Status/th_Status'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_16'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_13'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

'Mengklik button number page'
WebUI.click(findTestObject('Object Repository/Products Status/a_4'))

'Mengklik button Export To Excel untuk melihat detail dari products status'
WebUI.click(findTestObject('Object Repository/Products Status/button_Export to Excel'))

'Merefresh halaman list products status'
WebUI.refresh()

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

