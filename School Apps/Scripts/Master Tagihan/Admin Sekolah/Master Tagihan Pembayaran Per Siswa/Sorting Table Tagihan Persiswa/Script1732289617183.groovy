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

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Menu Tagihan'))

WebUI.delay(1)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub-Menu Tagihan Persiswa'))

WebUI.delay(1)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Unit/Klik Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Unit/Pilih Value Unit'))

WebUI.delay(1)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Kelas/Klik Dropdown Kelas'))

WebUI.delay(1)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Kelas/Klik Field Cari Kelas'))

WebUI.delay(1)

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Kelas/Klik Field Cari Kelas'), 
    'XI IPA Biologi 2')

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Kelas/Pilih Kelas'))

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Field Nama/Klik Field Nama'), 
    'Dilan')

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Field Nama/Klik Hasil Cari Siswa'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tombol Terapkan/Klik Tombol Terapkan'))

WebUI.delay(1)

'Ascending\r\n'
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Filter/Filter By Nama tagihan'))

'Descending'
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Filter/Filter By Nama tagihan'))

WebUI.delay(1)

'Non-Reguler'
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Filter/Filter By Tipe Tagihan'))

'Reguler'
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Filter/Filter By Tipe Tagihan'))

WebUI.delay(1)

'Cheapest'
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Filter/Filter By Total Tagihan'))

'Most Expensive'
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Filter/Filter By Total Tagihan'))

WebUI.closeBrowser()

