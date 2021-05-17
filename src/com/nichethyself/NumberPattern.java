package com.nichethyself;

public class NumberPattern {
	public static void main(String[] args) {
		int m=5;
		printNumbers(m);
		
	}
	

	private static void printNumbers(int n) {
		int i,j;
		
		for (i=0; i<n; i++) {
			int num=1;
			
			for (j=0; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	}

}
