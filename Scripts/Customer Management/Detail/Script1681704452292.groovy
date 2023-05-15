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

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/h3_User Profile'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Nasabah'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail_1'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/h3_User Profile'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Nasabah'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Detail/select_Year                                _c79051'), 
    '2022', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Detail/select_Search by                           _8b0677'), 
    'nik', true)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Detail/input_List of Customers_filterSearch'), '3404076403940005')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Detail/input_List of Customers_filterSearch'), Keys.chord(
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail_1_2_3'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_User Profile'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Nasabah'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Managementt/Detail/select_Year                                _c79051'), 
    '2022', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Detail/input_List of Customers_filterSearch_1'), '6112012907950011')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Detail/input_List of Customers_filterSearch_1'), Keys.chord(
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail_1_2_3_4'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/h3_User Profile'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Nasabah'))

WebUI.delay(10)

WebUI.closeBrowser()

