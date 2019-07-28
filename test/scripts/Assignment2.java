package scripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2  {

	public static void main(String[] args) throws NoSuchElementException, InterruptedException{
		try {
			System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "test\\resources\\resources\\geckodriver-64bit.exe");
		//WebDriver driver= new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
        Thread.sleep(10000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gouravshrivas.835@gmail.com");
		Thread.sleep(10000);
     	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
     	Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jun@1993#");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@jslog='20510; u014N:cOuCgd,Kr2w4b']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//img[@class='Hq aUG']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@id=':9k']")).sendKeys("everydaylearn4yourself@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.name("subjectbox")).sendKeys("Automated Email");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Hi,\r\n" + 
        		"this is done using Selenium Automation");
        Thread.sleep(5000);
        driver.findElement(By.id(":8s")).click();
        
		}
		catch(NoSuchElementException e){
			e.printStackTrace();
		}
     	
		
		
		
		
		

	}

}
