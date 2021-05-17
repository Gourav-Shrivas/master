package practiseProblems;

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {
		int temp=0,total=0,number;
		
		number=num;
		while(number!=0) {
			temp=number%10;
			total=total+temp*temp*temp;
			number=number/10;
		}
		
		if(total==num) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int m=153;
		if(isArmstrong(m)) {
			System.out.println("given number is Armstrong number");
		}
		
		else {
			System.out.println("given number is not an Armstrong number");
		}
	}
}
