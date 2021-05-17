package practiseProblems;

import java.util.Arrays;

public class ArrayComparison {

	public static boolean areEqual(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
 
        // If lengths of array are not equal means
        // array are not equal
        if (n != m)
            return false;
 
//        // Sort both arrays
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
 
        // Linearly compare elements
        for (int i = 0; i < n; i++)
            if (arr1[i] != arr2[i])
                return false;
 
        // If all elements were same.
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };
 
        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        //we can also use equals method for comparing the two arrays
       System.out.println(Arrays.equals(arr1, arr2));
    }
}

