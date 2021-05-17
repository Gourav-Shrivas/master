package notepad;

import java.util.ArrayList;
import java.util.List;

public class ArraytoList {

	public static void main(String args[]){

		String array[]={"Selenium","Characterzs","manchester","London"};

		List<String> list=new ArrayList<>();
		for(int i=0; i<array.length; i++){
			list.add(array[i]);
		}

		System.out.println(list);
		System.out.println(list.toString());

		}
}
