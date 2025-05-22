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

for (int i = 1; i <= 1; i++) {
    WebUI.callTestCase(findTestCase('Promo Nasional/Promo Mobil Baru'), [:] //1
        )

//    WebUI.callTestCase(findTestCase('Promo Nasional/Promo Semua'), [:] //2
//        )
//
//    WebUI.callTestCase(findTestCase('Events/Berita/Minta Penawaran Berita PDP'), [:] //3
//        )
//
//    WebUI.callTestCase(findTestCase('Events/Berita/PDP Berita'), [:] //4
//        )
//
//    WebUI.callTestCase(findTestCase('Events/Berita/Share Button Berita PDP'), [:] //5
//        )
//
//    WebUI.callTestCase(findTestCase('null'), [:] //6
//        )
//
//    WebUI.callTestCase(findTestCase('null'), [:] //7
//        )
//
//    WebUI.callTestCase(findTestCase('null'), [:] //8
//        )
//
//    WebUI.callTestCase(findTestCase('Review Produk PDP/Mobil Baru'), [:] //9
//        )
//
//    WebUI.callTestCase(findTestCase('Review Produk PDP/Servis/Servis Booking'), [:] //10
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Detail News by landing page city'), [:] //10
//        )
//
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Direct Map'), [:] //12
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Filter Showroom'), [:] //13
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/CIty Landing Page/Inquiry Mobil Baru Promo City'), [:] //13
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/CIty Landing Page/Inquiry News City'), [:] //14
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Filter Showroom'), [:] //15
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Inquiry Mobil Baru Promo City'), [:] //16
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Inquiry News City'), [:] //17
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Landing Page City'), [:] //18
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/List View'), [:] //19
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Minta Penawaran'), [:] //20
//        )
//		
//	WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Negative Case Minta Penawaran'), [:] //21
//		)
//
//    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Filter Showroom'), [:] //22
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Ae By Branch'), [:] //23
//        )
//
//    WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Event Branch'), [:] //24
//        )
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Katalog Mobil Baru By Branch'), [:] //25
//		)
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Produk Purna Jual'), [:] //26
//		)
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Promo Branch'), [:] //27
//		)
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Section Atas Branch Landing Page'), [:] //28
//		)
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Salesman LandingPage/Negative case'), [:] //29
//		)
//	
//	WebUI.callTestCase(findTestCase('Landing Page/Salesman LandingPage/News Salesman'), [:] //30
//		)
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Salesman LandingPage/Promo Salesman'), [:] //31
//		)
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Salesman LandingPage/Salesman Detail Page'), [:] //32
//		)
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Salesman LandingPage/Salesman Galeri Konsumen'), [:] //33
//		)
//		
//	WebUI.callTestCase(findTestCase('Landing Page/Salesman LandingPage/Salesman Landing Page'), [:] //34
//		)
}

