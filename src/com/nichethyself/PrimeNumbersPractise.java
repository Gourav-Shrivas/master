package com.nichethyself;

public class PrimeNumbersPractise {
	

	 static boolean checkforPrime(int m)
	{
	
		 boolean isitPrime=true;
		
		if(m<=1) {
			isitPrime=false;
			return isitPrime;
		}
		else {
			for(int i=2 ; i<m ;i++) {
				if((m%i)==0){
					isitPrime=false;
					
					break;
					
				}
			}
			
			return isitPrime;
		}
		
	}
	
	public static void main(String[] args) {
		int counter=1;
		
		int inputnumber=2;
		
		System.out.println("Initial "+15+" Prime Numbers :");
		
		while(counter<=15)
		{
			if(checkforPrime(inputnumber)) {
				System.out.println(inputnumber);
				counter++;
				inputnumber++;
				
			}
			else {
				inputnumber++;
			}
		}
	}
}
