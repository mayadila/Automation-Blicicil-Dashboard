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

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Config/Administrator/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Config/Administrator/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_Login'))

'Mengklik menu config'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/a_Config'))

'Mengklik submenu Administrator'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/a_Administrator'))

'Membuka halaman list Administrator '
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/div_List Administrator BliCicil Admin as   _6945c6'))

'Menampilkan table yang berisi Nama User'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/th_Name'))

'Menampilkan table yang berisi email user'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/th_Email'))

'Menampilkan table yang berisi Menu'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/th_Menu'))

'Menampilkan table yang berisi Jumlah Total menu di dashboard'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/th_Total'))

'Menampilkan table yang berisi Jumlah Menu yang bisa diakses oleh user tersebut'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/th_Assign'))

'Menampilkan table yang berisi tanggal last update'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/th_Last Update'))

'Menampilkan table yang berisi Status akun user : Active / Nonactive'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/th_Status'))

'Menampilkan table yang berisi Actin : Deactive / Activate, Privilege, Edit'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/th_Action'))

'Mengklik button page number'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/a_2'))

WebUI.delay(5)

'Mengklik button prev number'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/a_Previous'))

WebUI.delay(5)

'Mengklik button next number'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/a_Next'))

WebUI.delay(5)

'Mengklik button deactive untuk nonactivekan akun user tersebut'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_Deactivate'))

'Menampilkan popup Are you sure want to deactivate "nama user" ?'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/div_Are you sure want to deactivate blicici_4d10fb'))

'Mengklik button No jika tidak ingin menonactivekan user tersebut'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_No'))

WebUI.delay(5)

'Mengklik button deactive untuk nonactivekan akun user tersebut'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_Deactivate'))

'Menampilkan popup Are you sure want to deactivate "nama user" ?'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/div_Are you sure want to deactivate blicici_4d10fb'))

'Mengklik button Yes jika ingin menonactivekan user tersebut'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_Yes'))

WebUI.delay(5)

'Mengklik button page number'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/a_2'))

'Statusnya berubah menjadi Nonactivate'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/td_Nonactive'))

WebUI.delay(5)

'Mengklik button page number'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/a_1'))

WebUI.delay(5)

'Mengklik button activate untuk mengaktifkan akun user tersebut'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_Activate'))

'Menampilkan popup Are you sure want to activate "nama user" ?'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/div_Are you sure want to activate AkatsukiYesNoNo'))

'Mengklik button No jika tidak ingin mengaktifkan user tersebut'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_No'))

WebUI.delay(5)

'Mengklik button activate untuk mengaktifkan akun user tersebut'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_Activate'))

'Menampilkan popup Are you sure want to activate "nama user" ?'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/div_Are you sure want to activate AkatsukiYesNoNo'))

'Mengklik button Yes jika ingin mengaktifkan user tersebut'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Beranda/button_Yes'))

'Statusnya berubah menjadi activate'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Beranda/td_Active'))

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

