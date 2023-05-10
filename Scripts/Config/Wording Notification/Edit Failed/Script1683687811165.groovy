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

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/a_Config'))

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/a_Wording Notification'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/a_Edit'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/div_Edit Wording Notification BliCicil Admin as'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/input_Title_txtTitle'), '')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/textarea_Produk khusus untuk member aktif. _9a6a1b'), 
    'Produk khusus untuk member aktif. Silakan ajukan pembiayaan Elektronik/ Motor/ Multiguna untuk bisa mendapatkan fasilitas ini')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/div_ErrorThe Wording Title field is require_03ae6c'))

WebUI.delay(5)

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/input_Title_txtTitle'), 'Fasilitas Belum Tersedia')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/textarea_Produk khusus untuk member aktif. _9a6a1b'), 
    '')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Config/Wording Notification/Edit Failed/div_ErrorThe Wording Desc field is required_c86839'))

WebUI.delay(10)

WebUI.closeBrowser()

