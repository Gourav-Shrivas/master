package com.nichethyself;

import java.util.Scanner;

public class FernsPetalsImplementation extends Flowers {
	
	public static void main(String[] args) {
		
		Roses r=new Roses();	
		Sunflower s=new Sunflower();
		Lilly l=new Lilly();
		
		for(int value=0; value<=3; value++ ) {
			
			System.out.println("1.Show Inventory");
			System.out.println("2.Purchase");
			System.out.println("3.Exit");
			Scanner scan=new Scanner(System.in);
			 value=scan.nextInt();
			switch(value) {
			case 1: 
				if(r.roses<=0 ){
					System.out.println("roses out of stock");
				}
				else {
					System.out.println("roses = "+r.ShowInventory());	
				}
				if(l.Lilly<=0){
					System.out.println("Lilly out of stock");
				}
				else {
					System.out.println("Lilly = "+l.ShowInventory());
				}
				if(s.Sunflower<=0){
					System.out.println("Sunflower out of stock");
				}
				else {
					System.out.println("Sunflower = "+s.ShowInventory());
				}
				
				
		
			break;
			case 2: 
				for(int value1=0; value1<=4; value1++) {
					System.out.println("1.Roses");
					System.out.println("2.Sunflower");
					System.out.println("3.Lily");
					System.out.println("4.Exit");
					Scanner scan1=new Scanner(System.in);
					 value1=scan.nextInt();
					switch(value1) {
					case 1: r.Purchase();
					if(r.rosespurchased<=r.roses)
					{
					
					System.out.println("roses remaining are "+r.ShowInventory());
					}
										
				
					break;
					case 2: s.Purchase();
					if(s.Sunflowerpurchased<=s.Sunflower){
						System.out.println("Sunflower remaining are "+s.ShowInventory());
					}
					
					
					
					
					break;
					case 3: l.Purchase();
					if(l.Lillypurchased<=l.Lilly){
						System.out.println("Lilly remaining are "+l.ShowInventory());
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
