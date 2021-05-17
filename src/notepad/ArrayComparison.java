package notepad;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String args[]){

		int array1[]={1,2,3,4,5,6};
		int array2[]={1,2,3,4,5,6};
		if(areArrayEqual(array1,array2)){
		System.out.println("arrays are equal");
		}

		else{
			System.out.println("arrays are not equal");
		}
		  //we can also use equals method for comparing the two arrays
//	       System.out.println(Arrays.equals(array1, array1));

		}

		public static boolean areArrayEqual(int a[], int b[]){

		int l1= a.length;
		int l2=b.length;

		if(l1!=l2){
		return false;
		}

		else{
		for(int i=0 ; i<l1 ; i++){
		if(a[i]==b[i]){
		return true;
		}
		}
		}
		return false;

		}
		
		

}
