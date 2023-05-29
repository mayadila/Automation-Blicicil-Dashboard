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

WebUI.setText(findTestObject('Object Repository/Special Offers/Searching Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Special Offers/Searching Success/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_Login'))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/a_Special Offers'))

WebUI.getText(findTestObject('Object Repository/Special Offers/Searching Success/div_List Special Offers BliCicil Admin as  _c44b9e'))

WebUI.setText(findTestObject('Object Repository/Special Offers/Searching Success/input_Search_form-control form-control-sm'), 
    'Motor')

WebUI.sendKeys(findTestObject('Object Repository/Special Offers/Searching Success/input_Search_form-control form-control-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Special Offers/Searching Success/input_Search_form-control form-control-sm'), 
    'Offers')

WebUI.sendKeys(findTestObject('Object Repository/Special Offers/Searching Success/input_Search_form-control form-control-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_Unpublish'))

WebUI.getText(findTestObject('Object Repository/Special Offers/Searching Success/div_Are you sure want to unpublish Testing _7950c0'))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_No'))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_Unpublish'))

WebUI.getText(findTestObject('Object Repository/Special Offers/Searching Success/div_Are you sure want to unpublish Testing _7950c0'))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_Yes'))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_Publish'))

WebUI.getText(findTestObject('Object Repository/Special Offers/Searching Success/div_Are you sure want to publish Testing Sp_929925'))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_No'))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_Publish'))

WebUI.getText(findTestObject('Object Repository/Special Offers/Searching Success/div_Are you sure want to publish Testing Sp_929925'))

WebUI.click(findTestObject('Object Repository/Special Offers/Searching Success/button_Yes'))

WebUI.closeBrowser()

