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

WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/a_Transaction'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/a_Motorcycle'))

WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'indonesia')

WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Selesai', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Proses', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Transaksi', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'TTD Kontrak', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Ditolak', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Motorcycle/Searching Failed/select_Status                              _ebcc15'), 
    'Dibatalkan', true)

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    'jenaka')

WebUI.sendKeys(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _ec3f45'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Yesterday'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Today'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last 7 Days'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_This Month'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/input_List Motorcycle Transaction BliCicil _539eaf'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Searching Failed/li_Last Month'))

WebUI.closeBrowser()

