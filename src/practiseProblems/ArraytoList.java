package practiseProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
//		String [] array= {"gfdgd","gfgf","gdfgfgf"};
//		List<Object> list=new ArrayList<>();
//		for(String i:array) {
//			list.add(i);
//		
//		}
//		
//		System.out.println(list);
//		System.out.println(list.toString());
		
		
		List<String> names=new ArrayList<>();
		names.add("Sedlenium");
		names.add("manchester");
		names.add("jargons");
		names.add("london");
		
//		Object[] c=names.toArray();
		
		String arr[]=new String[names.size()];
		for(int i=0; i<names.size();i++) {
			System.out.println(arr[i]=names.get(i));
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
