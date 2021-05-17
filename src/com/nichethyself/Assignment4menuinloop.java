package com.nichethyself;

import java.util.Scanner;

public class Assignment4menuinloop {
	public static void main(String[] args) {
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for Multiplication");
		System.out.println("Enter 3 for substraction");
		System.out.println("Enter 4 for division");
		System.out.println("Enter 5 for Modulo");
		System.out.println("Enter 6 for Exit");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		int value=scan.nextInt();
		
			switch(value) {
			case 1:		
				System.out.println("Enter first value");
				int value1=scan.nextInt();
				System.out.println("Enter second value");
				int value2=scan.nextInt();
				addition();
				System.out.println("addition is "+(value1+value2));
				break;

			case 2:
				System.out.println("Enter first value");
				int value11=scan.nextInt();
				System.out.println("Enter second value");
				int value21=scan.nextInt();
				substraction();
				System.out.println("multiplication is "+(value11*value21));
			break;
			case 3:
				System.out.println("Enter first value");
				int value111=scan.nextInt();
				System.out.println("Enter second value");
				int value211=scan.nextInt();
				multiplication();
				System.out.println("substraction is "+(value111-value211));
			break;
			
			case 4:
				System.out.println("Enter first value");
				int value1111=scan.nextInt();
				System.out.println("Enter second value");
				int value2111=scan.nextInt();
				division();
				System.out.println("division is "+(value1111/value2111));
			break;
			case 5:
				System.out.println("Enter first value");
				int value11111=scan.nextInt();
				System.out.println("Enter second value");
				int value21111=scan.nextInt();
				modulo();
				System.out.println("modulo is "+(value11111%value21111));
				break;
			case 6       : System.out.println("Exit");
			}
			if(value<6) {
				main(args);
			}
		}
				

	private static void modulo() {
			
	}

	private static void division() {
			
	}

	private static void multiplication() {
			
	}

	private static void substraction() {
		}

	private static void addition() {
		}
	}


