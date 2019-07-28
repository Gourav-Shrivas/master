package scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonIphone {
	WebDriver driver;
	Set<String> windows;
	List<String> windowsList;
	
  @BeforeClass
  public void prerequisites() {
	  System.setProperty("webdriver.gecko.driver", "test\\resources\\resources\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test()
  public void getUrl() {
	  driver.get("https://www.amazon.in/");
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
  }
  
  @Test(dependsOnMethods="getUrl")
  public void selectsearchBox() {
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("iphone");
	Assert.assertTrue(searchbox.isEnabled());
  }
  
  @Test(dependsOnMethods="selectsearchBox")
  public void clickSearchButton() {
	  WebElement searchbutton=driver.findElement(By.xpath("//input[@value=\"Go\"]"));
	  searchbutton.click();
	  Assert.assertEquals(driver.getTitle(), "Amazon.in: iphone");
  }
  
  @Test(dependsOnMethods="clickSearchButton")
  public void selectIphone6s() {
	  driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 6s (32GB) - Space Grey')]")).click();
	  windows=driver.getWindowHandles();
	  windowsList = new ArrayList<>(windows);
	  driver.switchTo().window(windowsList.get(1));
	  Assert.assertEquals(driver.getTitle(), "Apple iPhone 6s (32GB) - Space Grey: Amazon.in: Amazon.in");
  }
  
  @Test(dependsOnMethods="selectIphone6s")
  public void clickaddtocart() {
	  WebElement addtocart= driver.findElement(By.xpath("//input[@title=\"Add to Shopping Cart\"]"));
	  addtocart.click();
	  Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
  }
  
  @Test(dependsOnMethods="clickaddtocart")
  public void checkcartvalue() {
	  WebElement cartvalue=driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]"));
	  String text=cartvalue.getText();
	  int Cartvalue=Integer.parseInt(text);
	  Assert.assertEquals(Cartvalue, 1);
  }
  @Test(dependsOnMethods="checkcartvalue")
  public void getoriginalpage() {
	  driver.get("https://www.amazon.in/");
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
  }
  
  @AfterClass
  public void teardown() {
	  if(driver!=null) {
		  driver.quit();
	  }
  }
}
