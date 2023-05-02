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

WebUI.setText(findTestObject('Object Repository/Config/Administrator/Success/Searching/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Config/Administrator/Success/Searching/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Config/Administrator/Success/Searching/button_Login'))

WebUI.click(findTestObject('Object Repository/Config/Administrator/Success/Searching/a_Config'))

WebUI.click(findTestObject('Object Repository/Config/Administrator/Success/Searching/a_Administrator'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/div_List Administrator BliCicil Admin as   _6945c6'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Administrator/Success/Searching/input_Search_form-control form-control-sm'), 
    'hend')

WebUI.sendKeys(findTestObject('Object Repository/Config/Administrator/Success/Searching/input_Search_form-control form-control-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Name'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Email'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Menu'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Total'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Assign'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Last Update'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Status'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Action'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Administrator/Success/Searching/input_Search_form-control form-control-sm'), 
    'kur')

WebUI.sendKeys(findTestObject('Object Repository/Config/Administrator/Success/Searching/input_Search_form-control form-control-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Name'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Email'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Menu'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Total'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Assign'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Last Update'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Status'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Action'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Administrator/Success/Searching/input_Search_form-control form-control-sm'), 
    'testing@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Config/Administrator/Success/Searching/input_Search_form-control form-control-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Name'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Email'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Menu'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Total'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Assign'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Last Update'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Status'))

WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Searching/th_Action'))

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

