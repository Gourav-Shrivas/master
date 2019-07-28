package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleClickAlertTest {
	WebDriver driver;
	Actions builder;
	WebDriverWait wait;
	Alert alert;
	
  @BeforeClass
  public void prerequisites() {
	 System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 builder=new Actions(driver);
	 wait=new WebDriverWait(driver,10);
  }
  
  @Test(priority=1)
  public void getUrl() {
	  driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
	  Assert.assertEquals(driver.getTitle(), "Only Testing: Selectable");
  }
  
  @Test(priority=2)
  public void clickdoubleButton() {
	  WebElement doubleclickbutton=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
	  builder.doubleClick(doubleclickbutton).perform();
	  wait.until(ExpectedConditions.alertIsPresent());
	  alert=driver.switchTo().alert();
	 Assert.assertEquals(alert.getText(), "You double clicked me.. Thank You..");
	  
	  
  }
  @Test(priority=3)
  public void acceptAlert() {
	  alert.accept();
	  WebElement selectable=driver.findElement(By.xpath("//span[contains(text(),'Friday, 26 September 2014')]"));
	  Assert.assertEquals(selectable.getText(), "Friday, 26 September 2014");
  }
}
