package scripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleAutosuggestions {
	WebDriver driver;
	WebDriverWait wait;
	
	
	@BeforeClass
	  public void prerequisites() {
		  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
	 }
	
	@Test(priority=1)
	public void openUrl() {
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test(priority=2)
	public void typeSachinTest() {
		WebElement searchbox=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		searchbox.sendKeys("sachin");
		
		
		
	}
	@Test(priority=3)
	public void printautosuggestions() {
		wait=new WebDriverWait(driver,10);
		List<WebElement> list=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'sachin')]")));
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].click();",list);
		System.out.println(list.size());
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
			}
}
