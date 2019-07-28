package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://the-internet.herokuapp.com/dropdown");
	    WebElement dropdown=driver.findElement(By.id("dropdown"));
	    Select select=new Select(dropdown);
	    WebElement option1= select.getOptions().get(1);
	    select.selectByVisibleText("Option 1");
	  	  WebElement disabledelement= select.getOptions().get(0);
	  select.selectByVisibleText("Please select an option");
	    if(disabledelement.isSelected()) {
	    	System.out.println("disabledelement is selected");
	    }
	    else {
	    	System.out.println("disabledelement not selected");
	    }
	    

	}

}
