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

// Built In Keywords Demo

// Open Browser
WebUI.openBrowser("")

// Give the URL
WebUI.navigateToUrl("https://demo.guru99.com/test/newtours/")

// Maximize Window
WebUI.maximizeWindow()

// Capture your URL
String Url = WebUI.getUrl()
System.out.println(Url)

// Window Number
System.out.println(WebUI.getWindowIndex())

// Display Title of the Window
System.out.println(WebUI.getWindowTitle())

WebUI.delay(6)

WebUI.navigateToUrl("https://www.kotak.com/en/home.html")

WebUI.delay(7)

// Moving Backword(Previous)Window
WebUI.back()

WebUI.delay(5)

// Moving Forword Window
WebUI.forward()

WebUI.delay(5)

// Get URL of Kotak
System.out.println(WebUI.getUrl())
int windowNo = WebUI.getWindowIndex()
System.out.println(windowNo)
System.out.println(WebUI.getWindowTitle())



// Navigate to Quora
WebUI.navigateToUrl("https://www.quora.com/profile/Abhishek-Tr")

// Get URL of Quora
System.out.println(WebUI.getUrl())
int windowNo_1 = WebUI.getWindowIndex()
System.out.println(windowNo_1)
System.out.println(WebUI.getWindowTitle())


WebUI.delay(5)

// Clicking OR object
WebUI.click(findTestObject('Object Repository/Quora_OR/Page_Abhishek Tr - Quora/span_Abhishek Tr'))

// Switch Window Index To: 1
WebUI.switchToWindowIndex(1)

// Printing of window index 
System.out.println(WebUI.getWindowIndex())


WebUI.switchToWindowIndex(0)

WebUI.delay(5)

WebUI.back()

WebUI.delay(5)

// Landed on mercury tour 
WebUI.back()


// Build logic on mercury tour Login
// Capture objects(With SPY WEB)
// Steps

// Open Browser
WebUI.openBrowser('')

// give the URL 
WebUI.navigateToUrl("https://demo.guru99.com/test/newtours/")

// Enter User Name
WebUI.click(findTestObject('Object Repository/Mercury_Tour_OR/Page_Welcome Mercury Tours/input_User                     Name_userName'))

// Enter Password
WebUI.click(findTestObject('Object Repository/Mercury_Tour_OR/Page_Welcome Mercury Tours/input_Password_password'))

// Click nn Submit
WebUI.click(findTestObject('Object Repository/Mercury_Tour_OR/Page_Welcome Mercury Tours/input_Password_submit'))

// Verify the Login Successfully Element is Present or Not
WebUI.verifyElementPresent(findTestObject('Object Repository/Mercury_Tour_OR/Page_Login Mercury Tours/h3_Login Successfully'), 0)

// Close Broswer
WebUI.closeBrowser()

