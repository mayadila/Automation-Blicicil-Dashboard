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

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Detail/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Detail/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/button_Login'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/span_Customer Management'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/h3_User Profile'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_3'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail_1'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_5'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail_1_2'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_5'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_7'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_9'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_11'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_13'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_15'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail_1_2_3'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.closeBrowser()

