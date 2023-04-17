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

'Membuka Chrome'
WebUI.openBrowser('')

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Login-Logout/Login Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password invalid'
WebUI.setEncryptedText(findTestObject('Object Repository/Login-Logout/Login Failed/input_Password_password'), 'zXiMgA/AYuq9JeP8OALDyA==')

'Mengklik ikon mata untuk menampilkan password yang di masking'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Sukses/span_Password_input-group-text cursor-pointer'))

'Mengklik ikon mata untuk menutup password menjadi masking'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Sukses/span_Password_input-group-text cursor-pointer'))

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Failed/button_Login'))

'Menampilkan popup "nvalid Email or Password"'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Failed/div_ErrorInvalid Email or PasswordOKNoCancel'))

WebUI.waitForAngularLoad(30)

'Menghapus inputan email lama'
WebUI.clearText(findTestObject('Object Repository/Login-Logout/Login Failed/input_Email_email'))

'Menghapus inputan password lama'
WebUI.clearText(findTestObject('Object Repository/Login-Logout/Login Failed/input_Password_password'))

'Menginputkan email invalid'
WebUI.setText(findTestObject('Object Repository/Login-Logout/Login Failed/input_Email_email'), 'evamayadila@megafinance.com')

'Mengklik password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Login-Logout/Login Failed/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik ikon mata untuk menampilkan password yang di masking'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Sukses/span_Password_input-group-text cursor-pointer'))

'Mengklik ikon mata untuk menutup password menjadi masking'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Sukses/span_Password_input-group-text cursor-pointer'))

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Failed/button_Login'))

'Menampilkan popup "nvalid Email or Password"'
WebUI.click(findTestObject('Object Repository/Login-Logout/Login Failed/div_ErrorAccount is not existOKNoCancel'))

