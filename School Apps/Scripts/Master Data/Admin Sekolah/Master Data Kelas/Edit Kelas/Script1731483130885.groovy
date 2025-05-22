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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/HomePageMenu/Sidebar Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/HomePageMenu/Sub Menu Kelas'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Edit Kelas'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Unit/Pilih Unit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Unit/Klik Unit'), FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.clearText(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Suffix/Edit Suffix'))
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Suffix/Edit Suffix'), ' Laravel')
WebUI.click(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Suffix/Edit Suffix'))

// Array untuk menyimpan opsi suffix
String[] suffixArray = ['Laravel Beginner Course', 'Laravel Advanced Guide', 'PHP Crash Course', 'Mastering Laravel with PHP'
    , 'Laravel for Beginners', 'Full Stack PHP Development', 'Backend Laravel Pro', 'Laravel 4 With PHP', 'PHP Framework Essentials'
    , 'Laravel API Development']

// Pilih salah satu suffix secara acak
String randomSuffix = suffixArray[new Random().nextInt(suffixArray.length)]

// Clear existing text in the input field using CTRL+A and BACKSPACE
WebUI.sendKeys(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Suffix/Edit Suffix'), Keys.chord(Keys.CONTROL, 
        'a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Suffix/Edit Suffix'), Keys.chord(Keys.BACK_SPACE), 
    FailureHandling.CONTINUE_ON_FAILURE)

// Optional: Delay to ensure the field is cleared (depends on UI responsiveness)
WebUI.delay(1)

// Set the randomly selected suffix to the input field
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Suffix/Edit Suffix'), randomSuffix, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Edit Kelas/Modal Edit/Simpan/Simpan Perubahan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

