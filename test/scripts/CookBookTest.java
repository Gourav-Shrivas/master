package scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CookBookTest {
	Select select;
	Select select1;
	WebDriver driver;
  @Test(priority=1)
  public void openBrowserTest() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	   driver=new ChromeDriver();
	   
  }
  @Test(priority=2,dependsOnMethods="openBrowserTest")
  public void openUrlTest() {
	  driver.get("http://cookbook.seleniumacademy.com/Config.html");
	  String Actualtitle=driver.getTitle();
	   Assert.assertEquals(Actualtitle, "Build my Car - Configuration");
  }
//  @Test(priority=3)
//  public void selectDropdownTest() {
//	  WebElement dropdown=driver.findElement(By.name("make"));
//	  dropdown.click();
//	 Assert.assertTrue(dropdown.isEnabled() && dropdown.isDisplayed());
//	  	  
//  }
  
  @Test(priority=4)
  public void dropdownElementsSizeTest() {
	  select=new Select(driver.findElement(By.name("make")));
	 int size= select.getOptions().size();
	 Assert.assertEquals(size, 4);
	  
  }
  @Test(priority=5)
  public void dropdownOptionsOrderTest() {
	  select=new Select(driver.findElement(By.name("make")));
	  List<WebElement> list=select.getOptions();
	  List<String> names=new ArrayList<>();
	  names.add("BMW");names.add("Mercedes");names.add("Audi");names.add("Honda");
	  List<String> Actualnames=new ArrayList<>();
	  for(WebElement e:list) {
			Actualnames.add(e.getText());
			}
	  Assert.assertEquals(Actualnames, names);
		
		
  }
  @Test(priority=9)
  public void selectBMWTest() {
//	WebElement bmw=driver.findElement(By.xpath("//option[@value='bmw']"));
//	bmw.click();
//	Assert.assertTrue(bmw.isEnabled() && bmw.isDisplayed() && bmw.isSelected());
	 WebElement BMW= select.getFirstSelectedOption();
	  Assert.assertTrue(BMW.isEnabled()&& BMW.isDisplayed() && BMW.isSelected());
	  
  }
  @Test(priority=6)
  public void selectMercedesTest() {
	WebElement mercedes=select.getOptions().get(1);
	mercedes.click();
	Assert.assertTrue(mercedes.isEnabled() && mercedes.isDisplayed() && mercedes.isSelected());
	
	  
	  
  }
  @Test(priority=7)
  public void selectAudiTest() {
	WebElement Audi=select.getOptions().get(2);
	Audi.click();
	Assert.assertTrue(Audi.isEnabled() && Audi.isDisplayed() && Audi.isSelected());
}
  @Test(priority=8)
  public void selectHondaTest() {
	WebElement Honda=select.getOptions().get(3);
	Honda.click();
	Assert.assertTrue(Honda.isEnabled() && Honda.isDisplayed() && Honda.isSelected());
}
  @Test(priority=10)
  public void selectPetrolbuttonTest() {
	WebElement Petrol=driver.findElement(By.xpath("//input[@value='Petrol']"));
	Petrol.click();
	Assert.assertTrue(Petrol.isDisplayed() && Petrol.isEnabled() && Petrol.isSelected());
}
  @Test(priority=11)
  public void selectDieselbuttonTest() {
	WebElement Diesel=driver.findElement(By.xpath("//input[@value='Diesel']"));
	Diesel.click();
	Assert.assertTrue(Diesel.isDisplayed() && Diesel.isEnabled() && Diesel.isSelected());
}
  @Test(priority=12)
  public void checkboxSizeTest() {
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	int Actualsize=checkboxes.size();
	Assert.assertEquals(Actualsize, 4);
}
  @Test(priority=13)
  public void selectABSCheckboxTest() {
	  WebElement ABS=driver.findElement(By.xpath("//input[@value='ABS']"));
	  ABS.click();
	  Assert.assertTrue(ABS.isDisplayed() && ABS.isEnabled() && ABS.isSelected());  
}
  @Test(priority=16)
  public void selectLEDCheckboxTest() {
	  WebElement LED=driver.findElement(By.xpath("//input[@value='LEDHeadLamp']"));
	  LED.click();
	  Assert.assertFalse(LED.isEnabled()); 
}
  @Test(priority=14)
  public void selectAirbagCheckboxTest() {
	  WebElement Airbag=driver.findElement(By.xpath("//input[@value='Airbags']"));
	  Airbag.click();
	Assert.assertTrue(Airbag.isEnabled() && Airbag.isDisplayed() && Airbag.isSelected());
}
  @Test(priority=15)
  public void selectPSCheckboxTest() {
	  WebElement Parkingsensor=driver.findElement(By.xpath("//input[@value='ParkingSensor']"));
	  Parkingsensor.click();
	  Assert.assertTrue(Parkingsensor.isEnabled() && Parkingsensor.isDisplayed() && Parkingsensor.isSelected());
}
//  @Test(priority=17)
//  public void selectMultidropdownTest() {
//	  WebElement multidropdown= driver.findElement(By.xpath("//select[@multiple='multiple']"));
//	  Assert.assertTrue(multidropdown.isEnabled() && multidropdown.isDisplayed());
//	  multidropdown.click();
//}
  @Test(priority=18)
  public void multidropdownSizeTest() {
	  select1=new Select(driver.findElement(By.xpath("//select[@multiple='multiple']")));
	 int size= select1.getOptions().size();
	 Assert.assertEquals(size, 5);
  }
  @Test(priority=19)
  public void selectblackdropdownTest() {
	  WebElement black= select1.getOptions().get(0);
	  black.click();
	  Assert.assertTrue(black.isEnabled() && black.isDisplayed() && black.isSelected());
}
  @Test(priority=20)
  public void selectWhitedropdownTest() {
	  WebElement White= select1.getOptions().get(1);
	  White.click();
	  Assert.assertTrue(White.isEnabled() && White.isDisplayed() && White.isSelected());
}
  @Test(priority=21)
  public void selectReddropdownTest() {
	  WebElement red= select1.getOptions().get(2);
	  red.click();
	  Assert.assertTrue(red.isEnabled() && red.isDisplayed() && red.isSelected());
} 
  @Test(priority=22)
  public void selectbrowndropdownTest() {
	  WebElement brown= select1.getOptions().get(3);
	  brown.click();
	  Assert.assertTrue(brown.isEnabled() && brown.isDisplayed() );
} 
  @Test(priority=23)
  public void selectSilverdropdownTest() {
	  WebElement Silver= select1.getOptions().get(4);
	  Silver.click();
	  Assert.assertTrue(Silver.isEnabled() && Silver.isDisplayed() && Silver.isSelected());
} 
  
}
