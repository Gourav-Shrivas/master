package com.nichethyself;

public class Assignment4 {
public static void main(String[] args) {
	String str="i love my india";
	char word='i';
	int count=0;
	int len=str.length();
		for (int a = 0; a < len; a++) {
		if(str.charAt(a)== word) {
			count++;
		}
		}
		if (count!=0) {
		System.out.println("occurence of i is=" +count+" length of string="+len);
		}
		else {
			System.out.println("0 occurence");
		}
	}
	
}
