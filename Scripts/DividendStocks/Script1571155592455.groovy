import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://investmentu.com/")
//selenium.click("id=menu-item-61892")
//selenium.click("id=logo")
//selenium.click("id=menu-item-61893")
//selenium.click("id=logo")
//selenium.click("id=menu-item-61894")
//selenium.click("id=logo")
//selenium.click("id=menu-item-61895")
//selenium.click("id=logo")
//selenium.click("id=menu-item-61896")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'Financial Literacy')]")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'Investing 101')]")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'Tools / Calculators')]")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'About Us')]")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'Contact')]")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'Disclaimer')]")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'Frequently Asked Questions')]")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'Privacy Policy')]")
//selenium.click("id=logo")
//selenium.click("//*[contains(text(),'Whitelist Us')]")
//selenium.click("id=logo")
//TOP FOUR ARTICLES ON FIRST PAGE
//selenium.click("xpath=/html/body/main/div[1]/div/div[2]/a[2]/h4")
//selenium.click("id=logo")
//selenium.click("xpath=//*[@id='section01']/div/div[3]/div/a[2]/h6")
//selenium.click("id=logo")
//selenium.click("xpath=//*[@id='section01']/div/div[4]/div/a[2]/h6")
//selenium.click("id=logo")
//selenium.click("xpath=//*[@id='section01']/div/div[5]/div/a[2]/h6")
//selenium.click("id=logo")
//
////MIDDLE SECTION ON FIRST PAGE
//selenium.click("xpath=//*[@id='section03']/div/div[1]/div/a[2]/h4")
// selenium.click("id=logo")
// selenium.click("xpath=//*[@id='section03']/div/div[2]/div")
// selenium.click("id=logo")
// selenium.click("xpath=//*[@id='section03']/div/div[3]/div")
// selenium.click("id=logo")
 
 //VIDEO SECTION ON FIRST PAGE
 //selenium.click("xpath= //*[@id='section04']/div/div/div/div[1]/div/a/h1")
// selenium.click("id=logo")
// selenium.click("xpath=//*[@id='section04']/div/div/div/div[2]/div")
// selenium.click("id=logo")
// selenium.click("xpath=//*[@id='section04']/div/div/div/div[3]/div")
// selenium.click("id=logo")
 
 //POPULAR POSTS ON FIRST PAGE
 //First row
// selenium.click("xpath= //*[@id='menu-item-62727']/a")
//  selenium.click("id=logo")
//  selenium.click("xpath=//*[@id='menu-item-62732']/a")
//  selenium.click("id=logo")
//  selenium.click("xpath=//*[@id='menu-item-62736']/a")
//  selenium.click("id=logo")
//  selenium.click("xpath=//*[@id='menu-item-62739']/a")
//  selenium.click("id=logo")
//  //Second row
//  selenium.click("xpath= //*[@id='menu-item-62728']/a")
//   selenium.click("id=logo")
//   selenium.click("xpath=//*[@id='menu-item-62733']/a")
//   selenium.click("id=logo")
//   selenium.click("xpath=//*[@id='menu-item-62738']/a")
//   selenium.click("id=logo")
//   selenium.click("xpath=//*[@id='menu-item-62740']/a")
//   selenium.click("id=logo")
//  //Third row
//   selenium.click("xpath= //*[@id='menu-item-62729']/a")
//	selenium.click("id=logo")
//	selenium.click("xpath=//*[@id='menu-item-62735']/a")
//	selenium.click("id=logo")
//	selenium.click("xpath=//*[@id='menu-item-62737']/a")
//	selenium.click("id=logo")
//	selenium.click("xpath=//*[@id='menu-item-62741']/a")
//	selenium.click("id=logo")
	
//Meet the experts
//	selenium.click("xpath= //*[@id='expertCarousel']/div/div[1]")
//	selenium.click("id=logo")

	
//Dividend Stocks
	selenium.click("xpath= //*[@id='menu-item-61892']/a")
	//selenium.click("id=logo")
	//Top Links
//	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[1]/div[1]/div")
//	selenium.click("xpath= //*[@id='menu-item-61892']/a")
//	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[1]/div[2]/div/a[2]/h6")
//	selenium.click("xpath= //*[@id='menu-item-61892']/a")
//	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[1]/div[3]/div/a[2]/h6")
//	selenium.click("xpath= //*[@id='menu-item-61892']/a")
//	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[1]/div[4]/div/a[2]/h6")
//	selenium.click("xpath= //*[@id='menu-item-61892']/a")

	
	//More Articles of This Category - TOP
//	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[1]/div")
//	selenium.click("xpath= //*[@id='menu-item-61892']/a")
//	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[2]/div")
//	selenium.click("xpath= //*[@id='menu-item-61892']/a")
//	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[3]/div")
//	selenium.click("xpath= //*[@id='menu-item-61892']/a")
//	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[4]/div")
//	selenium.click("xpath= //*[@id='menu-item-61892']/a")
	
	//More Articles of This Category - BOTTOM
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[5]/div")
	selenium.click("xpath= //*[@id='menu-item-61892']/a")
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[6]/div")
	selenium.click("xpath= //*[@id='menu-item-61892']/a")
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[7]/div")
	selenium.click("xpath= //*[@id='menu-item-61892']/a")
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[8]/div")
	selenium.click("xpath= //*[@id='menu-item-61892']/a")
	
	//VIEW MORE
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/a")
	selenium.click("id=logo")
	selenium.close()