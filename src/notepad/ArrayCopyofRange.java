package notepad;

import java.util.Arrays;

public class ArrayCopyofRange {

	public static void main(String args[]){

		int a[]={1,8,3};

		int c[]=Arrays.copyOfRange(a,0,3);
		c[0]++;

		System.out.print("Contents of array a are ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}

		System.out.print("Contents of array c are ");
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]+" ");
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		}
}
