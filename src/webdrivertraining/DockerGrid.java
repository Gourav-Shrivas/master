package webdrivertraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class DockerGrid {
	Capabilities chromeCapabilities = DesiredCapabilities.chrome();
	Capabilities firefoxCapabilities = DesiredCapabilities.firefox();
	RemoteWebDriver chrome;
	RemoteWebDriver firefox;
  @Test
  public void f() {
	  chrome.get("https://www.google.com");
	    System.out.println(chrome.getTitle());

	    // run against firefox
	    firefox.get("https://www.google.com");
	    System.out.println(firefox.getTitle());
	  
	    chrome.quit();
	    firefox.quit();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  try {
		chrome = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), chromeCapabilities);
		firefox = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), firefoxCapabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  @AfterMethod
  public void afterMethod() {
  }

}
