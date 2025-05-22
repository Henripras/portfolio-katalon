import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

WebUI.setText(findTestObject('Object Repository/Master Data/Admin Sekolah/Login/Field Email'), 'admin.sekolah@gmail.com')

WebUI.setText(findTestObject('Object Repository/Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Object Repository/Master Data/Admin Sekolah/Login/Button Submit'))

// Tunggu halaman pengumuman tampil
WebUI.waitForPageLoad(10)

// Verifikasi 3 elemen yang harus terlihat
boolean isElement1Visible = WebUI.verifyElementVisible(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Konten_Beranda/Informasi_Siswa_aktif'))

boolean isElement2Visible = WebUI.verifyElementVisible(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Konten_Beranda/Informasi_Transaksi_Pembayaran'))

boolean isElement3Visible = WebUI.verifyElementVisible(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Konten_Beranda/Informasi_Tagihan_Terbayar'))

// Memberikan komentar jika elemen terlihat
if (isElement1Visible) {
    WebUI.comment('Elemen 1 terlihat.')
} else {
    WebUI.comment('Elemen 1 TIDAK terlihat.')
}

if (isElement2Visible) {
    WebUI.comment('Elemen 2 terlihat.')
} else {
    WebUI.comment('Elemen 2 TIDAK terlihat.')
}

if (isElement3Visible) {
    WebUI.comment('Elemen 3 terlihat.')
} else {
    WebUI.comment('Elemen 3 TIDAK terlihat.')
}

// Menutup browser
WebUI.closeBrowser()

