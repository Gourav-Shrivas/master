package com.nichethyself;

import java.util.Scanner;

public class Lilly extends Flowers {
	
	int Lillypurchased;
int Lilly=15;

	@Override
	public int ShowInventory() {
		Lilly=Lilly-Lillypurchased;
		return Lilly;
	}

	@Override
	public int Purchase() {
		System.out.println("enter your choice");
		Scanner scan=new Scanner(System.in);
		Lillypurchased=scan.nextInt();
		if(Lillypurchased<=Lilly) {
			System.out.println("Lilly purchased are "+Lillypurchased);
		}
		else {
			System.out.println(Lillypurchased+"Lilly cant be purchased");
		}
		return Lillypurchased;
		
	}
	

	

}
