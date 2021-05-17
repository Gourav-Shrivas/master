package com.nichethyself;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
public static void main(String[] args) {
	List<String> listContainingDuplicates;
	ArrayList <String> list=new ArrayList<>();
	
	for(int i=0; i<10; i++) {
		list.add(String.valueOf(i));
	}
	
	for(int i=0; i<5; i++) {
		list.add(String.valueOf(i));
	}
	System.out.println("Input list : " + list);
//	System.out.println("\nFiltered duplicates : " + processList(list));
	
//	public static Set<String> processList(List<String> listContainingDuplicates) {
//
//		final Set<String> resultSet = new HashSet<String>();
//		final Set<String> tempSet = new HashSet<String>();
//
//		for (String yourInt : listContainingDuplicates) {
//			if (!tempSet.add(yourInt)) {
//				resultSet.add(yourInt);
//			}
//		}
//		return resultSet;
//	 
//}
}
}
