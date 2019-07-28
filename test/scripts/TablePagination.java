package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TablePagination {
	WebDriver driver;
	WebElement table;
	List<WebElement> rows;
	int rowcount;
	List<WebElement> colsinrow;
	int i;
	
  @BeforeClass
  public void prerequisites() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test(priority=1)
  public void openUrl() {
	  driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle, "Selenium Easy - Table with Pagination Demo");
	  
  }
  
  @Test(priority=2)
  public void noofrows() {
		table=driver.findElement(By.xpath("//tbody[@id=\"myTable\"]")) ;
	     rows=table.findElements(By.tagName("tr"));
		 rowcount=rows.size();
		Assert.assertEquals(rowcount, 13);
	  }
  
  @Test(dependsOnMethods="openUrl",priority=3)
  public void printpage1contents() {
	  for(i=0;i<rowcount;i++) {
		  WebElement row=rows.get(i);
		 colsinrow=row.findElements(By.tagName("td"));
			  for(WebElement e:colsinrow) {
				  if(i<5) {
					  System.out.println("content name is--->"+e.getText());  
				  }
			  
			      if(i>=5&& i<10) {
					driver.findElement(By.xpath("//a[contains(text(),'2')]")).click();
			        System.out.println("content name is--->"+e.getText());
				}
			      if(i>=10&& i<13){
						driver.findElement(By.xpath("//a[contains(text(),'3')]")).click();
					    System.out.println("content name is--->"+e.getText());
						  
					} 
		  }		 
  }	
  }
}
