package scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment4 {
	
	

	public static void main(String[] args) {
		int count = 0;
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.name("make"));
		
		Select select=new Select(dropdown);
		List<WebElement> list=select.getOptions();
		//retreive all the dropdown elements and store them in actual list
		System.out.println(list.size());
		
		
		List<String> names=new ArrayList<>();
		names.add("BMW");
		names.add("Mercedes");
		names.add("Audi");
		names.add("Honda");
		
		List<String> Actualnames=new ArrayList<>();
		for(WebElement e:list) {
			Actualnames.add(e.getText());
			System.out.println(e.getText());
		}
		System.out.println(Actualnames.get(0));
		System.out.println(Actualnames.get(1));
		System.out.println(Actualnames.get(2));
		System.out.println(Actualnames.get(3));
		
		boolean flag = false;
		for(int i=0;i<names.size(); i++) {
//			for(int j=0; j<Actualnames.size(); j++) {
				if(names.get(i).equals(Actualnames.get(i))) {
					
					//count++;
					flag = true;
				}
				
				else {
					
					flag = false;
					break;
				}
				
			//}
		}
		
		if(flag) {
			
			System.out.println("passed");
		}
		else
			System.out.println("Failed");
		
//		if(count==list.size()){
//			System.out.println("list are equal");
//		}
//		else {
//			System.out.println("list are not equal");
//		}
//		

	}

}
