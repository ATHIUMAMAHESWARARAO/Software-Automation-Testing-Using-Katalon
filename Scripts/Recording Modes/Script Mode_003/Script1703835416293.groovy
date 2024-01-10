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

// Katalon Cura Health Service

// Steps

// Open Browser

WebUI.openBrowser("")

// Maximize Window

WebUI.maximizeWindow()

// Give the URL

WebUI.navigateToUrl("https://katalon-demo-cura.herokuapp.com/")

// Click on Make Appointment

WebUI.click(findTestObject('Object Repository/Cura_OR/Page_CURA Healthcare Service/a_Make Appointment'))

// Set User Name

WebUI.setText(findTestObject('Object Repository/Cura_OR/Page_CURA Healthcare Service/input_Username_username'), "John Doe")

// Set Password

WebUI.setText(findTestObject('Object Repository/Cura_OR/Page_CURA Healthcare Service/input_Password_password'), "ThisIsNotAPassword")

// Click on Login button

WebUI.click(findTestObject('Object Repository/Cura_OR/Page_CURA Healthcare Service/button_Login'))

// Verify the Make Appointment Elememt is Present 

WebUI.verifyElementPresent(findTestObject('Object Repository/Cura_OR/Page_CURA Healthcare Service/h2_Make Appointment'), 0)

// Close Bowser

WebUI.closeBrowser()