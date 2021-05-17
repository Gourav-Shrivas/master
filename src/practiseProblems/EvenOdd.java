package practiseProblems;

public class EvenOdd {

	public static boolean isEven(int n) {
		if((n/2)*2==n){
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int number=104;
		if(isEven(number)) {
			System.out.println("given number is even");
		}
		
		else {
			System.out.println("given number is odd");
		}
	}
}
