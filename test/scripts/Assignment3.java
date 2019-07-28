package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "test\\resources\\resources\\geckodriver-64bit.exe");
		//WebDriver driver= new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("Gourav");
        driver.findElement(By.name("lastname")).sendKeys("Shrivas");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10jun2019");
        driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
        driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();

	}

}
