package common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Externalisation {

	WebDriver driver;
	String url;

	@BeforeSuite
	public void init() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/shreenivas_khedkar/Downloads/chromedriver2.37/chromedriver");
		driver = new ChromeDriver();
		

	}

	private String[] readFromFile(String filePath, String key) throws FileNotFoundException, IOException {
		FileReader fileReader = new FileReader(filePath);

		BufferedReader reader = new BufferedReader(fileReader);

		String line;
		while ((line = reader.readLine()) != null) {

			System.out.println(line);
			String[] tokens = line.split("=");
			if (tokens[0].equalsIgnoreCase(key)) {

				if (tokens[1].contains(">")) {
					String[] valueTokens = tokens[1].split(">");
					return valueTokens;
				}

				return tokens;

			}

		}
		return null;
	}

	// public void readData() {
	//
	//
	// }

	@Test
	public void openOrangeHRMApplication() throws FileNotFoundException, IOException {

		String[] url = readFromFile("a.txt", "url");
		driver.get(url[1]);

		// 1. Read the file
		// 2/ Read the line
		// 3. Identify key and value
		// 4. Pass the value in your test
	}

	@Test(dependsOnMethods = "openOrangeHRMApplication")
	public void login() throws FileNotFoundException, IOException {
		// String userNameLocator = readFromFile("a.txt", "loginUserNameLocator");
		//
		// String userName = readFromFile("a.txt", "username");
		//
		// String passwordLocator = readFromFile("a.txt", "loginPasswordLocator");
		// String password = readFromFile("a.txt","password");
		//

		String[] inputData = readFromFile("a.txt", "loginUserNameLocator");
		String[] inputDataValue = readFromFile("a.txt", "username");

		By obj = returnLocatorBy(inputData);
		driver.findElement(obj).sendKeys(inputDataValue[1]);
		//
		// driver.findElement(obj).sendKeys(inputData[1]);

	}
	// 1. Multiple Varibles
	// 2. Reading file multiple times
	// 3. Code length

	// driver.findElement(By.id("txtUserName"));
	// inputData[0] = id
	// inputData[1]=txtUserName
	// driver.findElement(returnLocatorBy(inputData))

	private By returnLocatorBy(String[] inputData) {

		switch (inputData[0]) {

		case "id":
			return By.id(inputData[1]);

		case "name":
			return By.className((inputData[1]));

		case "xpath":
			return By.xpath(((inputData[1])));
		}
		return null;
	}

}

