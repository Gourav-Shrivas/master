package common;

import org.openqa.selenium.By;

public class LocatorHelper {
	//"id>heightCMS"
		public static  By getLocator(String propertyValue) {

			//final String keyValue = PropertyHelper.getInstance().getProperties().getProperty(propertyKey);

			final String[] locators = propertyValue.split(">");

			switch (locators[0]) {

			case "id":
				return By.id(locators[1]);

			case "class":
				return By.className(locators[1]);

			case "a":
				return By.linkText(locators[1]);
				
			case "xpath":
				 return By.xpath(locators[1]);
				 
			case "name":
				 return By.name(locators[1]);	 
			}
			return null;
		}
}
