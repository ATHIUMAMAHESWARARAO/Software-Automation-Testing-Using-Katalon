import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com')

WebUI.click(findTestObject('Object Repository/Facebook_page_OR/Page_Facebook  log in or sign up/a_Create new account'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Facebook_page_OR/Page_Facebook  log in or sign up/select_123456789101112131415161718192021222_566da4'), 
    dayElement, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Facebook_page_OR/Page_Facebook  log in or sign up/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    monthElement, true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Facebook_page_OR/Page_Facebook  log in or sign up/select_202320222021202020192018201720162015_325a87'), 
    yearElement, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

