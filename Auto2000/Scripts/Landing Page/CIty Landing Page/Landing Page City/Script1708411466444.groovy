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
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

int retryCount = 0

int maxRetry = 3

boolean elementFound = false

while ((retryCount < maxRetry) && !(elementFound)) {
    try {
        WebUI.openBrowser('')

        WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat')

        WebUI.maximizeWindow()

        WebUI.delay(2)

        WebUI.click(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Chevron dropdown'))

        WebUI.click(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Chevron dropdown'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Location/Button List View'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Location/Button Minta Penawaran'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Location/Total branches displayed'))

        WebUI.scrollToPosition(0, 263)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Listing Branch'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Branch Cempaka putih'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/hero image cempaka putih'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Title Cempaka Putih'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Street Name Cempaka Putih'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Button Direction'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/layanan branch'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Layanan tersedia'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Button Hubungi Kami'))

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Map'))

        WebUI.scrollToPosition(0, 2531)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/Section Promo'), FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/Title Promo'), FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/Description section promo'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/List Promo'), FailureHandling.STOP_ON_FAILURE)

        WebUI.scrollToPosition(0, 2982)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Event/Section Event'), FailureHandling.OPTIONAL)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Event/Title Event'), FailureHandling.OPTIONAL)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Event/List event'), FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(0, 3525)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Information City/Section Information city'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Information City/Fill information city'), 
            FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Landing Page/City Landing Page/Section Information City/Lihat Selengkapnya'), FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(0, 3899)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Minta Penawaran/Section Minta Penawaran'))

        WebUI.scrollToPosition(0, 4615)

        WebUI.click(findTestObject('Landing Page/City Landing Page/Section FAQ/Question FAQ'))

        WebUI.click(findTestObject('Landing Page/City Landing Page/Section FAQ/Question FAQ'))

        WebUI.scrollToPosition(0, 5271)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Ulasan/Section Ulasan'))

        WebUI.scrollToPosition(0, 5922)

        WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Footer'))

        elementFound = true
    }
    catch (Exception e) {
        retryCount++

        WebUI.delay(2)
    } 
}

if (!(elementFound)) {
    WebUI.comment("Element not found after $maxRetry retries")

    throw new StepFailedException('Element not found')
}

