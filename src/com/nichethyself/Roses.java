package com.nichethyself;

import java.util.Scanner;

public class Roses extends Flowers {
	int roses=20;
	int rosespurchased;
	
	@Override
	public int ShowInventory() {

		roses=roses-rosespurchased;
	
	return roses;
	
		}

	@Override
	public int Purchase() {
		System.out.println("enter your choice");
		Scanner scan=new Scanner(System.in);
		 rosespurchased=scan.nextInt();
		if(rosespurchased<=roses) {
			System.out.println("Roses purchased are "+rosespurchased);
		}
		else {
			System.out.println(rosespurchased+" Roses cant be purchased");
		}
		return rosespurchased;
		
		
	}

	

}
