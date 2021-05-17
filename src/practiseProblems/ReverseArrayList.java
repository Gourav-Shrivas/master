package practiseProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Selenium");
		list.add("Cucumber");
		list.add("Maven");
		list.add("Jenkins");
		System.out.println("original list elements are as below :");
		printListelements(list);		
		System.out.println("Elements after reversing the list");
		reverseList(list);
//		Collections.reverse(list);
		printListelements(list);
		
	}
	
	public static void printListelements(List<String> names) {
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
	
	}
	
	public static void reverseList(List<String> name) {
		for(int i=0; i<(name.size()/2); i++) {
			String temp=name.get(i);
			name.set(i,name.get(name.size()-i-1));
			name.set(name.size()-i-1, temp);
		}
		
		for(int j=0 ;j<name.size(); j++) {
			System.out.println(name.get(j));
		}
		
	}
}
