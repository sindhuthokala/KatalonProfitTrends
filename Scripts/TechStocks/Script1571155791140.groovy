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

//Tech Stocks
selenium.click("xpath= //*[@id='menu-item-61896']/a")

//Top Links
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[1]/div[1]/div")
	selenium.click("xpath= //*[@id='menu-item-61896']/a")
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[1]/div[2]/div/a[2]/h6")
	selenium.click("xpath= //*[@id='menu-item-61896']/a")
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[1]/div[3]/div/a[2]/h6")
	selenium.click("xpath= //*[@id='menu-item-61896']/a")
	selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[1]/div[4]/div/a[2]/h6")
	selenium.click("xpath= //*[@id='menu-item-61896']/a")
	
	//	//More Articles of This Category - TOP
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[1]/div")
			selenium.click("xpath= //*[@id='menu-item-61896']/a")
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[2]/div")
			selenium.click("xpath= //*[@id='menu-item-61896']/a")
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[3]/div")
			selenium.click("xpath= //*[@id='menu-item-61896']/a")
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[4]/div")
			selenium.click("xpath= //*[@id='menu-item-61896']/a")
			
			//More Articles of This Category - BOTTOM
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[5]/div")
			selenium.click("xpath= //*[@id='menu-item-61896']/a")
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[6]/div")
			selenium.click("xpath= //*[@id='menu-item-61896']/a")
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[7]/div")
			selenium.click("xpath= //*[@id='menu-item-61896']/a")
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/div[2]/div[8]/div")
			selenium.click("xpath= //*[@id='menu-item-61896']/a")
			
			//VIEW MORE
			selenium.click("xpath= /html/body/main/div[1]/div/div[1]/a")
			selenium.click("id=logo")
			selenium.close()