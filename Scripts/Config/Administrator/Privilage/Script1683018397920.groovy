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
WebUI.setText(findTestObject('Object Repository/Config/Administrator/Privilege/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Config/Administrator/Privilege/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/button_Login'))

'Mengklik menu config'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/a_Config'))

'Mengklik submenu Administrator'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/a_Administrator'))

'Status Nonactive'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/div_Nonactive'))

'Mengklik button privilege'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/a_Privilege'))

'Membuka halaman privelege'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/div_Privilage Administrator BliCicil Admin as'))

'Menampilkan table berisi Menu'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/th_Menu'))

'Menampilkan table berisi Parent'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/th_Parent'))

'Menampilkan table berisi Child'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/th_Child'))

'Menampilkan table berisi Action On / Off radiobutton'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/th_Action'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Wording Notification_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Config_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Master_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Products_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Products Status_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Special Offers_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Dashboard_custom-control-label'))

WebUI.delay(5)

'Mengklik button Save Change'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/button_Save Change'))

'Menampilkan popup sukses mengubah / menambahkan previlege'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/div_SuccessOKNoCancel'))

'Meredirect ke halaman list administrator'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/div_List Administrator BliCicil Admin as   _6945c6'))

WebUI.delay(5)

'Status Active'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/div_Active'))

'Mengklik button privilege'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/a_Privilege_1'))

'Membuka halaman privelege'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/div_Privilage Administrator BliCicil Admin as'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Config_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Transaction_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Master_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Products_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Products Status_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Special Offers_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Customer Management_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_News_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_FAQ_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Customer Management_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_News_custom-control-label'))

WebUI.delay(5)

'Off / On radio button'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/label_Master_custom-control-label'))

'Mengklik button Save Change'
WebUI.click(findTestObject('Object Repository/Config/Administrator/Privilege/button_Save Change'))

'Menampilkan popup sukses mengubah / menambahkan previlege'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/div_SuccessOKNoCancel'))

'Meredirect ke halaman list administrator'
WebUI.getText(findTestObject('Object Repository/Config/Administrator/Privilege/div_List Administrator BliCicil Admin as   _6945c6'))

WebUI.delay(10)

'Menutup chrome'
WebUI.closeBrowser()

