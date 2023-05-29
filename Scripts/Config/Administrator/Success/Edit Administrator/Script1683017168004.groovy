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

'Membuka chrome'
WebUI.openBrowser('')

WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/input_Password_password'), 
    'aeHFOx8jV/A=')

'Mengklik button Login'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/button_Login'))

'Mengklik menu config'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/a_Config'))

'Mengklik submenu administrator'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/span_Administrator'))

'Mengklik button edit'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/a_Edit'))

'Membuka halaman edit '
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/div_Edit Administrator BliCicil Admin as'))

'mengubah email user'
WebUI.setText(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/input_Email_lalaland'), 'fredi@megafinance.co.id')

'mengubah password user'
WebUI.setEncryptedText(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/input_Password_txtPassword'), 
    'zXiMgA/AYuq9JeP8OALDyA==')

'Mengubah nama user'
WebUI.setText(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/input_Name_txtName'), 'Fredi')

'Mengklik button submit'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/button_Submit'))

'Menampilkan popup sukses submit perubahan'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Success/Edit Admin/div_SuccessOKNoCancel'))

'Menutup chrome'
WebUI.closeBrowser()

