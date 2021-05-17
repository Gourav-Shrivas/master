package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnaUniversity {
	ChromeDriver driver;
	Actions builder;
	
  @BeforeClass
  public void prerequisites() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     builder  = new Actions(driver);
  }
  
  @Test
  public void getUrl() {
	 driver.get("https://annauniv.edu/"); 
	 Assert.assertEquals(driver.getTitle(), "Home - Anna University");
  }
  
  @Test(dependsOnMethods="getUrl")
  public void clickDepartments() {
	  WebElement departments=driver.findElement(By.xpath("//a[contains(text(),'Departments')]"));
	  departments.click();
	  Assert.assertEquals(driver.getTitle(), "Anna University - Departments");
  }
  
  @Test(dependsOnMethods="clickDepartments")
  public void clickOceanManagement() {
	 WebElement Civil=driver.findElement(By.xpath("//strong[contains(text(),' Faculty of Civil Engineering ')]"));
	 WebElement Oceanmanagement=driver.findElement(By.xpath("//div[@id='menuItemHilite32']"));
	 builder.moveToElement(Civil).moveToElement(Oceanmanagement).click().build().perform();
	 Assert.assertEquals(driver.getTitle(), "Institute For Ocean Management - Anna University offers M.Tech in Coastal Management. ENVIS Center for Coastal Zone Management and Coastal Shelterbelts");
  }
  
  @Test(dependsOnMethods="clickOceanManagement")
  public void clickCoastalpollution() {
	  WebElement Research=driver.findElement(By.xpath("//a[contains(text(),'Research Themes')]"));
	  WebElement Coastalpollution=driver.findElement(By.xpath("//div[@id='menuItemHilite13']"));
	  builder.moveToElement(Research).moveToElement(Coastalpollution).click().build().perform();
//	  builder.sendKeys(Keys.TAB);
//	  builder.sendKeys(Coastalpollution, Keys.F5);
	  Assert.assertEquals(driver.getTitle(), ":: IOM - Institute For Ocean Management - Anna University ::");
  }
  
  @AfterClass
  public void tearDown()
  {
	  if(driver!=null)
		  driver.quit();
  }
}
