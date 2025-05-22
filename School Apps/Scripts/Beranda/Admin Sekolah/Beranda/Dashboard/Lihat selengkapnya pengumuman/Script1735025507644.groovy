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

WebUI.waitForElementVisible(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Isi_Konten_Page/Lable_Pengumuman_section'), 
    2)

try {
    // Klik tombol 'Selengkapnya' untuk membuka pengumuman lebih banyak
    WebUI.click(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Button_Selengkapnya/button_Selengkapnya'))

    WebUI.comment('Tombol "Selengkapnya" berhasil diklik.')
}
catch (Exception e) {
    WebUI.comment('Gagal mengklik tombol "Selengkapnya": ' + e.message)
} 

// Tunggu elemen pengumuman muncul
WebUI.waitForElementVisible(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Table_list/Isi_table'), 2)

try {
    // Scroll ke elemen pengumuman
    WebUI.scrollToElement(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Table_list/Isi_table'), 10)

    WebUI.comment('Elemen pengumuman berhasil di-scroll.')
}
catch (Exception e) {
    WebUI.comment('Gagal melakukan scroll ke elemen pengumuman: ' + e.message)
} 

// Mengambil teks dari elemen pengumuman
String announcementText = WebUI.getText(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Table_list/Isi_table'))

WebUI.comment('Teks yang diambil dari elemen: ' + announcementText)

// Klik pengumuman untuk melihat detail
WebUI.click(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Table_list/Isi_table'))

// Tunggu halaman detail pengumuman muncul
WebUI.waitForElementVisible(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Page_Hasil_Click/Label_After_Click'), 
    3)

// Mengambil teks dari label setelah klik
String labelText = WebUI.getText(findTestObject('Beranda/Admin Sekolah/Beranda/Dashboard/Page_Hasil_Click/Label_After_Click'))

WebUI.comment('Teks yang diambil dari label setelah klik: ' + labelText)

// Memeriksa kesesuaian teks dari elemen yang diklik dengan label yang muncul
if (announcementText == labelText) {
    WebUI.comment('Teks dari elemen yang diklik sesuai dengan label yang muncul: ' + labelText)
} else {
    WebUI.comment((('Teks dari elemen yang diklik TIDAK sesuai dengan label yang muncul. Teks elemen: ' + announcementText) + 
        ', Teks label: ') + labelText)
}

WebUI.closeBrowser()

