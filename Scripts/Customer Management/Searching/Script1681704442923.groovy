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
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Searching/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/button_Login'))

'Mengklik menu customer management'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/span_Customer Management'))

'Mengklik kolom pencarian dan menginputkan kata kunci'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), '3404076403940005')

'Menekan tombol enter pada keyboard laptop'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), Keys.chord(Keys.ENTER))

'Tanggal registrasi user'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_14 Sep 2022'))

'Nama user'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_eva'))

'Nomor telepon user'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_081288065124'))

'NIK user'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_3404076403940005'))

'Limit plafon modal instan yang didapatkan'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_Rp 50.000.000'))

'Sisa limit modal instan'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_Rp 45.000.000'))

'Status kondisi aplikasi di hp "Login / Logout"'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_Logout'))

'Action untuk melihat detail user'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_Detail'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/div_Show                                   _676ab3'))

'Menginputkan kata kunci di kolom pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), '3175041209770031')

'Menekan enter pada keyboard di kolom pencarian yang terlah terisi'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/div_Show                                   _676ab3'))

'Menginputkan kata kunci di kolom pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), '2102021801880001')

'Menekan enter pada keyboard di kolom pencarian yang terlah terisi'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/div_Show                                   _676ab3'))

'Menginputkan kata kunci di kolom pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), 'Renaka')

'Menekan enter pada keyboard di kolom pencarian yang terlah terisi'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), Keys.chord(Keys.ENTER))

'Jika kata kunci yang dicari tidak terdapat di customer management maka menampilkan pesan "No data available in  table"'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/td_No data available in table'))

