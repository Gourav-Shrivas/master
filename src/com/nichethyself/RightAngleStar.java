package com.nichethyself;

public class RightAngleStar {

	 // Function to demonstrate printing pattern 
    public static void printStars(int n) 
    { 
      
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(int i=0; i<n; i++) 
        { 
  
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop     
            for(int j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
   } 
  
    // Driver Function 
    public static void main(String args[]) 
    { 
      
        printStars(5); 
    }
}
