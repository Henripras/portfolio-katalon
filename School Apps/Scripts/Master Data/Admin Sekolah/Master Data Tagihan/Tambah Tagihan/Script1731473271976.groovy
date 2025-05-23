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

WebUI.navigateToUrl('https://dev-school-payment.aigs-rnd.tech/login')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.sekolah@gmail.com')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Menu Master Data'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Menu Tagihan'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button Tambah'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Nama Tagihan'), 'Jaldi')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Select Tipe Tagihan'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Pilih Tipe Tagihan'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Tagihan Regular'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Select Kelas'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/SVG Kelas'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Pilih Kelas'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Semua Kelas'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Kode Tagihan'), 'RRR123')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Jumlah Tagihan'), '750000')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Select Rekening Bank'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/CIMB'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Keterangan'), 'Katalon 2024')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button Generate'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button Tambahkan'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button YA'))

