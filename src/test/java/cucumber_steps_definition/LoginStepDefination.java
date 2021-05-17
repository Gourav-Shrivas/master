package cucumber_steps_definition;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	WebDriver driver;
	
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://qa-fake.herokuapp.com/");
	    Assert.assertEquals(driver.getCurrentUrl(), "https://qa-fake.herokuapp.com/");
	}



	@When("^title of login page is QA Fake$")
	public void title_of_login_page_is_QA_Fake() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual= driver.getTitle();
		 Assert.assertEquals(actual, "QA Fake");
	}



	@Then("^user enters \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	public void user_enters_username_and_password(String UserName ,String Password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.id("password")).sendKeys("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InN1cnlhQHNraWxsZW56YS5jb20iLCJpYXQiOjE2MTEzMTc2Njh9.HVMcJZZJh8_EAhB_mcSeGLfZZarE5ZgnEgbbAxSu99g");
		 
	}

	@Then("^user checked rember me$")
	public void user_checked_rember() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("rememberme")).click();
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://qa-fake.herokuapp.com/");
	}
	
	@Then("^user get the secret string on home screen$")
	public void user_get_the_secret_string_on_home_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String text = (String) js.executeScript("return document.documentElement.innerText;");
		
//	String Source=	driver.getPageSource();
//		 File DestFile= new File("C:\\Users\\HP\\Downloads\\result.txt");
		 
		 FileWriter FW = new FileWriter("C:\\Users\\HP\\Downloads\\result.txt");
		  BufferedWriter BW = new BufferedWriter(FW);
		  BW.write(text); 
		  BW.close();
	}
	
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.close();
	}

}
