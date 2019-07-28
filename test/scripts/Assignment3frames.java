package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment3frames {
	WebDriver driver;
	
  @BeforeClass
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
  }
  
  @Test
  public void OpenUrl() {
	  driver.get("http://the-internet.herokuapp.com/nested_frames");
  }
}
