package scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowsTest {
	
	WebDriver driver;
	String parentWindowName;
	Set<String> windows;
	List<String> windowsList;
	 Alert alert;
	 WebDriverWait wait;
	
  @BeforeClass
  public void preRequisites() {
	  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
		 wait=new WebDriverWait(driver, 10);
	}
  
  @Test
  public void openUrl() {
	  driver.get("https://toolsqa.com/automation-practice-switch-windows/");
	  Assert.assertEquals(driver.getTitle(), "ToolsQA");
	    }
  
  @Test(dependsOnMethods="openUrl")
  public void selectNewBrowserwindow() {
	 WebElement window1= driver.findElement(By.xpath("(//button[contains(text(),'New Window')])[1]"));
	 window1.click();
	 Assert.assertTrue(window1.isEnabled());
	 
  }
  
  @Test(dependsOnMethods="selectNewBrowserwindow")
  public void selectNewMesagewindow() {
	  WebElement window2= driver.findElement(By.xpath("//button[contains(text(),'New Window Message')]"));
	  window2.click();
	  Assert.assertTrue(window2.isEnabled());
  }
  
  @Test(dependsOnMethods="selectNewMesagewindow")
  public void selectNewBrowserTab() {
	  WebElement window3= driver.findElement(By.xpath("//button[contains(text(),'New Tab')]"));
	 
	  window3.click();
	  Assert.assertTrue(window3.isEnabled());
  }
  
  
  @Test(dependsOnMethods="selectNewBrowserTab")
  public void switchtoNewBrowserwindow() {
	  parentWindowName=driver.getWindowHandle();
	  windows=driver.getWindowHandles();
	  windowsList = new ArrayList<>(windows);
	  
	
	  driver.switchTo().window(windowsList.get(2));
	  WebElement body=driver.findElement(By.xpath("//body[contains(text(),'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.')]"));
	  Assert.assertEquals(body.getText(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
	 // Assert.assertEquals(driver.getTitle(), "ToolsQA");
	//title can also be used
  }
  
  
  
//  @Test(dependsOnMethods="switchtoNewBrowserwindow")
//  public void switchtoNewMesagewindow() {
//	  driver.switchTo().window(windowsList.get(2));
////	 WebElement body=driver.findElement(By.xpath("//body[contains(text(),'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.')]"));
////	Assert.assertEquals(body.getText(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
//	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.toolsqa.com/automation-practice-switch-windows/");
//	  //title can also be used
//  }
//  
//  @Test(dependsOnMethods="switchtoNewMesagewindow")
//  public void switchtoNewBrowserTab() {
//	  driver.switchTo().window(windowsList.get(3));
//	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.toolsqa.com/");
//	//title can also be used
//  }
//  
//  @Test(dependsOnMethods="switchtoNewBrowserTab")
//  public void clickonAlertbutton() {
//	  driver.switchTo().window(parentWindowName);
//	  WebElement Alertbox=driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]"));
//	  Alertbox.click();
//	  
//  }
//  @Test(dependsOnMethods="clickonAlertbutton")
//  public void acceptAlert() {
//	 alert=driver.switchTo().alert(); 
//	 alert.accept();
//	
//  }
//  @Test(dependsOnMethods="acceptAlert")
//  public void clickonTimingAlert() {
//	  WebElement TimingAlertbox=driver.findElement(By.xpath("//button[contains(text(),'Timing Alert')]"));
//	  TimingAlertbox.click();
//  }
//  
//  @Test(dependsOnMethods="clickonTimingAlert")
//  public void acceptTimingAlert() {
//	 wait.until(ExpectedConditions.alertIsPresent());
//	 alert=driver.switchTo().alert(); 
//	 alert.accept(); 
//  }
//  
////  @Test(dependsOnMethods="openUrl")
////  public void clickonchangecolor() {
////	  WebElement changecolor=driver.findElement(By.xpath("//button[contains(text(),'Change Color')]"));
////	  Assert.assertFalse(changecolor.isEnabled());
////	  
////  }
  
  
}
