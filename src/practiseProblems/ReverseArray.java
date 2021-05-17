package practiseProblems;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int temp;
	for(int i=0;i<a.length/2;i++) {
		temp=a[i];
		a[i]=a[a.length-i-1];
		a[a.length-i-1]=temp;
	}
	
//	//elements printing in console
//		for(int j=0;j<a.length;j++) {
//			System.out.println(a[j]);
//		}
		
		for(int in:a) {
			System.out.println(in);
		}
		//printing array as String representation
		System.out.println(Arrays.toString(a));
	
	
}
}
