package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://cookbook.seleniumacademy.com/Config.html");
       WebElement e= driver.findElement(By.xpath("//select[@multiple='multiple']"));
       Select select=new Select(e);
       List<WebElement> dropdown=select.getOptions();
       for(WebElement E:dropdown) {
    	   System.out.println(E.getText());
       }
           System.out.println(select.isMultiple());
	}

}
