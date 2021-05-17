package com.nichethyself;

public class InterviewQ4 {

	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i%3==0){
				System.out.print(i);
				System.out.print("abc ");
			}
			
		}
		System.out.println();
		for(int i=0; i<=50; i++) {
			if(i%5==0) {
				System.out.print(i);
				System.out.print("def ");
			}
		}
		System.out.println();
		for(int i=0; i<=50; i++) {
			if(i%10==0) {
				System.out.print(i);
				System.out.print("abcdef ");
			}
		}
	}
}
