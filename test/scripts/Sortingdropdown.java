package scripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sortingdropdown {
	
	WebDriver driver;
	WebElement dropdown;
  
	@BeforeClass
	public void initelements() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testSortdropdown() {
		driver.get("http://the-internet.herokuapp.com/dropdown");
		dropdown=driver.findElement(By.id("dropdown"));
		Select select=new Select(dropdown);
		
				
		List<String> originalist= new ArrayList<>();
		
		for(WebElement e : select.getOptions()) {
			originalist.add(e.getText());
			System.out.println(e.getText());
		}
		
		List<String> templist= originalist;
		
		Collections.sort(templist);
		

		Assert.assertEquals(templist, originalist);
		
	}
}
