import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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
import java.util.Random as Random
import java.util.Arrays as Arrays
import org.openqa.selenium.WebElement as WebElement

// Fungsi menunggu spinner hilang
void waitForSpinnerToDisappear(String spinnerXpath, int timeout) {
	TestObject spinner = new TestObject()
	spinner.addProperty('xpath', ConditionType.EQUALS, spinnerXpath)
	int elapsedTime = 0
	int interval = 1

	while (WebUI.verifyElementPresent(spinner, 1, FailureHandling.OPTIONAL)) {
		WebUI.comment('Spinner masih terlihat. Menunggu...')
		WebUI.delay(interval)
		elapsedTime += interval
		if (elapsedTime >= timeout) {
			WebUI.comment("Timeout menunggu spinner hilang setelah $timeout detik.")
			WebUI.closeBrowser()
			return
		}
	}
	WebUI.comment('Spinner telah hilang.')
}

// Fungsi untuk menghapus field menggunakan JavaScript
void clearFieldUsingJavaScript(TestObject testObject) {
	// Perbaikan: Menambahkan timeout pada findWebElement
	WebElement fieldElement = WebUI.findWebElement(testObject, 10) // Timeout 10 detik
	WebUI.executeJavaScript('arguments[0].value = "";', Arrays.asList(fieldElement))
}

// Fungsi untuk menghasilkan data acak
String generateRandomName() {
	List<String> firstNames = ['Ahmad', 'Budi', 'Siti', 'Dian', 'Rina', 'Agus', 'Maya', 'Joko']
	List<String> lastNames = ['Pratama', 'Putra', 'Sari', 'Wibisana', 'Gunawan', 'Santoso', 'Amir', 'Kusuma']
	Random random = new Random()
	return firstNames[random.nextInt(firstNames.size())] + ' ' + lastNames[random.nextInt(lastNames.size())]
}

String generateRandomNIS() {
	return (1000000000 + new Random().nextInt(900000000)) as String
}

String generateRandomPhoneNumber() {
	return '08' + (100000000 + new Random().nextInt(900000000))
}

String generateRandomAddress() {
	List<String> streets = ['Jl. Raya', 'Jl. Merdeka', 'Jl. Pahlawan', 'Jl. Kemerdekaan', 'Jl. Sudirman']
	List<String> cities = ['Jakarta', 'Bandung', 'Surabaya', 'Medan', 'Yogyakarta']
	Random random = new Random()
	return streets[random.nextInt(streets.size())] + ', ' + cities[random.nextInt(cities.size())] + ', Indonesia'
}

String generateRandomPlaceOfBirth() {
	List<String> cities = ['Jakarta', 'Bandung', 'Surabaya', 'Medan', 'Yogyakarta']
	Random random = new Random()
	return cities[random.nextInt(cities.size())]
}

// Fungsi untuk membersihkan dan mengisi field input
void clearAndInput(TestObject testObject, String newValue) {
	clearFieldUsingJavaScript(testObject) // Clear the field using JavaScript
	WebUI.setText(testObject, newValue) // Input the new value
}

// Eksekusi
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://sit.siprusedu.com/login')

// Login
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')
WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

// Navigasi ke menu "Kelola Siswa"
WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Data Menu'))
WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Filter Dan Search Siswa/Page_Beranda/Sub Menu Kelola Siswa'))

// Edit Siswa
WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Button Action'))
WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Button Edit'))

// Tunggu spinner hilang
String spinnerXpath = '//div[@data-testid=\'loading-spinner\']'
waitForSpinnerToDisappear(spinnerXpath, 30)

// Clear and input values
clearAndInput(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Field Nama Siswa'), generateRandomName())
clearAndInput(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Field NIS'), generateRandomNIS())
clearAndInput(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Field Tempat Lahir'), generateRandomPlaceOfBirth())
clearAndInput(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Field Nomor Handphone'), generateRandomPhoneNumber())
clearAndInput(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Field Alamat'), generateRandomAddress())

// Simpan data
boolean isConfirmationHandled = false
for (int i = 0; i < 3; i++) {
	WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Button Simpan'))
	if (WebUI.waitForElementVisible(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Modal Konfirmasi'), 5)) {
		WebUI.comment('Modal konfirmasi muncul, melanjutkan ke langkah berikutnya.')
		WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Edit Siswa/Button Ya'))
		isConfirmationHandled = true
		break
	} else {
		WebUI.comment('Modal konfirmasi belum muncul, mencoba ulang...')
	}
}

if (!isConfirmationHandled) {
	WebUI.comment('Modal konfirmasi tidak muncul setelah 3 kali percobaan.')
}

// Tutup browser
WebUI.closeBrowser()
