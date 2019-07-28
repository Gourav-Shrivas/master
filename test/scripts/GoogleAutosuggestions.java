package scripts;

import java.util.List;
import org.openqa.selenium.By;
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
		  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
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
		//List<WebElement> list=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("b")));
		//List<WebElement> list=driver.findElements(By.xpath("//span[contains(text(),'sachin')]"));
		System.out.println(list.size());
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
			}
}
