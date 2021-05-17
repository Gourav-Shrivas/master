package notepad;

import java.util.Arrays;

public class SystemArrayCopy {

	public static void main(String args[]){

		int a[]={1,8,3};
		int b[]=new int[a.length];
		System.arraycopy(a,0,b,0,3);
		b[0]++;

		System.out.println("Contents of array a are ");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+" ");
		}

		System.out.println("Contents of array b are ");
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]+" ");
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		}
	

}
