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

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/a_Toko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/a_New Toko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_Add Toko BliCicil Admin as'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_Merchant'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_City'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Nama Toko_txtNamaToko'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Outlet Name_txtNamaOutlet'))

WebUI.delay(5)

WebUI.click(findTestObject('Master Toko/Failed/Add Toko/textarea_Address_txtAlamat'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Telephone_txtTelepon'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Latitude_txtlatitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Longitude_txtlongitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_ErrorThe Store name field is required.O_09bc32'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_Merchant'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_City'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.delay(5)

WebUI.click(findTestObject('Master Toko/Failed/Add Toko/textarea_Address_txtAlamat'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Outlet Name_txtNamaOutlet'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Telephone_txtTelepon'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Latitude_txtlatitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Longitude_txtlongitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_ErrorThe Address field is required.OKNoCancel'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_Merchant'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_City'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Outlet Name_txtNamaOutlet'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/textarea_Address_txtAlamat'), 'Jalan wijaya')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Telephone_txtTelepon'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Latitude_txtlatitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Longitude_txtlongitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_ErrorThe Outlet name field is required._e4b0d3'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_Merchant'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_City'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Nama Toko_txtNamaToko'), 'abcv')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'), '')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Telephone_txtTelepon'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Latitude_txtlatitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Longitude_txtlongitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_ErrorThe Dealer code field is required._49c3fb'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_Merchant'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_City'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'), 'ab')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Telephone_txtTelepon'), '')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Latitude_txtlatitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Longitude_txtlongitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_ErrorThe Telepon field is required.OKNoCancel'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_Merchant'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_City'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'), 'abc')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Telephone_txtTelepon'), '021023903')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Latitude_txtlatitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Longitude_txtlongitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_ErrorThe Latitude field is required.OKNoCancel'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_Merchant'))

WebUI.delay(5)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_City'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'), 'abc')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Telephone_txtTelepon'), '0210239033')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Latitude_txtlatitude'), '-19.4647')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Longitude_txtlongitude'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_ErrorThe Longitude field is required.OK_5f5eec'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_Merchant'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/label_City'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Nama Toko_txtNamaToko'), 'abc')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Outlet Name_txtNamaOutlet'), 'ABC')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/textarea_Address_txtAlamat'), 'Jalan wijaya kusuma')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Dealer Code_txtDealerCode'), '')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Telephone_txtTelepon'), '021023903')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Latitude_txtlatitude'), '-19.46473')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Failed/Add Toko/input_Longitude_txtlongitude'), '106.489599')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/button_Submit'))

WebUI.click(findTestObject('Object Repository/Master Toko/Failed/Add Toko/div_ErrorThe Dealer code field is required._49c3fb'))

WebUI.delay(10)

WebUI.closeBrowser()

