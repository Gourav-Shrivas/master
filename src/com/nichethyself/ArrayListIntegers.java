package com.nichethyself;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntegers {

	public static void main(String[] args) {
		int count = 0;
		List<Integer>i = new ArrayList<>();
		
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(40);
		i.add(50);
		List<Integer>j = new ArrayList<>();
		j.add(10);
		j.add(20);
		j.add(30);
		j.add(40);
		j.add(50);
	

		
			for(int k=0; k<i.size(); k++) {
				for(int l=0; l<j.size(); l++) {
					
					if(i.get(k)==j.get(l)){
						count++;
						
					}
					
					
				}
				
				

			}
				
			if(count==i.size()){
				System.out.println("list are equal");
			}
			else {
				System.out.println("list are not equal");
			}
		
		}

}
