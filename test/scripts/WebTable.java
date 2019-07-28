package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTable {
	WebDriver driver;
	WebElement table;
	WebElement table1;
	int colcount;
	int rowcount;
	List<WebElement> rows;
	List<WebElement> cols;
	
  @BeforeClass
  public void prerequisites() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
  }
  
  @Test
  public void openURL() {
	  driver.get("http://cookbook.seleniumacademy.com/Locators.html");
	  Assert.assertEquals(driver.getTitle(), "Locator Examples");
  }
  
  @Test(dependsOnMethods="openURL",priority=1)
  public void noofrows() {
	table=driver.findElement(By.xpath("//table[@id=\"users\"]//tbody")) ;
     rows=table.findElements(By.tagName("tr"));
	 rowcount=rows.size();
	Assert.assertEquals(rowcount, 2);
  }
  
  @Test(dependsOnMethods="openURL",priority=2)
  public void noofcolumns() {
	  table1=driver.findElement(By.xpath("//table[@id=\"users\"]//thead")) ; 
	  cols=table1.findElements(By.tagName("td"));
	   colcount=cols.size();
	  Assert.assertEquals(colcount, 3);
  }
 
  @Test(dependsOnMethods="openURL",priority=3)
  public void printtablecontents() {
	  for(int i=0;i<rowcount;i++) {
		  WebElement row=rows.get(i);
		  List<WebElement> colsinrow=row.findElements(By.tagName("td"));
		  for(WebElement e:colsinrow) {
			  System.out.println(e.getText());
		  }
	  }
  }
  
  @Test(dependsOnMethods="openURL",priority=4)
  public void printemail() {
	  WebElement row1=rows.get(0);
	  List<WebElement> columns=row1.findElements(By.tagName("td"));
	  System.out.println("email is--->"+columns.get(1).getText());
  }
  
  @Test(dependsOnMethods="openURL",priority=5)
  public void checkbrowsercheckbox() {
	  WebElement row2=rows.get(1);
	  List<WebElement> columns=row2.findElements(By.tagName("td"));
	  WebElement col3=columns.get(2);
	  List<WebElement> content=col3.findElements(By.tagName("input"));
	  content.get(2).click();
  }
  
}
