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

WebUI.maximizeWindow()

'Membuka halaman login'
WebUI.navigateToUrl('https://uat-dashboard.blicicil.com/auth/login')

'Menginputkan email valid'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Success/Detail/input_Email_email'), 'eva.mayadila@megafinance.co.id')

'Menginputkan password valid'
WebUI.setEncryptedText(findTestObject('Object Repository/Customer Managementt/Success/Detail/input_Password_password'), 'aeHFOx8jV/A=')

'Mengklik button login'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/button_Login'))

'Mengklik menu customer management'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/span_Customer Management'))

WebUI.delay(5)

'Mengklik button button Detail pada action '
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Detail'))

'Membuka halaman Detail User Profil'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/h3_User Profile'))

'Menampilkan foto user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/img_User Profile_photo_profile'))

'Menampilkan nama user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_felix audrey                           _5c819a'))

'Menampilkan status pengajuan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_PENDING'))

'Menampilkan nomor telpon user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Nomor Handphone                        _f6d6c2'))

'Menampilkan nomor member'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Nomor Member -'))

'Menampilkan limit plafon modal instan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Limit maks'))

'Menampilkan limit plafon modal instan yang terpakai'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Terpakai'))

'Menampilkan sisa limit plafon modal instan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Sisa'))

'Menampilkan tanggal pengajuan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Tanggal Pengajuan'))

'Jumlah transaksi selesai'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi  Selesai'))

'Jumlah transaksi berlangsung'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi Berlangsung'))

'Menampilkan jumlah transaksi dibatalkan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi Dibatalkan'))

WebUI.delay(5)

'Mengklik button Informasi Alamat'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Alamat'))

'Menampilkan Alamat Domisili, RT/RW, Provinsi, Kota'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Domisili                        _16757c'))

'Menampilkan  Kecamatan, Kelurahan, Kode Pos, Status Rumah'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Kecamatan                              _52b466'))

'Mengklik button Informasi Pekerjaan'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Pekerjaan'))

'Menampilkan Bidang Pekrjaan, Tipe Pekerjaan, Jabatan, Penghasilan Bulanan, Nama Perusahaan, Telepon Perusahaan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Bidang Pekerjaan                       _31750d'))

'Menampilkan Alamat Perusahaan, Provinsi, Kota, Kecamatan, Kelurahan, Kode Pos'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Perusahaan                      _2103c0'))

'Mengklik button Informasi Kontak'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Kontak'))

'Menmapilkan informasi kontak darurat : Nama Lengkap, nomor handphone, hubungan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Informasi Kontak Darurat               _ca057b'))

'Menampilkan informasi penjamin : NIK KTP, Nama Lengkap, Tanggal lahir, Nomor Handphone'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Informasi Penjamin                     _204717'))

WebUI.delay(5)

'Mengklik button Foto Identitas'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Foto Identitas'))

'Menampilkan Foto KTP'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Foto KTP'))

'Menampilkan foto selfie'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Foto Diri'))

WebUI.delay(5)

'Mengklik button Informasi Nasabah'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Nasabah'))

'Menampilkan Alamat Email, NIK, Status Pernikahan, Nama Ibu Kandung'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Email                           _6b0f09'))

WebUI.delay(5)

'Mengklik breadcumb Customer Management "untuk kembali ke halaman customer management"'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Customer Management'))

WebUI.delay(5)

'Menginputkan kata kunci di kolom pencarian'
WebUI.setText(findTestObject('Object Repository/Customer Managementt/Success/Detail/input_Cari_filterSearch'), '3404076403940005')

'Menekan tombol enter keyboard di kolom pencarian yang terisi'
WebUI.sendKeys(findTestObject('Object Repository/Customer Managementt/Success/Detail/input_Cari_filterSearch'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

'Mengklik button Detail pada action '
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Detail_1'))

'Membuka halaman Detail User Profil'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/h3_User Profile'))

'Menampilkan foto user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/img_User Profile_photo_profile_1'))

'Menampilkan nama user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_eva                                APPROVE'))

'Menampilkan status pengajuan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_APPROVE'))

'Menampilkan nomor handphone user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Nomor Handphone                        _36d261'))

'Menampilkan nomor member user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Nomor Member -'))

'Menampilkan limit plafon modal instan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Limit maks'))

'Menampilkan limit plafon modal instan yang dipakai'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Terpakai'))

'Menampilkan sisa limit plafon'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Sisa'))

'Menampilkan tanggal pengajuan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Tanggal Pengajuan'))

'Menampilkan jumlah transaksi selesai'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi  Selesai'))

'Menampilkan jumlah transaksi berlangsung'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi Berlangsung'))

'Menampilkan jumlah transaksi dibatalkan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi Dibatalkan'))

WebUI.delay(5)

'Mengklik button Informasi Alamat'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Alamat'))

'Menampilkan Alamat Domisili, RT/RW, Provinsi, Kota'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Domisili                        _8265d2'))

'Menampilkan  Kecamatan, Kelurahan, Kode Pos, Status Rumah'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Kecamatan                              _012674'))

WebUI.delay(5)

'Mengklik button Informasi Pekerjaan'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Pekerjaan'))

'Menampilkan Bidang Pekrjaan, Tipe Pekerjaan, Jabatan, Penghasilan Bulanan, Nama Perusahaan, Telepon Perusahaan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Bidang Pekerjaan                       _31750d_1'))

'Menampilkan Alamat Perusahaan, Provinsi, Kota, Kecamatan, Kelurahan, Kode Pos'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Perusahaan                      _2103c0'))

WebUI.delay(5)

'Mengklik button Informasi Kontak'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Kontak'))

'Menmapilkan informasi kontak darurat : Nama Lengkap, nomor handphone, hubungan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Informasi Kontak Darurat               _ca057b'))

'Menampilkan informasi penjamin : NIK KTP, Nama Lengkap, Tanggal lahir, Nomor Handphone'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Informasi Penjamin                     _204717'))

WebUI.delay(5)

'Mengklik button Foto Identitas'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Foto Identitas'))

'Menampilkan Foto KTP'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Foto KTP'))

'Menampilkan foto selfie'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Foto Diri'))

WebUI.delay(5)

'Mengklik button Informasi Nasabah'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Nasabah'))

'Menampilkan Alamat Email, NIK, Status Pernikahan, Nama Ibu Kandung'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Email                           _5ab7b4'))

WebUI.delay(5)

'Mengklik breadcumb Customer Management "untuk kembali ke halaman customer management"'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Customer Management'))

WebUI.delay(5)

'Mengklik button Detail pada action '
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Detail_1_2'))

'Membuka halaman Detail User Profil'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/h3_User Profile'))

'Menampilkan foto user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/img_User Profile_photo_profile'))

'Menampilkan nama user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_MARLINA FAUZI MIRRA                    _e6d747'))

'Menampilkan status pengajuan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_REJECT'))

'Menampilkan nomor handphone user'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Nomor Handphone                        _20eaec'))

'Menampilkan nomor member'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Nomor Member -'))

'Menampilkan limt plafon modal instan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Limit maks'))

'Manmpilkan limit plafon yang dipakai'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Terpakai'))

'Menampilkan sisa limit plafon'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Sisa'))

'Menampilkan tanggal pengajuan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Tanggal Pengajuan'))

'Menampilkan jumlah transaksi selesai'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi  Selesai'))

'Menampilkan jumlah transaksi berlangsung'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi Berlangsung'))

'Menampilkan jumlah transaksi dibatalkan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/p_Transaksi Dibatalkan'))

WebUI.delay(5)

'Mengklik button Informasi Alamat'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Alamat'))

'Menampilkan Alamat Domisili, RT/RW, Provinsi, Kota'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Domisili                        _794710'))

'Menampilkan  Kecamatan, Kelurahan, Kode Pos, Status Rumah'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Kecamatan                              _ea67e0'))

WebUI.delay(5)

'Mengklik button Informasi Pekerjaan'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Pekerjaan'))

'Menampilkan Bidang Pekrjaan, Tipe Pekerjaan, Jabatan, Penghasilan Bulanan, Nama Perusahaan, Telepon Perusahaan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Bidang Pekerjaan                       _31750d_1_2'))

'Menampilkan Alamat Perusahaan, Provinsi, Kota, Kecamatan, Kelurahan, Kode Pos'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Perusahaan                      _bde7bf'))

WebUI.delay(5)

'Mengklik button Informasi Kontak'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Kontak'))

'Menmapilkan informasi kontak darurat : Nama Lengkap, nomor handphone, hubungan'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Informasi Kontak Darurat               _ca057b'))

'Menampilkan informasi penjamin : NIK KTP, Nama Lengkap, Tanggal lahir, Nomor Handphone'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Informasi Penjamin                     _204717'))

WebUI.delay(5)

'Mengklik button Foto Identitas'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Foto Identitas'))

'Menampilkan Foto KTP'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Foto KTP'))

'Menampilkan foto selfie'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Foto Diri'))

WebUI.delay(5)

'Mengklik button Informasi Nasabah'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Informasi Nasabah'))

'Menampilkan Alamat Email, NIK, Status Pernikahan, Nama Ibu Kandung'
WebUI.getText(findTestObject('Object Repository/Customer Managementt/Success/Detail/div_Alamat Email                           _f4f1cc'))

WebUI.delay(5)

'Mengklik breadcumb customer management untuk kembali ke halaman customer management'
WebUI.click(findTestObject('Object Repository/Customer Managementt/Success/Detail/a_Customer Management'))

WebUI.delay(5)

WebUI.closeBrowser()

