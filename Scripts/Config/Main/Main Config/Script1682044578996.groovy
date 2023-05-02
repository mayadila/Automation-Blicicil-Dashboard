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

WebUI.setText(findTestObject('Object Repository/Config/Main/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Config/Main/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Config/Main/button_Login'))

WebUI.click(findTestObject('Object Repository/Config/Main/a_Config'))

WebUI.click(findTestObject('Object Repository/Config/Main/a_Main Config'))

WebUI.getText(findTestObject('Object Repository/Config/Main/div_Main Config BliCicil Admin as          _9d871c'))

WebUI.getText(findTestObject('Object Repository/Config/Main/th_Config'))

WebUI.getText(findTestObject('Object Repository/Config/Main/th_Param'))

WebUI.getText(findTestObject('Object Repository/Config/Main/th_Desc'))

WebUI.getText(findTestObject('Object Repository/Config/Main/th_Value'))

WebUI.getText(findTestObject('Object Repository/Config/Main/td_Email'))

WebUI.getText(findTestObject('Object Repository/Config/Main/td_Hotline'))

WebUI.setText(findTestObject('Object Repository/Config/Main/input_Email BliCicil_email'), 'blicicil@megafinance.co.id')

WebUI.setText(findTestObject('Object Repository/Config/Main/input_Hotline BliCicil_hotline'), '(021) 72800818')

WebUI.click(findTestObject('Object Repository/Config/Main/span_Save'))

WebUI.delay(10)

WebUI.closeBrowser()

