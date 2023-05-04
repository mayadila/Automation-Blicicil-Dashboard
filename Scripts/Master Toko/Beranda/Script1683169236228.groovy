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

'Maximize Window Chrome'
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Master Toko/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Toko/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/a_Toko'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Beranda/div_List Toko BliCicil Admin as            _dde361'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Beranda/th_Nama'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Beranda/th_Alamat'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Beranda/th_Status'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Beranda/th_Action'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/a_4'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/a_172'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/a_168'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/a_Previous'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/a_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/a_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_Deactivate'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/div_Are you sure want to deactivate Transma_af0d13'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_No'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_Deactivate'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/div_Are you sure want to deactivate Transma_af0d13'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_Yes'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_Activate'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/div_Are you sure want to activate Transmart_078b02'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_No'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_Activate'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/div_Are you sure want to activate Transmart_078b02'))

WebUI.click(findTestObject('Object Repository/Master Toko/Beranda/button_Yes'))

WebUI.delay(10)

WebUI.closeBrowser()

