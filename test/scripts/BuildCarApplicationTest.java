package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildCarApplicationTest {
  @Test
  public void testRadioButton() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder\\webdrivertraining\\test\\resources\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='Petrol']"));
		radiobutton.click();
		Assert.assertTrue(radiobutton.isSelected());
		
  }
}
