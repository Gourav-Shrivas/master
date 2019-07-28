package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WikipediaTest3 extends Wkicommon{
	
	
	  @Test(groups= {"deutch"})
	  public void openUrlTest() {
		 driver.navigate().to("https://www.wikipedia.org/");
		  String Actualtitle=driver.getTitle();
		   Assert.assertEquals(Actualtitle, "Wikipedia");
	  }
	  @Test(dependsOnMethods="openUrlTest",groups= {"deutch"})
	  public void selectDeutschLink() {
		WebElement Deutsch= driver.findElement(By.xpath("//strong[contains(text(),'Deutsch')]"));
		Deutsch.click();
		Assert.assertEquals(driver.getTitle(), "Wikipedia – Die freie Enzyklopädie");
	  }
	 
	  @Test(dependsOnMethods="selectDeutschLink",groups= {"deutch"})
	  public void searchBoxTest() {
		  WebElement search=driver.findElement(By.id("searchInput"));
			search.sendKeys("Selenium");
			Assert.assertTrue(search.isEnabled());
	} 
	  @Test(dependsOnMethods="searchBoxTest",groups= {"deutch"})
	  public void searchbuttonTest() throws InterruptedException {
		  WebElement Enter=driver.findElement(By.id("searchButton"));
		  Thread.sleep(5000);
		  Enter.click();
		  Assert.assertEquals(driver.getTitle(), "Selenium – Wikipedia");
	}
	  
	  
}

