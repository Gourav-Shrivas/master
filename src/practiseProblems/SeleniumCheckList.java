package practiseProblems;

import java.util.ArrayList;
import java.util.List;

public class SeleniumCheckList {
public static void main(String[] args) {
	
	List<String> list= new ArrayList<>();
	list.add("Selenium");
	list.add("Maven");
	list.add("testng");
	list.add("jenkins");

	if(checkSelenium(list)) {
		System.out.println("Selenioum is present");
	}
}
public static boolean checkSelenium(List<String> liststring) {
	for(String str:liststring) {
		if(str.equals("Selenium")) {
			return true;
		}
		
	}
	
	return false;
	
}
}
