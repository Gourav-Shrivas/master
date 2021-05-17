package notepad;

public class FindArmstrong {
	public static void main(String []args){
		int number=3454;
		if(isArmstrong(number)){
		System.out.println("number is an armstrong numbver");
		}
		else{
		System.out.println("number is  not an armstrong numbver");
		}



		}

		public static boolean isArmstrong(int n){
		int temp=0;
		int total=0;
		int num;

		num=n;
		while(num!=0){
		temp=num%10;
		total= total+temp*temp*temp;
		num=num/10;

		}

		if(total==n){
		 return true;

		}
		else
		return false;
		}
}
