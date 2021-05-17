package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NestedFrames {
	RemoteWebDriver driver;
	 List<WebElement> list;
	 List<WebElement> list2;
	 WebElement topframeset;
	
	
  @BeforeClass
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
  }
  @Test(priority=1)
  public void getUrl() {
	  driver.get("http://the-internet.herokuapp.com/frames");
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle, "The Internet");
  }
  
  @Test(dependsOnMethods="getUrl",priority=2)
  public void clickNestedFrames() {
	 WebElement Nested=driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")); 
	 Nested.click();
	 Assert.assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/nested_frames");
  }
  
  @Test(dependsOnMethods="clickNestedFrames",priority=3)
  public void switchtobottomframe() { 
   list=driver.findElements(By.tagName("frame"));
  System.out.println("size of the webelements having frame tag is--->"+list.size());
     driver.switchTo().frame(list.get(1));
	WebElement element=driver.findElement(By.xpath("/html/body"));
	Assert.assertEquals(element.getText(), "BOTTOM");
	
	  
  }
  @Test(priority=4)
  public void switchleftframe() {
	  driver.switchTo().parentFrame();
	  driver.switchTo().frame(list.get(0));
	  topframeset=driver.findElement(By.xpath("//frameset[@name=\"frameset-middle\"]"));
	  list2= topframeset.findElements(By.tagName("frame"));
	 System.out.println("size of the webelements having frame tag is--->"+list2.size());
	 driver.switchTo().frame(list2.get(0));
	 WebElement leftframe=driver.findElement(By.xpath("/html/body"));
	 Assert.assertEquals(leftframe.getText(), "LEFT");
  }
  
  @Test(priority=5)
  public void switchMiddleframe() {
	 driver.switchTo().parentFrame();
	
//	  List<WebElement> list=driver.findElements(By.tagName("frame"));
//	  System.out.println("list size is "+list.size());
	  driver.switchTo().frame(list2.get(1));
	  WebElement Middleframebody=driver.findElement(By.xpath("/html/body"));
	  Assert.assertEquals(Middleframebody.getText(), "MIDDLE");
  }
  @Test(priority=6)
  public void switchRightframe() {
	  driver.switchTo().parentFrame();
//	  List<WebElement> list=driver.findElements(By.tagName("frame"));
//	  System.out.println("list size is "+list.size());
	  driver.switchTo().frame(list2.get(2));
	  WebElement Rightframebody=driver.findElement(By.xpath("/html/body"));
	  Assert.assertEquals(Rightframebody.getText(), "RIGHT");
  }
  
}
