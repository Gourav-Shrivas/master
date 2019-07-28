package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalTest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://cookbook.seleniumacademy.com/Config.html");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//option[@value='mercedes']")).click();
}
}
