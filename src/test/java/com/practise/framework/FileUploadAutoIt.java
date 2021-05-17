package com.practise.framework;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadAutoIt {
	JavascriptExecutor js;
	WebDriverWait wait;
	WebDriver driver;
	Actions builder;
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void fillStudentForm() throws IOException, InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		builder=new Actions(driver);
		
	    WebElement uploadbutton=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	    builder.moveToElement(uploadbutton).click().build().perform();
//	    js.executeScript("arguments[0].click();", uploadbutton);
	    Runtime.getRuntime().exec("C:\\AutoIT\\FileUpload.exe");
	}
	
	
}
