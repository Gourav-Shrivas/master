package com.nichethyself;

import java.util.Scanner;

public class Sunflower extends Flowers{
	int Sunflower=30;
	int Sunflowerpurchased;
	@Override
	public int ShowInventory() {

		Sunflower=Sunflower-Sunflowerpurchased;
		return Sunflower;
	}

	@Override
	public int Purchase() {
		System.out.println("enter your choice");
		Scanner scan=new Scanner(System.in);
		 Sunflowerpurchased=scan.nextInt();
		if(Sunflowerpurchased<=Sunflower) {
			System.out.println("Sunflower purchased are "+Sunflowerpurchased);
		}
		else {
			System.out.println(Sunflowerpurchased+"Sunflower cant be purchased");
		}
		return Sunflowerpurchased;
		
	}

	

}
