package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailComposeMailTest {
	WebDriver driver;
	Actions builder;
	
  @BeforeClass
  public void openBrowserTest() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
  }
	@Test(priority=2)
	public void loginPagetest() {
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, "Gmail");
	}
	  
  @Test(priority=3)
  public void enterUsernameTest() {
	  WebElement Username=driver.findElement(By.xpath("//input[@name='identifier']"));
	  Username.sendKeys("gouravshrivas.835@gmail.com");
	  
	  
  }
  @Test(priority=4)
  public void nextUserButtonTest()  {
	  
	  WebElement Nextbutton=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	  builder=new Actions(driver);
	  builder.click(Nextbutton).perform();
	  //Assert.assertTrue(Nextbutton.isEnabled());
	  
  }
  @Test(priority=5)
  public void enterpasswordTest() {
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("Jun@1993#");
	  
  }
  @Test(priority=6)
  public void nextPasswordButtonTest() {
	  WebElement Nextbutton=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	 // Assert.assertTrue(Nextbutton.isEnabled());
//	  builder=new Actions(driver);
	  builder.click(Nextbutton).perform();
  }
  @Test(priority=7)
  public void clickCopmpseText() {
	  WebElement Compose=driver.findElement(By.xpath("//div[@jslog='20510; u014N:cOuCgd,Kr2w4b']"));
	  Compose.click();
	  
  }
  @Test(priority=8)
  public void clickFullScreenTest() {
	  WebElement fullscreen= driver.findElement(By.xpath("//img[@class='Hq aUG']"));
	  fullscreen.click();
  }
  @Test(priority=9)
  public void selectToTest() {
	 WebElement Selectto= driver.findElement(By.xpath("//textarea[@id=':9m']"));
	 Selectto.sendKeys("everydaylearn4yourself@gmail.com");
	 
  }
  @Test(priority=10)
  public void selectSubjectTest() {
	 WebElement SelectSubject= driver.findElement(By.name("subjectbox"));
	 SelectSubject.sendKeys("Automated Email");
  
}
  @Test(priority=11)
  public void selectBodyTest(){
	 WebElement SelectBody= driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
	 SelectBody.sendKeys("Hi,\n" + 
	 		"This is done using Selenium Automation");
  
} 
  @Test(priority=12)
  public void clickSendButtonTest() {
	 WebElement SendButton= driver.findElement(By.id(":8u"));
	 builder.click(SendButton).perform();
  
}  
}
