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

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Email_email'), 'eva.mayadila@megafinance.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/a_Master'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/a_Toko'))

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/a_Edit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_Edit Toko BliCicil Admin as'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '430', true)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_Jl. Raya Cilandak KKO No.27, RT.1R_639af4'), 
    'Jl. Raya Cilandak KKO No.27, RT.1/RW.5, Cilandak Tim, Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12560')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'TC1')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '12345678')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-6.300646')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '106.814095')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_ErrorThe Store name field is required.O_09bc32'))

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '430', true)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_Jl. Raya Cilandak KKO No.27, RT.1R_639af4'), 
    'Jl. Raya Cilandak KKO No.27, RT.1/RW.5, Cilandak Tim, Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 1256')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'TC2')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '12345678')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-6.300645')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '106.814093')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_ErrorThe Outlet name field is required._e4b0d3'))

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '427', true)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_Jl. Raya Cilandak KKO No.27, RT.1R_639af4'), 
    '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'TC3')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '12345678')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-6.300645')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '106.814093')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_ErrorThe Address field is required.OKNoCancel'))

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '430', true)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_Jl. Raya Cilandak KKO No.27, RT.1R_639af4'), 
    'Jl. Raya Cilandak KKO No.27, RT.1/RW.5, Cilandak Tim, Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 1256')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '12345678')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-6.300642')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '106.814090')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_ErrorThe Dealer code field is required._49c3fb'))

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '413', true)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_Jl. Raya Cilandak KKO No.27, RT.1R_639af4'), 
    'Jl. Raya Cilandak KKO No.27, RT.1/RW.5, Cilandak Tim, Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 1256')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'TC4')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-6.300644')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '106.814092')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_ErrorThe Telepon field is required.OKNoCancel'))

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '121', true)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_Jl. Raya Cilandak KKO No.27, RT.1R_639af4'), 
    'Jl. Raya Cilandak KKO No.27, RT.1/RW.5, Cilandak Tim, Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 1256')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'TC5')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '12345678')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_ErrorThe Latitude field is required.OKNoCancel'))

WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_TransmartPanasonicPolytronAsusSamsun_36b03e'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master Toko/Edit Toko Failed/select_Aceh SelatanBalanganBalikpapanBantae_4910c5'), 
    '100', true)

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Nama Toko_txtNamaToko'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Outlet Name_txtNamaOutlet'), 'Transmart Cilandak')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/textarea_Jl. Raya Cilandak KKO No.27, RT.1R_639af4'), 
    'Jl. Raya Cilandak KKO No.27, RT.1/RW.5, Cilandak Tim, Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 1250')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Dealer Code_txtDealerCode'), 'TC6')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Telephone_txtTelepon'), '424452435')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Latitude_txtlatitude'), '-6.300646')

WebUI.setText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/input_Longitude_txtlongitude'), '')

WebUI.click(findTestObject('Object Repository/Master Toko/Edit Toko Failed/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Master Toko/Edit Toko Failed/div_ErrorThe Longitude field is required.OK_5f5eec'))

WebUI.closeBrowser()

