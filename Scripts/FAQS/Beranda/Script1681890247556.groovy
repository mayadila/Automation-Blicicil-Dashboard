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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/FAQS/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/FAQS/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Login'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_FAQ'))

WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/div_List FAQs BliCicil Admin as            _3c8d92'))

WebUI.delay(5)

WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/th_Question'))

WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/th_Answer'))

WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/th_Status'))

WebUI.getText(findTestObject('Object Repository/FAQS/Beranda/th_Action'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_3'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_Previous'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_3'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Unpublish'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to unpublish this dat_a999af'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_No'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Unpublish'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to unpublish this dat_a999af'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Yes'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_3'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/a_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Publish'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to publish this dataYesNoNo'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_No'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Publish'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/div_Are you sure want to publish this dataYesNoNo'))

WebUI.click(findTestObject('Object Repository/FAQS/Beranda/button_Yes'))

WebUI.setText(findTestObject('Object Repository/FAQS/Beranda/input_Search_form-control form-control-sm'), 'Modal')

WebUI.sendKeys(findTestObject('Object Repository/FAQS/Beranda/input_Search_form-control form-control-sm'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/FAQS/Beranda/input_Search_form-control form-control-sm'), 'NIK')

WebUI.sendKeys(findTestObject('Object Repository/FAQS/Beranda/input_Search_form-control form-control-sm'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.refresh()

WebUI.delay(5)

WebUI.closeBrowser()

