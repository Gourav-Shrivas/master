package common;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	
	public static void waitForElement(WebDriverWait wait,String identifier) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier)));
	}
}
