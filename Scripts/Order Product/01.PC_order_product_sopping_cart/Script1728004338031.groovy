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

WebUI.click(findTestObject('Homepage/Shopping Cart/btn_checkout'))

WebUI.click(findTestObject('Checkout/field_fisrt_name'))

WebUI.setText(findTestObject('Checkout/field_fisrt_name'), 'John')

WebUI.click(findTestObject('Checkout/field_last_name'))

WebUI.setText(findTestObject('Checkout/field_last_name'), 'Doe')

WebUI.click(findTestObject('Checkout/field_address'))

WebUI.setText(findTestObject('Checkout/field_address'), 'Cileungsi')

WebUI.click(findTestObject('Checkout/select_country'))

WebUI.selectOptionByValue(findTestObject('Checkout/select_country'), 'Indonesia', false)

WebUI.click(findTestObject('Checkout/select_city'))

WebUI.setText(findTestObject('Checkout/field_search_city'), 'cileungsi')

WebUI.waitForPageLoad(3)

WebUI.sendKeys(findTestObject('Checkout/field_search_city'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Checkout/dropdown_zip_code'))

WebUI.sendKeys(findTestObject('Checkout/dropdown_zip_code'), '16820' + Keys.ENTER)

WebUI.click(findTestObject('Checkout/phone_number'))

WebUI.setText(findTestObject('Checkout/phone_number'), '+6288294824679')

WebUI.click(findTestObject('Checkout/btn_next_step'))

