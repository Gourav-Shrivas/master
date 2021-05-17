package com.nichethyself;

public class Interview2 {

	public static void main(String[] args) {
		String s="SELENEIEUEMEE";
	char c='E';
	int count = 0;
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)==c) {
			count++;
		}
	}
	
	System.out.println("number of occurences of E--> "+count);
	}

}
