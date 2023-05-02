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

'Membuka Chrome'
WebUI.openBrowser('')

'Mazimize Windows Chrome'
WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Products/Add Products/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Products/Add Products/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Products/Add Products/button_Login'))

'Mengklik menu produk'
WebUI.click(findTestObject('Object Repository/Products/Add Products/a_Products'))

'Mengklik button Add produk'
WebUI.click(findTestObject('Object Repository/Products/Add Products/span_New Product'))

'Membuka halaman Add Produk'
WebUI.getText(findTestObject('Object Repository/Products/Add Products/div_Add Product BliCicil Admin as'))

'Menginputkan nama produk'
WebUI.setText(findTestObject('Object Repository/Products/Add Products/input_Product Name_txtProductName'), 'tesss')

'Menginputkan deskripsi produk'
WebUI.setText(findTestObject('Object Repository/Products/Add Products/input_Product Slug_txtProductSlug'), 'tesss-1')

'Menginputkan deskripsi produk'
WebUI.setText(findTestObject('Object Repository/Products/Add Products/input_Product Desc_txtProductDesc'), 'testings')

WebUI.uploadFile(findTestObject('Products/Add Products/input_( 40 x 40 px )_txtProductImage'), 'C:/Users/202102359/Pictures/Dashboard/products.png')

FilePath = WebUI.getAttribute(findTestObject('Products/Add Products/input_( 40 x 40 px )_txtProductImage'), 'value')

WebUI.click(findTestObject('Object Repository/Products/Add Products/button_Submit'))

WebUI.getText(findTestObject('Object Repository/Products/Add Products/div_SuccessOKNoCancel'))

