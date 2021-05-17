package notepad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String args[]){

		List<String> list=new ArrayList<>();
		list.add("Selenium");
		list.add("Manchester");
		list.add("backup");
		list.add("Integer");
		list.add("ParseInteger");

		String array[]=new String[list.size()];
		for(int i=0; i<list.size(); i++){
		System.out.println(array[i]=list.get(i));
		}

		System.out.println(Arrays.deepToString(array));
		System.out.println(Arrays.toString(array));

		}
}
