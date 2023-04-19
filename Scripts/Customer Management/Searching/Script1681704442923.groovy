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

WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Searching/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/button_Login'))

'Mengklik menu Customer management'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/span_Customer Management'))

'Menginputkan kata kunci pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), '3404076403940005')

'Menekan tombol enter di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), Keys.chord(Keys.ENTER))

'Menampilkan hasil yang dicari'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/div_Cari'))

'Menginputkan kata kunci pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), '3175072404860001')

'Menekan tombol enter di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), Keys.chord(Keys.ENTER))

'Menampilkan hasil yang dicari'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching/div_Cari'))

'Menginputkan kata kunci pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), '3174015010820009')

'Menekan tombol enter di kolom pencarian'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching/input_Cari_filterSearch'), Keys.chord(Keys.ENTER))

WebUI.refresh()

