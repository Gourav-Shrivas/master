package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Wkicommon {
	static WebDriver driver;
  @BeforeSuite(alwaysRun=true)
  public void openBrowser() {
	  
			System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
			  driver=new ChromeDriver();
		}
  @AfterSuite(alwaysRun=true)
  public void tearDown() {
	  if(driver!=null) {
		  driver.quit();
	  }
  }
}
