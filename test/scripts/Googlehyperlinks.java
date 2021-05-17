package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Googlehyperlinks {
  
	WebDriver driver;

	
	@BeforeClass
	public void hyperlinktest() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void hyperlinktest1() {
		
		driver.get("https://www.google.com/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		for(WebElement e : list) {
		System.out.println(e.getText()+"-"+e.getAttribute("href"));
	
		}
	System.out.println(list.size());
	}
  
}
