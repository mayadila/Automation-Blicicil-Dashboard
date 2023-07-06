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

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/a_Toko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Success/select_TransmartPanasonicPolytronAsusSamsun_e34999'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Success/select_Aceh BaratAceh Barat DayaAceh BesarA_60dc3d'), 
    '429', true)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Nama Toko_txtNamaToko'), 'Asus Asyncron Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Outlet Name_txtNamaOutlet'), 'Asus Async Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/textarea_Jalan Kebayoran Baru No 10'), 'Jalan Kebayoran Baru Kav 20')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Dealer Code_txtDealerCode'), 'A003')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Telephone_txtTelepon'), '0239394444')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Latitude_txtlatitude'), '-20.30490494')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Success/input_Longitude_txtlongitude'), '109.37364474')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Success/button_Submit'))

