package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Iframes {
	WebDriver driver;
	WebElement Iframe2;
	
	@BeforeClass
	  public void prerequisites() {
		  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	
	@Test()
	public void getUrl() {
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, "IFrame practice page");
	}
	
	@Test(dependsOnMethods="getUrl")
	public void switchtoiframe1() {
		WebElement Iframe1=driver.findElement(By.name("iframe1"));
		driver.switchTo().frame(Iframe1);
		WebElement image=driver.findElement(By.xpath("//span[contains(text(),'Automation Tools Tutorial')]"));
		Assert.assertEquals(image.getText(), "Automation Tools Tutorial");
	}
	
	@Test(dependsOnMethods="switchtoiframe1")
	public void switchtoiframe2() {
		driver.switchTo().parentFrame();
		 Iframe2=driver.findElement(By.name("iframe2"));
		driver.switchTo().frame(Iframe2);
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]"));
		element.click();
		
	}
	@Test(dependsOnMethods="switchtoiframe2")
	public void switchtoadsframe() {
		driver.switchTo().parentFrame();
		WebElement Addiframe=driver.findElement(By.xpath("//iframe[@name=\"google_ads_frame6\"]"));
		driver.switchTo().frame(Addiframe);
		WebElement element=driver.findElement(By.xpath("//a[@id=\"product2-clickOverlay\"]"));
		element.click();
	}
	
}
