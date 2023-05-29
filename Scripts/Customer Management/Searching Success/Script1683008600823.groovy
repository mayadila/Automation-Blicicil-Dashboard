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

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Searching Success/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching Success/button_Login'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching Success/span_Customer Management'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Success/select_Show                                _69175e'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Success/select_Year                                _c79051'), 
    '2023', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Success/select_Show                                _69175e'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Success/select_Year                                _c79051'), 
    '2022', true)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching Success/a_4'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching Success/a_Prev'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching Success/a_Next'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Searching Success/a_1'))

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch'), 
    '3404076403940005')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Success/select_Search by                           _8b0677'), 
    'name', true)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch'), 
    'G')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch'), 
    'Testing')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Success/select_Search by                           _8b0677'), 
    'mobile_phone', true)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch_1'), 
    '081288065124')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch_1'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Searching Success/select_Search by                           _8b0677'), 
    'nik', true)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch_1'), 
    '31')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Searching Success/input_List of Customers_filterSearch_1'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

