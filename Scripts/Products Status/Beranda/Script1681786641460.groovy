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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Products Status/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Products Status/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Products Status/button_Login'))

WebUI.click(findTestObject('Object Repository/Products Status/a_Products Status'))

WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _9ba51a'))

WebUI.click(findTestObject('Object Repository/Products Status/p_Process'))

WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _9ba51a'))

WebUI.click(findTestObject('Object Repository/Products Status/a_4'))

WebUI.click(findTestObject('Object Repository/Products Status/a_12'))

WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

WebUI.click(findTestObject('Object Repository/Products Status/button_Export to                           _94e730'))

WebUI.click(findTestObject('Object Repository/Products Status/p_TTD Kontrak'))

WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _9ba51a'))

WebUI.click(findTestObject('Object Repository/Products Status/a_2'))

WebUI.click(findTestObject('Object Repository/Products Status/button_Export to                           _94e730'))

WebUI.click(findTestObject('Object Repository/Products Status/p_Transaksi'))

WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _9ba51a'))

WebUI.click(findTestObject('Object Repository/Products Status/button_Export to                           _94e730'))

WebUI.click(findTestObject('Object Repository/Products Status/p_Ditolak'))

WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _9ba51a'))

WebUI.click(findTestObject('Object Repository/Products Status/a_5'))

WebUI.click(findTestObject('Object Repository/Products Status/a_9'))

WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

WebUI.click(findTestObject('Object Repository/Products Status/button_Export to                           _94e730'))

WebUI.click(findTestObject('Object Repository/Products Status/p_Dibatalkan'))

WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _9ba51a'))

WebUI.click(findTestObject('Object Repository/Products Status/a_5'))

WebUI.click(findTestObject('Object Repository/Products Status/a_30'))

WebUI.click(findTestObject('Object Repository/Products Status/a_26'))

WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

WebUI.click(findTestObject('Object Repository/Products Status/button_Export to                           _94e730'))

WebUI.click(findTestObject('Object Repository/Products Status/p_Selesai'))

WebUI.getText(findTestObject('Object Repository/Products Status/div_List Products Status BliCicil Admin as _9ba51a'))

WebUI.click(findTestObject('Object Repository/Products Status/a_4'))

WebUI.click(findTestObject('Object Repository/Products Status/a_16'))

WebUI.click(findTestObject('Object Repository/Products Status/a_1'))

WebUI.click(findTestObject('Object Repository/Products Status/button_Export to                           _94e730'))

WebUI.closeBrowser()

