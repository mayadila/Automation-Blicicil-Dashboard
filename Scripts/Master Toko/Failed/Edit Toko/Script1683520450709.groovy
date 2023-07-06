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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/a_Toko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_h thyn yn'), 'Jalan Wijya')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'PAN021')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '0211111')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-1.756')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '109.544467')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_h thyn yn'), 'Jl. Wijaya')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'PAN022')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '02123333')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-1.756588')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '109.5444')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_h thyn yn'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'PN003')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '021339393')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-1.756333444')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '109.544')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_h thyn yn'), 'Jl. Wijya')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '02139494949')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-67.3373833')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '109.5444676')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_h thyn yn'), 'Jl. Wijaya')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'P0202')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '021303030303')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '109.544467')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'pANASONIC sTORE')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'bbbbb')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_Outlet Name_col-sm-9'))

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Panasonic Store')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_h thyn yn'), 'Jl Wijaya')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'PAN2222')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '02133444')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-10.363636')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.closeBrowser()

