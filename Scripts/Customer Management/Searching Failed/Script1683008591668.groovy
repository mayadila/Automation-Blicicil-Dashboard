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

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching Failed/a_Customer Management'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Search by                           _8b0677'), 
    'name', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    '081')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Search by                           _8b0677'), 
    'mobile_phone', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    'Eva')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Search by                           _8b0677'), 
    'nik', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    'Gita')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Year                                _c79051'), 
    '2023', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Search by                           _8b0677'), 
    'name', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    '089')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Year                                _c79051'), 
    '2023', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Search by                           _8b0677'), 
    'mobile_phone', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    'Renaka')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Year                                _c79051'), 
    '2022', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Failed/select_Search by                           _8b0677'), 
    'nik', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    'Hend')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Failed/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.closeBrowser()

