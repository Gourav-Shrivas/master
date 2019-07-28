package webdrivertraining;


import java.util.ArrayList;
import java.util.List;

public class Collections {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("abc");
	names.add("abcd");
	names.add(null);
//	for(int i=0; i<names.size(); i++) {
//		System.out.println(names.get(i));
//	}
//	System.out.println(names);
	for(String v :names  ) {
		System.out.println(v);
		//for each loop, this will print all the values of the string stored in the list
	}
}
}
