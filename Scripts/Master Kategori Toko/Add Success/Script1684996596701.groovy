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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Master Kategori Toko/Add Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Kategori Toko/Add Success/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Success/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Success/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Success/span_Kategori Toko'))

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Success/svg_List Kategori Toko BliCicil Admin as_fe_5a1635'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Success/div_--Pilih Kategori--'))

WebUI.delay(5)

notChecked = WebUI.verifyElementNotChecked(findTestObject('Master Kategori Toko/Add Success/input_Komputer  Laptop_category'), 
    0)

if (notChecked == true) {
    WebUI.check(findTestObject('Master Kategori Toko/Add Success/input_Komputer  Laptop_category'))
}

WebUI.delay(5)

notChecked = WebUI.verifyElementNotChecked(findTestObject('Master Kategori Toko/Add Success/input_TV_category'), 0)

if (notChecked == true) {
    WebUI.check(findTestObject('Master Kategori Toko/Add Success/input_TV_category'))
}

WebUI.delay(5)

notChecked = WebUI.verifyElementNotChecked(findTestObject('Master Kategori Toko/Add Success/input_Dapur_category'), 0)

if (notChecked == true) {
    WebUI.check(findTestObject('Master Kategori Toko/Add Success/input_Dapur_category'))
}

WebUI.delay(5)

notChecked = WebUI.verifyElementNotChecked(findTestObject('Master Kategori Toko/Add Success/input_Kamera  Recoder_category'), 
    0)

if (notChecked == true) {
    WebUI.check(findTestObject('Master Kategori Toko/Add Success/input_Kamera  Recoder_category'))
}

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Master Kategori Toko/Add Success/Pilih toko'), toko, true)

WebUI.click(findTestObject('Master Kategori Toko/Add Success/button_Submit'))

WebUI.delay(10)

WebUI.closeBrowser()

