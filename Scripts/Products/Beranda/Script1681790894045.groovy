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

WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Products/Beranda/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password'
WebUI.setEncryptedText(findTestObject('Object Repository/Products/Beranda/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Login'))

'Mengklik menu products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/span_Products'))

'Membuka halaman list products'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_List Products BliCicil Admin as        _565225'))

'Menampilkan table berisi Product terdiri dari Image, Name, Deskripsi'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Product'))

'Menampilkan table berisi image products'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Image'))

'Menampilkan table berisi name products'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Name'))

'Menampilkan table berisi deskripsi products'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Desc'))

'Menampilkan table berisi Loan terdiri dari Request, Approbe, Decline'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Loan'))

'Menampilkan table berisi request loan'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Request'))

'Menampilkan table berisi approve loan'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Approve'))

'Menampilkan table berisi decline loan'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Decline'))

'Menampilkan table berisi last update products'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Last Update'))

'Menampilkan table berisi status products'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Status'))

'Menampilkan table berisi action products [Deactivate, Activate]'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/th_Action'))

'Mengklik button Deactivate untuk menonaktifkan products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Deactivate'))

'Menampilkan popup "Are you sure want to deactivate "Nama Produk" ?'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_Are you sure want to deactivate Elektro_3becbc'))

'Mengklik button No "Jika tidak ingin menonaktifkan products"'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_No'))

'Mengklik button Deactivate untuk menonaktifkan products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Deactivate'))

'Menampilkan popup "Are you sure want to deactivate "Nama Produk" ?'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_Are you sure want to deactivate Elektro_3becbc'))

'Mengklik button Yes "Jika ingin menonaktifkan products"'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Yes'))

'Mengklik button Activate untuk mengaktifkan products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Activate'))

'Are you sure want to activate "Nama Produk" ?'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_Are you sure want to activate Elektroni_a747f7'))

'Mengklik button No "Jika tidak ingin mengaktifkan products"'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_No'))

'Mengklik button Activate untuk mengaktifkan products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Activate'))

'Are you sure want to activate "Nama Produk" ?'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_Are you sure want to activate Elektroni_a747f7'))

'Mengklik button Yes "Jika ingin mengaktifkan products"'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Yes'))

'Kolom pencarian'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/label_Search'))

'Menginputkan kata kunci dikolom pencarian'
WebUI.setText(findTestObject('Object Repository/Products/Beranda/input_Search_form-control form-control-sm'), 'Motor')

'Menekan enter di kolom pencarian yang sudah terisi untuk menampilkan hasilnya'
WebUI.sendKeys(findTestObject('Object Repository/Products/Beranda/input_Search_form-control form-control-sm'), Keys.chord(
        Keys.ENTER))

'Menginputkan kata kunci dikolom pencarian'
WebUI.setText(findTestObject('Object Repository/Products/Beranda/input_Search_form-control form-control-sm'), 'Multigu')

'Menekan enter di kolom pencarian yang sudah terisi untuk menampilkan hasilnya'
WebUI.sendKeys(findTestObject('Object Repository/Products/Beranda/input_Search_form-control form-control-sm'), Keys.chord(
        Keys.ENTER))

'Mengklik button Deactivate untuk menonaktifkan products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Deactivate'))

'Menampilkan popup "Are you sure want to deactivate "Nama Produk" ?'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_Are you sure want to deactivate Multigu_4a77ed'))

'Mengklik button No "Jika tidak ingin menonaktifkan products"'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_No'))

'Mengklik button Deactivate untuk menonaktifkan products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Deactivate'))

'Menampilkan popup "Are you sure want to deactivate "Nama Produk" ?'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_Are you sure want to deactivate Multigu_4a77ed'))

'Mengklik button Yes "Jika ingin menonaktifkan products"'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Yes'))

'Menginputkan kata kunci dikolom pencarian'
WebUI.setText(findTestObject('Object Repository/Products/Beranda/input_Search_form-control form-control-sm'), 'elektronik')

'Menekan enter di kolom pencarian yang sudah terisi untuk menampilkan hasilnya'
WebUI.sendKeys(findTestObject('Object Repository/Products/Beranda/input_Search_form-control form-control-sm'), Keys.chord(
        Keys.ENTER))

'Mengklik button Deactivate untuk menonaktifkan products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Deactivate'))

'Menampilkan popup "Are you sure want to deactivate "Nama Produk" ?'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_Are you sure want to deactivate Elektro_3becbc'))

'Mengklik button No "Jika tidak ingin menonaktifkan products"'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_No'))

'Mengklik button Deactivate untuk menonaktifkan products'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Deactivate'))

'Menampilkan popup "Are you sure want to deactivate "Nama Produk" ?'
WebUI.getText(findTestObject('Object Repository/Products/Beranda/div_Are you sure want to deactivate Elektro_3becbc'))

'Mengklik button Yes "Jika ingin menonaktifkan products"'
WebUI.click(findTestObject('Object Repository/Products/Beranda/button_Yes'))

'Merefresh halaman list Products'
WebUI.refresh()

