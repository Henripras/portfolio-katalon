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

WebUI.openBrowser('', FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Data Menu'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Menu Tahun Ajaran'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Edit Tahun Ajaran/Icon Edit'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Edit Tahun Ajaran/Dropdown Edit tahun Selesai'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Edit Tahun Ajaran/Dropdown List Tahun Selesai'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Edit Tahun Ajaran/Pilih List Tahun Selesai'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Edit Tahun Ajaran/Pilih Tanggal Tahun Selesai'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Button Submit Tahun Ajaran'), FailureHandling.OPTIONAL)

