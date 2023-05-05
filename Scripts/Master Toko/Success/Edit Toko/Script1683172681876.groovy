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

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/a_Toko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/a_Edit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Success/div_Edit Toko BliCicil Admin as'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Success/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '2', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Success/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '1', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Success/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '136', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Nama Toko_txtNamaToko'), 'Transmart Cilandak')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Outlet Name_txtNamaOutlet'), 'Transmart Cilandak ')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Dealer Code_txtDealerCode'), 'TC')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Telephone_txtTelepon'), '0891829124212')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Telephone_txtTelepon'), '123456789')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/textarea_Jl. Raya Cilandak KKO No.27, RT.1R_047286'), 
    'Jl. Raya Cilandak KKO No.27, RT.1/RW.5, Cilandak Tim, Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12560')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Latitude_txtlatitude'), '-6.300641')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Longitude_txtlongitude'), '106.814095')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Success/div_SuccessOKNoCancel'))

WebUI.delay(10)

WebUI.closeBrowser()

