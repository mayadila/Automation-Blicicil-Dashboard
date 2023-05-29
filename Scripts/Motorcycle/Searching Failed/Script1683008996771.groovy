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

WebUI.maximizeWindow()

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

'Menginputkan kata kunci di kolom pencarian'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'ajkd')

'Mengenter kata kunci di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik yesterday pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Yesterday'))

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik last 7 days pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last 7 Days'))

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik last 30 days pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last 30 Days'))

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik this month pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_This Month'))

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik last month pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last Month'))

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik custom range dan memilih tanggal pada date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Custom Range'))

'Mengklik button apply setelah memilih rentang tanggal'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/button_Apply'))

'Mengklik date range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik button clear untuk mengkosongkan date rangge'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/button_Clear'))

'Merefresh halaman'
WebUI.refresh()

'Menginputkan kata kunci di kolom pencarian'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    '123445')

'Mengenter kata kunci di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

'Mengklik Selesai pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Selesai', true)

'Mengklik Prosess pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Proses', true)

'Mengklik Transaksi pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Transaksi', true)

'Mengklik TTD Kontrak pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'TTD Kontrak', true)

'Mengklik Ditolak pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Ditolak', true)

'Mengklik Dibatalkan pada dropdown status'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Dibatalkan', true)

'Menutup chrome'
WebUI.closeBrowser()

