package com.nichethyself;

public class Assignment9 {

	public static void main(String[] args) {
		int num1=0,num2=1,count=10;
		
		System.out.println("fibonacci series of "+count+" numbers:");
		for (int i=0; i<count;i++) {
			System.out.println(num1);
			 int sumofprvtwo = num1+num2;
			 
			num1=num2;
			num2=sumofprvtwo;
			
		}

	}

}
