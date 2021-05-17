package practiseProblems;

public class Palindrome {
    
    public static boolean isPalindrome(int number) {
    	
    	int reversed=0;
    	
    	int n=number;
    	while(number!=0) {
    		int digit=number%10;
    		reversed=reversed*10+digit;
    		number/=10;
    	}
    	
    	if(reversed==n) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public static void main(String[] args) {
		int num=999;
		if(isPalindrome(num)) {
			System.out.println(num+" is a palindrome number");
		}
		
		else {
			System.out.println(num+" is not a palindrome number");
		}
	}
	
}
