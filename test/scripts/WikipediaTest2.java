package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WikipediaTest2 extends Wkicommon{
	
	
	  @Test(groups= {"english"})
	  public void openUrlTest() {
		  driver.get("https://www.wikipedia.org/");
		  String Actualtitle=driver.getTitle();
		   Assert.assertEquals(Actualtitle, "Wikipedia");
	  }
	  @Test(dependsOnMethods="openUrlTest",groups= {"english"})
	  public void selectEnglishLink() {
		WebElement English= driver.findElement(By.xpath("//strong[contains(text(),'English')]"));
		English.click();
		Assert.assertEquals(driver.getTitle(), "Wikipedia, the free encyclopedia");
	  }
	 
	  @Test(dependsOnMethods="selectEnglishLink",groups= {"english"})
	  public void searchBoxTest() {
		  WebElement search=driver.findElement(By.id("searchInput"));
			search.sendKeys("Selenium");
			Assert.assertTrue(search.isEnabled());
	} 
	  @Test(dependsOnMethods="searchBoxTest",groups= {"english"})
	  public void searchbuttonTest() {
		  WebElement Enter=driver.findElement(By.id("searchButton"));
		  Enter.click();
		  Assert.assertEquals(driver.getTitle(), "Selenium - Wikipedia");
	}
	  
}
