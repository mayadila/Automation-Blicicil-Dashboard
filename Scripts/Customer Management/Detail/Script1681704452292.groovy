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
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Detail/input_Email_email (1)'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Detail/input_Password_password (1)'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/button_Login (1)'))

'Mengklik menu customer management'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/span_Customer Management (1)'))

'Menginputkan kata kunci dihalaman pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Detail/input_Cari_filterSearch (1)'), '3404076403940005')

'Menekan tombol enter pada keyboard di kolom pencarian yang terisi'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Detail/input_Cari_filterSearch (1)'), Keys.chord(Keys.ENTER))

'Mengklik button detail pada kolom action'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/h3_User Profile'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_eva                                APPROVE'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_APPROVE'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/div_Nomor Handphone                        _36d261'))

'Mengklik button informasi alamat'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Domisili                        _8265d2'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Kecamatan                              _012674'))

'Mengklik button informasi pekerjaan'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Bidang Pekerjaan                       _31750d'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Perusahaan                      _2103c0'))

'Mengklik button informasi kontak'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Informasi Kontak Darurat               _ca057b'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Informasi Penjamin                     _204717'))

'Mengklik button foto identitas'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Foto KTP'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Foto Diri'))

'Mengklik button informasi nasabah'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Nasabah'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Email                           _5ab7b4'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Nomor Member -'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Limit maks'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Terpakai'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Sisa'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Tanggal Pengajuan'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi  Selesai'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi Berlangsung'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi Dibatalkan'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/img_User Profile_photo_profile'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Detail/input_Cari_filterSearch (1)'), '3204090209880001')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Detail/input_Cari_filterSearch (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail_1'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/h3_User Profile'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/img_User Profile_photo_profile_1'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/h4_felix audrey'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_PENDING'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Nomor Handphone                        _f6d6c2'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Nomor Member -'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Limit maks'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/div_Terpakai'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/div_Sisa'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Tanggal Pengajuan'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi  Selesai'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi Berlangsung'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi Dibatalkan'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Domisili                        _16757c'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Kecamatan                              _52b466'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Bidang Pekerjaan                       _31750d_1'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Perusahaan                      _2103c0'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Informasi Kontak Darurat               _ca057b'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Informasi Penjamin                     _204717'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Foto KTP'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Foto Diri'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Nasabah'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Email                           _6b0f09'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

WebUI.setText(findTestObject('Object Repository/Customer Managementt/Detail/input_Cari_filterSearch (1)'), '3205111203040001')

WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Detail/input_Cari_filterSearch (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Detail_1_2'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/h3_User Profile'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/img_User Profile_photo_profile_1'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/h4_Dava raihan agus'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_PENDING'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Nomor Handphone                        _1f071d'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Nomor Member -'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Limit maks'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Terpakai'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Sisa'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Tanggal Pengajuan'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi  Selesai'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi Berlangsung'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/p_Transaksi Dibatalkan'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Alamat'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Domisili                        _a525eb'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Kecamatan                              _84b4ce'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Pekerjaan'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Bidang Pekerjaan                       _31750d_1_2'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Perusahaan                      _3c5281'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Kontak'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Informasi Kontak Darurat               _ca057b'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Informasi Penjamin                     _204717'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Foto Identitas'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Foto KTP'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Foto Diri'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Informasi Nasabah'))

WebUI.getText(findTestObject('Object Repository/Customer Managementt/Detail/div_Alamat Email                           _d91bf5'))

WebUI.click(findTestObject('Object Repository/Customer Managementt/Detail/a_Customer Management'))

