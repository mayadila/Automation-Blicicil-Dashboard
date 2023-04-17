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
WebUI.setText(findTestObject('Object Repository/Login-Logout/Logout/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Login-Logout/Logout/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/button_Login'))

WebUI.waitForAngularLoad(30)

'Mengklik button ikon profil'
WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/div_E'))

'Mengklik menu logout'
WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/a_Logout'))

'Menampilkan popup "Are you sure want to logout?"'
WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/div_Are you sure want to logoutYesNoNo'))

'Mengklik button No "jika tidak ingin logout"'
WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/button_No'))

WebUI.waitForAngularLoad(30)

'Mengklik button ikon profil'
WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/div_E'))

WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/a_Logout'))

'Menampilkan popup "Are you sure want to logout?"'
WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/div_Are you sure want to logoutYesNoNo'))

'Mengklik button Yes "jika ingin logout"'
WebUI.click(findTestObject('Object Repository/Login-Logout/Logout/button_Yes'))

