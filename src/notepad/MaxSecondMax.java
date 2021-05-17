package notepad;

public class MaxSecondMax {

	public static void main(String args[]){

		int a[]={1,10,34,56,789,100,101,1000};




		int maxone=0;
		int maxtwo=0;
		for(int n: a){
		if(maxone<n){

		maxtwo=maxone;
		maxone=n;
		}

		else if(maxtwo<n){
		maxtwo=n;
		}
		}
		
		System.out.println("max number is :"+maxone);
		System.out.println("Second max number is :"+maxtwo);


		}
}
