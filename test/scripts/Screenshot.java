package scripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static Date date;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "test\\resources\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		TakesScreenshot capture=(TakesScreenshot)driver;
        File actualScreenshot=capture.getScreenshotAs(OutputType.FILE);
    
        SimpleDateFormat timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
        String currenttime=timestamp.format(new Date());
		File myFile = new File("C:\\Users\\HP\\Downloads\\screenshot\\"+"screenshot"+currenttime +".png");
         FileUtils.copyFile(actualScreenshot, myFile);
       
        
            }
	
    }