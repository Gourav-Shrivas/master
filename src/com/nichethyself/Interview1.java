package com.nichethyself;

public class Interview1 {

	public static void main(String[] args) {
		int num=34543;
		int reversed=0;
		while(num!=0){
			int digit=0;
			 digit=num%10;
			 reversed=reversed*10+digit;
			 num=num/10;
			
		}
		System.out.println("reversed number is "+reversed);
		if(reversed==34543){
			System.out.println("reversed number is palindrome number");
		}
		else {
			
			System.out.println("reversed number is not a palindrome number");
		}
	}

}
