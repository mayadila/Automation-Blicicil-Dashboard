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
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/button_Login'))

'Mengklik menu transaksi'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/a_Transaction'))

'Mengklik submenu motorcycle'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/a_Motorcycle'))

WebUI.delay(5)

'Menginputkan kata kunci di kolom pencarian'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'ajkd')

'Mengenter kata kunci di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

'Menampilkan table yang berisi Tanggal & Jam Transaksi'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Transaction Date  Time'))

'Menampilkan table yang berisi Nomor Aplikasi'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Application Number'))

'Menampilkan table yang berisi Nama Customer'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Customer Name'))

'Menampilkan table yang berisi Nomor Kontrak'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Contract Number'))

'Menampilkan table yang berisi Jumlah Rupiah Item Value'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Item Value (Rp)'))

'Menampilkan table yang berisi Status Pengajuan'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Status'))

'Menampilkan pesan bahwa tidak ada data pada kata kunci tersebut'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/td_No matching records found'))

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik yesterday pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Yesterday'))

WebUI.delay(5)

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik last 7 days pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last 7 Days'))

WebUI.delay(5)

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik last 30 days pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last 30 Days'))

WebUI.delay(5)

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik this month pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_This Month'))

WebUI.delay(5)

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik last month pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last Month'))

WebUI.delay(5)

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik custom range dan memilih tanggal pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Custom Range'))

'Mengklik button apply setelah memilih rentang tanggal'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/button_Apply'))

WebUI.delay(5)

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik button clear untuk mengkosongkan date rangge'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/button_Clear'))

WebUI.delay(5)

'Merefresh halaman'
WebUI.refresh()

'Menginputkan kata kunci di kolom pencarian'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    '123445')

'Mengenter kata kunci di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

'Menampilkan table yang berisi Tanggal & Jam Transaksi'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Transaction Date  Time'))

'Menampilkan table yang berisi Nomor Aplikasi'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Application Number'))

'Menampilkan table yang berisi Nama Customer'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Customer Name'))

'Menampilkan table yang berisi Nomor Kontrak'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Contract Number'))

'Menampilkan table yang berisi Jumlah Rupiah Item Value'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Item Value (Rp)'))

'Menampilkan table yang berisi Status Pengajuan'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/th_Status'))

'Menampilkan pesan bahwa tidak ada data pada kata kunci tersebut'
WebUI.getText(findTestObject('Object Repository/Motorcycle/Searching Failed/td_No matching records found'))

WebUI.delay(5)

'Mengklik Selesai pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Selesai', true)

WebUI.delay(5)

'Mengklik Prosess pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Proses', true)

WebUI.delay(5)

'Mengklik Transaksi pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Transaksi', true)

WebUI.delay(5)

'Mengklik TTD Kontrak pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'TTD Kontrak', true)

WebUI.delay(5)

'Mengklik Ditolak pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Ditolak', true)

WebUI.delay(5)

'Mengklik Dibatalkan pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Dibatalkan', true)

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

