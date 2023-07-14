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

WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Motorcycle/Searching Success/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/button_Login'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/a_Transaction'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/a_Motorcycle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Selesai', true)

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Selesai_rotate-icon-62048ea3dc1625770b4d67f5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Proses', true)

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Proses_rotate-icon-61e28a1d1dac201b017d5bf7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Transaksi', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'TTD Kontrak', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Ditolak', true)

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Ditolak_rotate-icon-61e4caef3487346ae86c1884'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Dibatalkan', true)

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Dibatalkan_rotate-icon-6215dfba601e4b31_955332'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/a_Next'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/a_Previous'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/li_Yesterday'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/li_Today'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/li_Last 7 Days'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/li_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Proses_rotate-icon-64901e74c58fba0dae4dff85'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/li_This Month'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Proses_rotate-icon-64a77b45c58fba0dae4e017a'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/li_Last Month'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Proses_rotate-icon-64901e74c58fba0dae4dff85'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/th_Custom Range_prev available'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/th_Custom Range_prev available'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/th_Custom Range_prev available'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/th_Custom Range_prev available'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/th_Custom Range_prev available'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/button_Apply'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'RADITHYA')

WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Ditolak_rotate-icon-61e4c8d1b4aaa3728e4c8e32'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Success/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'KURNIA')

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Dibatalkan_rotate-icon-62012045fe99524a_db6627'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/svg_Dibatalkan_rotate-icon-62012045fe99524a_db6627'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/a_Next'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Success/a_Previous'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Selesai', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Proses', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Transaksi', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'TTD Kontrak', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Ditolak', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Success/select_Status                              _ebcc15'), 
    'Dibatalkan', true)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

