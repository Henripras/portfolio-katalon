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

// Memanggil test case Tambah Akun Bank
WebUI.callTestCase(findTestCase('Master Data/Admin Sekolah/Master Data Akun Bank/Tambah Akun Bank'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

// Memanggil test case Edit Kelas
WebUI.callTestCase(findTestCase('Test Cases/Master Data/Admin Sekolah/Master Data Kelas/Edit Kelas'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

// Memanggil test case Tambah Kelas
WebUI.callTestCase(findTestCase('Test Cases/Master Data/Admin Sekolah/Master Data Kelas/Tambah Kelas'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

// Memanggil test case Filter Tagihan
WebUI.callTestCase(findTestCase('Test Cases/Master Data/Admin Sekolah/Master Data Tagihan/Filter Tagihan'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

// Memanggil test case Lihat Tagihan
WebUI.callTestCase(findTestCase('Test Cases/Master Data/Admin Sekolah/Master Data Tagihan/Lihat Tagihan'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

// Memanggil test case Tambah Tagihan
WebUI.callTestCase(findTestCase('Test Cases/Master Data/Admin Sekolah/Master Data Tagihan/Tambah Tagihan'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

// Memanggil test case Edit Tahun Ajaran
WebUI.callTestCase(findTestCase('Test Cases/Master Data/Admin Sekolah/Master Data Tahun Ajaran/Edit Tahun Ajaran'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

// Memanggil test case Tambah Tahun Ajaran
WebUI.callTestCase(findTestCase('Test Cases/Master Data/Admin Sekolah/Master Data Tahun Ajaran/Tambah Tahun Ajaran'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

// Memanggil test case Tambah Sekolah
WebUI.callTestCase(findTestCase('Test Cases/Master Data/Super Admin/Master Data Sekolah/Tambah Sekolah'), [:] // Kosongkan map jika tidak ada parameter
    , FailureHandling.CONTINUE_ON_FAILURE)

