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

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/a_Toko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/a_New Toko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_Add Toko BliCicil Admin as'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_Merchant'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_City'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Nama Toko_txtNamaToko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Outlet Name_txtNamaOutlet'))

WebUI.click(findTestObject('Master Toko/Add Toko Failed/textarea_Address_txtAlamat'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Telephone_txtTelepon'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Latitude_txtlatitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Longitude_txtlongitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_ErrorThe Store name field is required.O_09bc32'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_Merchant'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_City'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.click(findTestObject('Master Toko/Add Toko Failed/textarea_Address_txtAlamat'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Outlet Name_txtNamaOutlet'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Telephone_txtTelepon'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Latitude_txtlatitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Longitude_txtlongitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_ErrorThe Address field is required.OKNoCancel'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_Merchant'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_City'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Outlet Name_txtNamaOutlet'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/textarea_Address_txtAlamat'), 'Jalan wijaya')

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Telephone_txtTelepon'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Latitude_txtlatitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Longitude_txtlongitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_ErrorThe Outlet name field is required._e4b0d3'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_Merchant'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_City'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Nama Toko_txtNamaToko'), 'abcv')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'), '')

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Telephone_txtTelepon'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Latitude_txtlatitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Longitude_txtlongitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_ErrorThe Dealer code field is required._49c3fb'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_Merchant'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_City'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'), 'ab')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Telephone_txtTelepon'), '')

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Latitude_txtlatitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Longitude_txtlongitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_ErrorThe Telepon field is required.OKNoCancel'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_Merchant'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_City'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'), 'abc')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Telephone_txtTelepon'), '021023903')

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Latitude_txtlatitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Longitude_txtlongitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_ErrorThe Latitude field is required.OKNoCancel'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_Merchant'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_City'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'), 'abc')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Telephone_txtTelepon'), '0210239033')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Latitude_txtlatitude'), '-19.4647')

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Longitude_txtlongitude'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_ErrorThe Longitude field is required.OK_5f5eec'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_Merchant'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/label_City'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Dealer Code_txtDealerCode'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Telephone_txtTelepon'), '021023903')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Latitude_txtlatitude'), '-19.46473')

WebUI.setText(findTestObject('Object Repository/Master Toko/Add Toko Failed/input_Longitude_txtlongitude'), '106.489599')

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Add Toko Failed/div_ErrorThe Dealer code field is required._49c3fb'))

WebUI.closeBrowser()

