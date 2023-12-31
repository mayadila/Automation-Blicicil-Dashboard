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

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Config/Wording Notification/Add Success/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Success/button_Login'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Success/a_Config'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Success/a_Wording Notification'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Add Success/div_List Wording BliCicil Admin as         _580111'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Success/a_New Wording Message'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Add Success/div_Add Wording Notification BliCicil Admin as'))

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Success/input_Title_txtTitle'), 'Fitur Not Available')

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Success/textarea_Desc_txtDesc'), 'Fitur tidak tersedia')

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Add Success/input_Location_txtLocation'), 'testing')

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Success/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Add Success/div_SuccessOKNoCancel'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Add Success/a_3'))

WebUI.closeBrowser()

