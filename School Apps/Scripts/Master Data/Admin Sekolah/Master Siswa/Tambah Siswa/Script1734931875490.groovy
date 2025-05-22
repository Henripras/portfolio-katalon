import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.util.Random as Random
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// Membuka browser dan navigasi ke halaman login
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

// Tambah data siswa baru
WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Page_Master Data Kelola Siswa/Button Tambah Siswa'))

// Mengisi data siswa
String randomName = generateRandomName()

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Field Nama Siswa'), randomName)

selectDropdownOption('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Dropdown Status', 'Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Value Dropdown Status')

selectDropdownOption('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Dropdown Tahun Ajaran', 'Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Value Dropdown Tahun Ajaran')

String randomPlaceOfBirth = generateRandomPlaceOfBirth()

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Field Tempat Lahir'), randomPlaceOfBirth)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Field Tanggal Lahir'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Dropdown Bulan'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Value Dropdown Bulan'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Dropdown Tahun'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Value Dropdown Tahun'))

pilihTanggal('15')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Dropdown Unit'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Value Dropdown Unit'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Dropdown Pilih Kelas'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Value Dropdown Kelas'))

String randomPhoneNumber = generateRandomPhoneNumber()

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Field Nomor Handphone'), randomPhoneNumber)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Field Email Orang Tua'), 'ortu.gs@gmail.com')

selectDropdownOption('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Dropdown Agama', 'Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Value Dropdown Agama')

String randomAddress = generateRandomAddress()

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Field Alamat'), randomAddress)

String randomNIS = generateRandomNIS(10)

WebUI.setText(findTestObject('Object Repository/Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Field NIS'), randomNIS)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Button Simpan'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Tambah Siswa/Button Ya' // Fungsi tambahan
        ))

String generateRandomName() {
    List<String> firstNames = ['Kristo', 'John', 'Michael', 'Sarah', 'Anna', 'David', 'Maria', 'James', 'Sophia', 'Liam']

    List<String> lastNames = ['Immanuel', 'Doe', 'Smith', 'Johnson', 'Williams', 'Brown', 'Jones', 'Davis', 'Miller', 'Wilson']

    Random random = new Random()

    return ((firstNames[random.nextInt(firstNames.size())]) + ' ') + (lastNames[random.nextInt(lastNames.size())])
}

String generateRandomPlaceOfBirth() {
    List<String> places = ['JAKARTA', 'BANDUNG', 'SURABAYA', 'YOGYAKARTA', 'MEDAN', 'SEMARANG', 'PALEMBANG', 'MAKASSAR', 'DENPASAR'
        , 'MANADO']

    return places[new Random().nextInt(places.size())]
}

String generateRandomPhoneNumber() {
    return '08' + (1000000000 + new Random().nextInt(900000000))
}

String generateRandomAddress() {
    List<String> streets = ['Jalan Merdeka', 'Jalan Raya', 'Jalan Sudirman', 'Jalan Pahlawan']

    List<String> cities = ['DKI JAKARTA', 'BANDUNG', 'SURABAYA', 'YOGYAKARTA']

    List<String> postalCodes = ['10110', '40221', '60211', '55222']

    Random random = new Random()

    return "$streets[random.nextInt(streets.size())], $cities[random.nextInt(cities.size())], $postalCodes[random.nextInt(postalCodes.size())]"
}

String generateRandomNIS(int length) {
    StringBuilder nis = new StringBuilder()

    Random random = new Random()

    for (int i = 0; i < length; i++) {
        nis.append(random.nextInt(10))
    }
    
    return nis.toString()
}

void pilihTanggal(String tanggal) {
    TestObject tanggalElement = new TestObject()

    tanggalElement.addProperty('xpath', ConditionType.EQUALS, "//p[text()='$tanggal' and contains(@class, 'cursor-pointer')]")

    WebUI.click(tanggalElement)
}

void selectDropdownOption(String dropdownPath, String valuePath) {
    WebUI.click(findTestObject(dropdownPath))

    WebUI.waitForElementVisible(findTestObject(valuePath), 10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject(valuePath))
}

