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

WebUI.setText(findTestObject('Object Repository/Master Kategori Toko/Add Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Kategori Toko/Add Failed/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/a_Kategori Toko'))

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/a_New Kategori Toko'))

WebUI.delay(5)

WebUI.getText(findTestObject('Object Repository/Master Kategori Toko/Add Failed/label_Nama Toko'))

WebUI.delay(5)

WebUI.getText(findTestObject('Object Repository/Master Kategori Toko/Add Failed/label_Nama Kategori'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Kategori Toko/Add Failed/div_ErrorThe Nama Toko field is required.OK_1fe216'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Kategori Toko/Add Failed/select_--Pilih Toko--Transmart Carrefour Ce_f40f7e'), 
    toko, true)

WebUI.getText(findTestObject('Object Repository/Master Kategori Toko/Add Failed/label_Nama Kategori'))

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/a_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/a_New Kategori Toko'))

WebUI.getText(findTestObject('Object Repository/Master Kategori Toko/Add Failed/label_Nama Toko'))

WebUI.delay(5)

WebUI.click(findTestObject('Master Kategori Toko/Add Failed/div_--Pilih Kategori--'))

WebUI.delay(5)

notChecked = WebUI.verifyElementNotChecked(findTestObject('Master Kategori Toko/Add Success/input_Komputer  Laptop_category'), 
    0)

if (notChecked == true) {
    WebUI.check(findTestObject('Master Kategori Toko/Add Success/input_Komputer  Laptop_category'))
}

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Kategori Toko/Add Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Kategori Toko/Add Failed/div_ErrorThe Nama Toko field is required.OK_1fe216'))

WebUI.delay(10)

WebUI.closeBrowser()

