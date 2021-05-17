package com.nichethyself;

import java.util.Scanner;

public class FNPWithoutOOPS {
	static int roses=20;
	static int Lilly=15;
	static int Sunflower=30;
	static int rosespurchased = 0;
	static int Lillypurchased = 0;
	static int Sunflowerpurchased = 0;
	public static void main(String[] args) {
		

		
		for(int value=0; value<=3; value++ ) {
			
			System.out.println("1.Show Inventory");
			System.out.println("2.Purchase");
			System.out.println("3.Exit");
			Scanner scan=new Scanner(System.in);
			 value=scan.nextInt();
			switch(value) {
			case 1: 
				
				if(roses<=0 ){
					System.out.println("roses out of stock");
				}
				else {
					System.out.println("roses= "+roses);	
				}
				
				if(Lilly<=0){
					System.out.println("Lilly out of stock");
				}
				else {
					System.out.println("Lilly= "+Lilly);
				}
				
				if(Sunflower<=0){
					System.out.println("Sunflower out of stock");
				}
				else {
					System.out.println("Sunflower= "+Sunflower);
				}
				
				
		
			break;
			case 2: 
				for(int value1=0; value1<=4; value1++) {
					System.out.println("1.Roses");
					System.out.println("2.Sunflower");
					System.out.println("3.Lily");
					System.out.println("4.Exit");
					Scanner scan1=new Scanner(System.in);
					 value1=scan1.nextInt();
					switch(value1) {
					case 1: 
						rosespurchased=scan1.nextInt();
					if(rosespurchased<=roses && rosespurchased>0)
					{
					System.out.println("roses purchased are "+rosespurchased);
					System.out.println("roses remaining are "+(roses=roses-rosespurchased));
					}
					else {
						System.out.println(rosespurchased+" roses cant be purchased");
					}
				
					break;
					case 2: 
						Sunflowerpurchased=scan1.nextInt();
					if(Sunflowerpurchased<=Sunflower){
						System.out.println("Sunflower purchased are "+Sunflowerpurchased);
						System.out.println("Sunflower remaining are "+(Sunflower=Sunflower-Sunflowerpurchased));
					}
					
					
					
					
					break;
					case 3: 
						Lillypurchased=scan1.nextInt();
					if(Lillypurchased<=Lilly){
						System.out.println("Lilly purchased are "+Lillypurchased);
						System.out.println("Lilly remaining are "+(Lilly=Lilly-Lillypurchased));
					}
					
					
					
					break;
					
					}	
				}
				
				
				break;
			case 3: System.out.println("thank you for visiting ferns and petals!! visit again!");
			break;
			}
		}
		
		
	}
	
}
