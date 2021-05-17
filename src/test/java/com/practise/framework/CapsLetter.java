package com.practise.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CapsLetter {
	WebDriver driver;
	Actions builder;
 
@BeforeClass
public void init() {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test
public void getURL() {
	driver.get("https://www.google.com/");
	WebElement textbox=driver.findElement(By.name("q"));
    builder=new Actions(driver);
    builder.keyDown(textbox, Keys.SHIFT).sendKeys(textbox, "my mom is great").keyUp(textbox, Keys.SHIFT).build().perform();
	
}
}
