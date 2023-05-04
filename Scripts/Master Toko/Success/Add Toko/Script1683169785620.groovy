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

'Maximize Window Chrome'
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Master Toko/Success/Add Toko/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Toko/Success/Add Toko/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Toko/Success/Add Toko/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Toko/Success/Add Toko/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Toko/Success/Add Toko/a_Toko'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Success/Add Toko/div_List Toko BliCicil Admin as            _dde361'))

WebUI.click(findTestObject('Object Repository/Master Toko/Success/Add Toko/svg_List Toko BliCicil Admin as_feather fea_a26c67'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Success/Add Toko/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '3', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Success/Add Toko/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '430', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Success/Add Toko/input_Nama Toko_txtNamaToko'), 'Testing Toko Baru')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Success/Add Toko/input_Outlet Name_txtNamaOutlet'), 'Toko Baru ya')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Success/Add Toko/textarea_Address_txtAlamat'), 'Jalan Wiajya')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Success/Add Toko/input_Dealer Code_txtDealerCode'), 'D00345')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Success/Add Toko/input_Telephone_txtTelepon'), '0293847475940')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Success/Add Toko/input_Latitude_txtlatitude'), '-60.28888')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Success/Add Toko/input_Longitude_txtlongitude'), '102.4848493')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Success/Add Toko/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Success/Add Toko/div_SuccessOKNoCancel'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Success/Add Toko/div_List Toko BliCicil Admin as            _dde361'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Success/Add Toko/a_172'))

WebUI.delay(10)

WebUI.closeBrowser()

