package com.nichethyself;

public class Amdocs {

	public static void main(String[] args) {
		try {
			String c=null;
			int a=10,b=0;
			int result=a/b ;
			System.out.println(result);
			c.length();
			
		}
		
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		
		catch(Exception ex){
			System.out.println(ex);
		}
		System.out.println("Hello");
	}
}
