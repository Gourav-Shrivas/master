package scripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "test\\resources\\resources\\geckodriver-64bit.exe");
		//System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "test\\resources\\resources\\IEDriverServer.exe");
	WebDriver driver1= new FirefoxDriver();
		//WebDriver driver= new ChromeDriver();
		//WebDriver driver2= new InternetExplorerDriver();
		driver1.get("https://www.google.com/");
		//driver.findElement(By.id("loginname")).sendKeys("stc123");
		//driver.findElement(By.id("loginpassword")).sendKeys("12345");
		//driver.findElement(By.id("loginbutton")).click();
		//driver.manage().window().maximize();
//		List<WebElement> links=driver1.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		for(WebElement e:links) {
//			System.out.println(e.getText());
//		}
//		for(int i=0; i<links.size(); i++) {
//			System.out.println(links.get(i).getText());
//		}
		driver1.findElement(By.xpath("//a[@data-pid='2']")).click();
		
	}

}
