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
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Motorcycle/Searching/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/button_Login'))

'Mengklik button menu transaction'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/a_Transaction'))

'Mengklik button menu motorcycle'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/a_Motorcycle'))

'Menginputkan kata kunci dikolom pencarian'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'Radi')

'Menekan tombol enter keyboard di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

WebUI.clearText(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'))

'Menginputkan kata kunci dikolom pencarian'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'Kurnia')

'Menekan tombol enter keyboard di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

WebUI.clearText(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'))

'Menginputkan kata kunci dikolom pencarian'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'Novis')

'Menekan tombol enter keyboard di kolom pencarianMenginputkan kata kunci dikolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

'Menghapus inputan'
WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    '')

'Mengklik Date Range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik yesterday\r\n'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/li_Yesterday'))

'Mengklik Date Range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik Last 7 days'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/li_Last 7 Days'))

'Mengklik Date Range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik Last 30 days'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/li_Last 30 Days'))

'Mengklik Date Range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik This Month'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/li_This Month'))

'Mengklik Date Range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik Last Month'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/li_Last Month'))

'Mengklik Date Range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik Custome Range Date'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/li_Custom Range'))

'Memilih range tanggal yang diinginkan'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/th_Custom Range_prev available'))

'Mengklik button Apply'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/button_Apply'))

'Mengklik Date Range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik Today'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/li_Today'))

'Mengklik Date Range'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/input_List Motorcycle Transaction BliCicil _539eaf'))

'Mengklik button clear'
WebUI.click(findTestObject('Object Repository/Motorcycle/Searching/button_Clear'))

'Mengklik dropdown status pengajuan'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching/select_Status                              _ebcc15'), 
    'Selesai', true)

'Mengklik dropdown status pengajuan'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching/select_Status                              _ebcc15'), 
    'Proses', true)

'Mengklik dropdown status pengajuan'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching/select_Status                              _ebcc15'), 
    'Transaksi', true)

'Mengklik dropdown status pengajuan'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching/select_Status                              _ebcc15'), 
    'TTD Kontrak', true)

'Mengklik dropdown status pengajuan'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching/select_Status                              _ebcc15'), 
    'Ditolak', true)

'Mengklik dropdown status pengajuan'
WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching/select_Status                              _ebcc15'), 
    'Dibatalkan', true)

