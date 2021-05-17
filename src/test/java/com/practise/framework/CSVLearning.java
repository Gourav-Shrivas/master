package com.practise.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.Constants;
import common.LocatorHelper;
import common.Utilities;
import common.Verification;

public class CSVLearning {

	Properties prop;
	WebDriver driver;
	 SimpleDateFormat timestamp;
	 String currenttime;
	
	static Logger log = Logger.getLogger(CSVLearning.class);

	@BeforeClass
	public void init() {
		DOMConfigurator.configure("D:\\New folder\\com.practise.framework\\LOG4J.xml");

		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\webdrivertraining\\test\\resources\\resources\\chromedriver.exe");
		log.info("System properties are set..");

		try {
			driver = new ChromeDriver();
			log.info("Chrome browser launched");
			prop = new Properties();
			InputStream inStream = new FileInputStream(
					"D:\\New folder\\com.practise.framework\\src\\test\\java\\testresources\\config.properties");
			prop.load(inStream);
			log.debug("config.properties loaded");
			driver.get(prop.getProperty("url"));
			log.info("URL is opened:"+prop.getProperty("url"));
			popupbuttonclick();
			loginbuttonclick();
		    timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
		    currenttime=timestamp.format(new Date());
			
		} catch (Exception e) {
			
			log.error("Exception occured:"+e);
		}
		 
	}

	@Test(dataProviderClass = Utilities.class, dataProvider = "provideDataFromCsv")
	public void provide_username_password(String inputvalue, String passinput)
			throws InterruptedException {

		log.info("Test case(provide_username_password)started...");
		
		try {
			
		//
		//System.out.println(password);
		WebElement userId = inputUserId(inputvalue);
		WebElement password = inputPassword(passinput);
		Utilities.takeScreenshot(driver,"C:\\Users\\HP\\Downloads\\screenshot\\"+"SCREENSHOT"+currenttime+".png");
		log.info("Screenshot taken");
		clearInputs(userId, password);
		
		waitForExecution();
		logSuccessfulExecution();
		}
		catch (Exception e) {
			log.error("Exception occured in test: "+e);
		}
		
	}

//	@Test(dataProviderClass = Utilities.class,dataProvider="takeScreenshot")	
//	public void takeScreenshots(String filePath) {
//		try {
//			Utilities.takeScreenshot(driver, filePath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	
	private WebElement inputPassword(String passinput) {
		WebElement password = driver.findElement(LocatorHelper.getLocator(prop.getProperty("password")));
		password.clear();
		log.trace("WebElement password is located");
		password.sendKeys(passinput);
		return password;
	}

	private WebElement inputUserId(String inputvalue) {
		WebElement input = driver.findElement(LocatorHelper.getLocator(prop.getProperty("userid")));
		input.clear();
		log.trace("WebElement input is located");
		input.sendKeys(inputvalue);
		return input;
	}

	private void loginbuttonclick() {
		driver.findElement(LocatorHelper.getLocator(prop.getProperty("loginbutton"))).click();
		log.trace("Clicked on loginbutton");
		
	}

	private void logSuccessfulExecution() {
//		log.debug("Height and weight textboxes are cleared");
//		log.info("Test Case Execution Completed");
	}

	private void waitForExecution() throws InterruptedException {
		Thread.sleep(4000);
	}

	private void clearInputs(WebElement userId, WebElement password ) {
		userId.clear();
		password.clear();
	}
	
	private void popupbuttonclick(){
		driver.findElement(LocatorHelper.getLocator(prop.getProperty("popupclick"))).click();
		log.trace("Clicked on popupbutton");
	}

}
