package scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonIphone {
	WebDriver driver;
	Set<String> windows;
	List<String> windowsList;
	WebDriverWait wait;
	
  @BeforeClass
  public void prerequisites() {
	  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
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
	Assert.assertEquals(searchbox.getText(),"iphone");
  }
  
  @Test(dependsOnMethods="selectsearchBox")
  public void clickSearchButton() {
	  WebElement searchbutton=driver.findElement(By.xpath("//input[@value=\"Go\"]"));
	  searchbutton.click();
	  Assert.assertEquals(driver.getTitle(), "Amazon.in : iphone");
	  
  }
  
  @Test(dependsOnMethods="clickSearchButton")
  public void selectIphone6s() {
	  driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 7 (32GB) - Black')]")).click();
	  windows=driver.getWindowHandles();
	  windowsList = new ArrayList<>(windows);
	  driver.switchTo().window(windowsList.get(1));
	  Assert.assertEquals(driver.getTitle(), "Apple iPhone 7 (32GB) - Black: Amazon.in");
  }
  
  @Test(dependsOnMethods="selectIphone6s")
  public void clickaddtocart() {
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("window.scrollBy(0,200)"); 
	  WebElement addtocart= driver.findElement(By.xpath("//input[@title=\"Add to Shopping Cart\"]"));
	  addtocart.click();
//	  driver.switchTo().window(windowsList.get(2));
	  Assert.assertEquals(driver.getTitle(), "Apple iPhone 7 (32GB) - Black: Amazon.in");
  }
  
  @Test(dependsOnMethods="clickaddtocart")
  public void clickCartButton() {
	  WebElement cartvalue=driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[3]"));
	  wait.until(ExpectedConditions.elementToBeClickable(cartvalue)).click();
	  Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
	  
  }
  
//  @Test(dependsOnMethods="clickCartButton")
//  public void checkCartValue() {
//	  String text=cartvalue.getText();
//	  int Cartvalue=Integer.parseInt(text);
//	  Assert.assertEquals(Cartvalue, 1);
//  }
//  
//  @Test(dependsOnMethods="checkcartvalue")
//  public void getoriginalpage() {
//	  driver.switchTo().window(windowsList.get(0));
//	  //driver.get("https://www.amazon.in/");
//	  String ActualTitle=driver.getTitle();
//	  Assert.assertEquals(ActualTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
//  }
//  
//  @AfterClass
//  public void teardown() {
//	  if(driver!=null) {
//		  driver.quit();
//	  }
//  }
}
