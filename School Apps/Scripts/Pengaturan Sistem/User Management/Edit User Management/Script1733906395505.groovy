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
import java.util.UUID as UUID
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.WebElement as WebElement

// Fungsi untuk melakukan zoom out menggunakan JavaScript
//def setZoomOut() {
//    String zoomOutScript = """
//        document.body.style.zoom = '90%';
//    """
//    WebUI.executeJavaScript(zoomOutScript, null)
//}

// Membuka browser dan navigasi ke URL
WebUI.openBrowser('')

// Maksimalkan window browser
WebUI.maximizeWindow()

// Navigasi ke URL yang diinginkan
WebUI.navigateToUrl('https://sit.siprusedu.com/login')

// Mengatur zoom out
//setZoomOut()

// Login ke aplikasi
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

// Navigasi ke menu User Management
WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Menu User Management'))

boolean isEditEnabled = false

int index = 0 // Indeks awal untuk Tridot Action

int maxAttempts = 10 // Jumlah maksimum percobaan untuk Tridot

// Loop untuk memastikan tombol Edit aktif atau mencapai batas percobaan
while (!(isEditEnabled) && (index < maxAttempts)) {
    TestObject tridotAction = new TestObject('dynamicTridotAction')

    // XPath dinamis untuk Tridot berdasarkan indeks
    tridotAction.addProperty('xpath', ConditionType.EQUALS, ('(//div[@class=\'flex h-full flex-1 items-center justify-center\'])[' + 
        (index + 1)) + ']')

    // Verifikasi apakah Tridot terlihat
    if (WebUI.waitForElementVisible(tridotAction, 5)) {
        WebUI.comment('Tridot terlihat, mencoba klik...')

        // Tunggu hingga elemen dapat diklik
        WebUI.waitForElementClickable(tridotAction, 5)

        // Klik Tridot Action
        WebUI.click(tridotAction)

        WebUI.delay(1) // Beri waktu untuk pop-up muncul

        // Tambahkan elemen Edit aktif
        TestObject editButtonEnabled = new TestObject('dynamicEditButtonEnabled')

        editButtonEnabled.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'hover- group flex cursor-pointer items-center space-x-2 rounded-md px-4 py-2 text-blue10 hover:bg-blue1 hover:text-blue7\') and .//p[text()=\'Edit\']]')

        // Tambahkan elemen Edit disable
        TestObject editButtonDisabled = new TestObject('dynamicEditButtonDisabled')

        editButtonDisabled.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'hover- group flex items-center space-x-2 rounded-md px-4 py-2 hover:bg-blue1 hover:text-blue7 bg-neutral4 text-neutral7 cursor-default\') and .//p[text()=\'Edit\']]')

        // Periksa apakah tombol Edit aktif
        if (WebUI.waitForElementVisible(editButtonEnabled, 1)) {
            WebUI.comment('Tombol Edit aktif, melanjutkan ke langkah berikutnya...')

            isEditEnabled = true // Set flag menjadi true jika tombol aktif

            // Tambahkan logika untuk tombol aktif
            WebUI.click(editButtonEnabled)

            WebUI.comment('Tombol Edit telah diklik.') // Pindah ke Tridot berikutnya
            // Pindah ke Tridot berikutnya
        } else if (WebUI.waitForElementVisible(editButtonDisabled, 1)) {
            WebUI.comment('Tombol Edit dalam keadaan disable, mencoba Tridot berikutnya...')

            index++
        } else {
            WebUI.comment('Tombol Edit tidak ditemukan, mencoba Tridot berikutnya...')

            index++
        }
        // Pindah ke Tridot berikutnya
    } else {
        WebUI.comment('Tridot tidak dapat dilihat, mencoba Tridot berikutnya...')

        index++
    }
}

// Log jika tidak ditemukan tombol Edit yang aktif
if (!(isEditEnabled)) {
    WebUI.comment(('Tidak ada tombol Edit yang aktif setelah mencoba ' + maxAttempts) + ' Tridot.')
}

// Membersihkan teks pada field Username
boolean isTextCleared = false

while (!(isTextCleared)) {
    WebUI.clearText(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Username'))

    WebUI.delay(1)

    String currentText = WebUI.getAttribute(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Username'), 
        'value')

    isTextCleared = currentText.isEmpty()

    if (!(isTextCleared)) {
        WebUI.comment('Teks belum clear, mencoba ulang...')
    }
}

// Generate username random
String randomUsername = 'user_' + UUID.randomUUID().toString().substring(0, 8)

WebUI.setText(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Username'), randomUsername)

WebUI.comment("Teks berhasil di-clear dan teks baru '$randomUsername' telah di-set.")

// Simpan perubahan
WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Edit User Management/Button Simpan'))

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Edit User Management/Button YA popup'))

// Tambahan: Tutup browser setelah selesai
WebUI.closeBrowser()
