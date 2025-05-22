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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.sekolah@gmail.com')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Menu Tagihan'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa'))

WebUI.verifyElementVisible(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Field Pencarian Siswa'))

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Field Pencarian Siswa'), 
    'adam')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Value Rekomendasi Siswa'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Value Rekomendasi Siswa'))

WebUI.waitForElementClickable(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Page Pembayaran Siswa/Button Riwayat Pembayaran'), 
    5)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Page Pembayaran Siswa/Button Riwayat Pembayaran'))

WebUI.waitForElementVisible(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Verifikasi Nama Siswa'), 
    5)

WebUI.verifyElementVisible(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Verifikasi Nama Siswa'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Nama Siswa Pada Riwayat Pembayaran Sama Dengan Pembayaran Siswa')

