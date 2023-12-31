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

WebUI.setText(findTestObject('Master Kategori/Searching Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Master Kategori/Searching Success/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Master Kategori/Searching Success/button_Login'))

WebUI.click(findTestObject('Master Kategori/Searching Success/a_Master'))

WebUI.click(findTestObject('Master Kategori/Searching Success/a_Kategori'))

WebUI.getText(findTestObject('Master Kategori/Searching Success/div_List Kategori BliCicil Admin as        _5a5735'))

WebUI.delay(5)

WebUI.setText(findTestObject('Master Kategori/Searching Success/input_Search_form-control form-control-sm'), 'Elektronik')

WebUI.sendKeys(findTestObject('Master Kategori/Searching Success/input_Search_form-control form-control-sm'), Keys.chord(
        Keys.ENTER))

WebUI.delay(5)

WebUI.refresh()

WebUI.setText(findTestObject('Master Kategori/Searching Success/input_Search_form-control form-control-sm'), 'Dapur')

WebUI.sendKeys(findTestObject('Master Kategori/Searching Success/input_Search_form-control form-control-sm'), Keys.chord(
        Keys.ENTER))

WebUI.delay(10)

WebUI.closeBrowser()

