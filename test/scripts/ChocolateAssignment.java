package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChocolateAssignment {
	WebDriver driver;
	WebDriverWait wait;
	Actions builder;
	JavascriptExecutor js;
	
  @BeforeClass
  public void prerequisites() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  wait=new WebDriverWait(driver,20);
	  builder=new Actions(driver);
  }
  
  @Test
  public void getUrl() {
	  driver.get("https://www.triphobo.com/");
	  Assert.assertEquals(driver.getTitle(), "Vacation Planner | Vacation Planning Website: TripHobo");
  }
  
  @Test(dependsOnMethods="getUrl")
  public void clickAlertbox() {
	 WebElement Alertbutton= driver.findElement(By.xpath("//button[contains(text(),'Later')]"));
	 Alertbutton.click();
  }
  
  @Test(dependsOnMethods="clickAlertbox")
  public void clickStartyourtrip() {
	  WebElement starttrip=driver.findElement(By.xpath("//a[contains(text(),'Start Your Trip')]"));
	  starttrip.click();
	  Assert.assertEquals(driver.getTitle(), "Travel Guide & Travel Information, Travel Advice, Reviews for: TripHobo");
  }
  
  @Test(dependsOnMethods="clickStartyourtrip")
  public void searchTexas() {
	driver.findElement(By.xpath("//input[@class='input-control js_city_search']")).sendKeys("Texas"); 
	WebElement Texas=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Texas, United States')]")));
	Texas.click();
	
  }
  
  @Test(dependsOnMethods="searchTexas")
  public void clickHouston() {
	  driver.findElement(By.xpath("//*[2][@class='city-item grid-1-of-5']//i[@class='icon-plus js_city_add']")).click();
	  driver.findElement(By.xpath("//span[@class='control-indicator']")).click();
	  driver.findElement(By.xpath("//span[@class='button p-color full-width start-planning']")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'(Edit home city)')]")).getText(), "(Edit home city)");
  }
  
  @Test(dependsOnMethods="clickHouston")
  public void skiptoTransportation() {
	  WebElement skip=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-color p-size button']")));
	  skip.click();
	  Assert.assertEquals(driver.findElement(By.xpath("//span[@class='step_title']")).getText(), "Skip to");
  }
  
  @Test(dependsOnMethods="skiptoTransportation")
  public void skiptoAccomodation() {
	 WebElement skip= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Accommodation')]")));
	 skip.click();
	 Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Choose Your Accommodation')]")).getText(), "Choose Your Accommodation");
  }
  
  @Test(dependsOnMethods="skiptoAccomodation")
  public void skiptoBindle() {
	 WebElement Skip= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Bindle')]")));
	 Skip.click();
     Assert.assertEquals(driver.findElement(By.xpath("//div[@class='selected-catg']//span[contains(text(),'Houston')]")).getText(), "Houston");
  }
  
  @Test(dependsOnMethods="skiptoBindle")
  public void houstonZooaddtobindle()  {
	  WebElement text=driver.findElement(By.xpath("//div[contains(text(),'Houston zoo')]"));
	  builder.moveToElement(text).perform();
	  js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,400)");
	  WebElement bindle=driver.findElement(By.xpath("//ul[@class='activity-list row js_activities_listing primary-loader activities-loader']/li[4]//span[@class='button p-size p-color add-to-bindle']"));
	  builder.moveToElement(bindle).click().build().perform();
	  Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Houston Zoo, Houston')]")).getText(), "Houston Zoo, Houston"); 
  }
  
  @Test(dependsOnMethods="houstonZooaddtobindle")
  public void clickAddtoBindle() {
	  driver.findElement(By.xpath("//span[contains(text(),'Add to Bindle without Tours')]")).click();
	  driver.findElement(By.xpath("//div[@class='icon-close-modal']")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Activity added to your Bindle')]")).getText(), "Activity added to your Bindle");
  }
  
  @Test(dependsOnMethods="clickAddtoBindle")
  public void clickTripOverview() {
	 WebElement TripButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-color p-size button']//span[contains(text(),'Next')]")));
	 TripButton.click();
	  
	  
  }
  @Test(dependsOnMethods="clickTripOverview")
  public void clickEditableView() throws InterruptedException {
	     WebElement Overview=driver.findElement(By.xpath("//li[@class='view-tab overview active']/span"));
		 Overview.click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//span[contains(text(),'Lunch time')]"), 2));
		 WebElement editableview=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Editable view')]")));
		 editableview.click();
	 
  }
  @Test(dependsOnMethods="clickEditableView")
  public void draganddrop() throws InterruptedException {
//      Thread.sleep(10000);
	  
      WebElement target=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table//td[@class='fc-axis']/following-sibling::*[3]//*[1][@class='fc-time-grid-event fc-v-event fc-event fc-start fc-end event-custom-hotel fc-draggable']//div[@class='fc-bg']")));
	  WebElement source=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table//td[@class='fc-axis']/following-sibling::*[2]//*[2][@class='fc-time-grid-event fc-v-event fc-event fc-start fc-end event-place fc-draggable fc-resizable']//div[@class='fc-bg']")));
	  wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='fc-bg']"), 34));
	  js.executeScript("window.scrollBy(0,-200)");
	  builder.dragAndDrop(source, target).build().perform();
	  //Assert.assertEquals(driver.findElement(By.xpath("//table//td[@class='fc-axis']/following-sibling::*[3]//*[2][@class='fc-time-grid-event fc-v-event fc-event fc-start fc-end event-place event-conflict fc-draggable fc-resizable']//div[@class='fc-bg']")).getText(), "Houston Zoo");
  
  }
  @Test(dependsOnMethods="draganddrop")
  public void saveandfinish() throws InterruptedException {
	  WebElement saveplan=driver.findElement(By.xpath("//span[@class='button p-size p-color save-to-plan']"));
	  WebElement finish=driver.findElement(By.xpath("//span[contains(text(),'Finish Planning')]"));
	  Thread.sleep(5000);
	  builder.moveToElement(saveplan).moveToElement(finish).click().build().perform();
	  
  }
}
  
  
