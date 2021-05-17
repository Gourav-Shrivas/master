package com.nichethyself;

public class EvenOddWithoutmod {

	public static boolean isEven(int n) {
		
		
		if((n/2)*2==n){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=103;
		if(isEven(n)) {
		System.out.println("Even");	
		}
		else {
			System.out.println("odd");
		}
	}
}
