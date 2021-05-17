package practiseProblems;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayList {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Ankita");
		names.add("rahul");
		names.add("rohan");
		names.add("kanak");
		
		List<String> temp=new ArrayList<>();
		for(String s:names) {
			temp.add(s);
		}
		
		names.removeAll(temp);
		System.out.println(names);
		System.out.println(temp);
		
		
		
	}
}
