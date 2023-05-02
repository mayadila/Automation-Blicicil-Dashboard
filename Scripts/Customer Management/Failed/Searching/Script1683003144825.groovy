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
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Failed/Searching/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password'
WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Failed/Searching/input_Password_password'), 
    'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Failed/Searching/button_Login'))

'Mengklik menu customer management'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Failed/Searching/a_Customer Management'))

WebUI.delay(5)

'Menginputkan kata kunci di pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Failed/Searching/input_Cari_filterSearch'), 'abi')

'Mengenter inputan kata kunci dipencarian'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Failed/Searching/input_Cari_filterSearch'), Keys.chord(
        Keys.ENTER))

WebUI.getText(findTestObject('Customer Managementt/Failed/Searching/td_No data available in table'))

WebUI.delay(5)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'Menginputkan kata kunci di pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Failed/Searching/input_Cari_filterSearch'), '09876543')

'Mengenter inputan kata kunci dipencarian'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Failed/Searching/input_Cari_filterSearch'), Keys.chord(
        Keys.ENTER))

WebUI.getText(findTestObject('Customer Managementt/Failed/Searching/td_No data available in table'))

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

