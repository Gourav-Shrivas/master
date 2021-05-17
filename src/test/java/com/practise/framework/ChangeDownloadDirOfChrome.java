package com.practise.framework;

import java.io.File;

import java.util.HashMap;
import java.util.Map;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class ChangeDownloadDirOfChrome {
	
WebDriver driver;
WebDriverWait wait;
 
    
   
	@SuppressWarnings("deprecation")
	@BeforeClass()
    public void init() {
    	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	
    	String downloadFilepath = "D:\\New folder\\com.practise.framework\\src\\test\\java\\testresources";
    	HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
    	chromePrefs.put("profile.default_content_settings.popups", 0);
    	chromePrefs.put("download.default_directory", downloadFilepath);
    	chromePrefs.put("safebrowsing.enabled", "true"); 
    	chromePrefs.put("download.prompt_for_download", "false");
    	chromePrefs.put("download.extensions_to_open", "application/exe");
    	options.setExperimentalOption("prefs", chromePrefs);
    	options.addArguments("start-maximized");
    	options.addArguments("--safebrowsing-disable-download-protection");
    	options.addArguments("safebrowsing-disable-extension-blacklist");
    	DesiredCapabilities cap = DesiredCapabilities.chrome();
    	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    	cap.setCapability(ChromeOptions.CAPABILITY, options);
    	driver = new ChromeDriver(cap);
       
    }
	
 
        
         
        // URL loading
        @Test()
        public void downloadServerfile() throws InterruptedException{
        driver.get("https://www.seleniumhq.org/download/");
        driver.manage().window().maximize();
         
        // Click on download selenium server jar file
       
        wait=new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//a[@href='https://selenium-release.storage.googleapis.com/3.141/selenium-server-standalone-3.141.59.jar']")).click();
        Thread.sleep(5000);
        }
       
    }
