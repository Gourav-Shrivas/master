package practiseProblems;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		int number=2;
		int counter=1;
		
		System.out.println("Initial "+15+" Prime numbers are :");
		
		while(counter<=15) {
			if(checkForPrime(number)) {
				System.out.println(number);
				number++;
				counter++;
			}
			else {
				number++;
			}
		}
	}
	
	public static boolean checkForPrime(int n) {
		boolean isPrime=true;
		
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				 isPrime=false;
				break;
			}
			
			
		}
		return isPrime;
	}

}
