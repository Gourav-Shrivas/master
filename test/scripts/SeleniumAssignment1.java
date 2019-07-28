package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment1 {

	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    List<WebElement> list=driver.findElements(By.tagName("a"));
    System.out.println(list.size());
    for(WebElement e:list) {
    	System.out.println(e.getText()+" -" +e.getAttribute("href"));
   
    }


	}

}
