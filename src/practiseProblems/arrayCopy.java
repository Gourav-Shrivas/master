package practiseProblems;

import java.util.Arrays;

public class arrayCopy {

	 public static void main(String[] args)
	    {
	        int a[] = { 1, 8, 3 };
//	        for(int ac:a) {
//	        	System.out.println(ac);
//	        }
	 
	        // Create an array b[] of same size as a[]
//	        int b[] = new int[a.length];
	 
	        // Copy elements of a[] to b[]
//	        System.arraycopy(a, 0, b, 0, 3);
	 
	        // Change b[] to verify that
	        // b[] is different from a[]
//	        b[0]++;
//	 int c[]=Arrays.copyOfRange(a, 0, 3);
	 int d[]=Arrays.copyOf(a, 3);
	 d[0]++;
	        System.out.println("Contents of a[] ");
	        for (int i = 0; i < a.length; i++)
	            System.out.print(a[i] + " ");
	 
	        System.out.println("\n\nContents of d[] ");
	        for (int i = 0; i < d.length; i++)
	            System.out.print(d[i] + " ");
	        
	       System.out.println(Arrays.toString(a));
	    }
}
