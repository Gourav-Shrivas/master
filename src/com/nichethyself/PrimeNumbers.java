package com.nichethyself;

import java.util.Scanner;

public class PrimeNumbers {
	static boolean checkForPrime(int m)
    {
        boolean isItPrime = true;
         
        if(m <= 1) 
        {
            isItPrime = false;
             
            return isItPrime;
        }
        else
        {
            for (int i = 2; i <m; i++) 
            {
                if ((m % i) == 0)
                {
                    isItPrime = false;
                     
                    break;
                }
              
            }
             
            return isItPrime;
        }
    }
     
    public static void main(String[] args) 
    {
//        Scanner sc = new Scanner(System.in);
//         
//        System.out.println("How many initial prime numbers you want?");
//         
//        int n = sc.nextInt();
         
        int counter = 1;
         
        int inputNumber = 2;
         
        System.out.println("Initial "+15+" Prime Numbers :");
         
        while (counter <= 15)
        {   
            if (checkForPrime(inputNumber))
            {
                System.out.println(inputNumber);
                 
                counter++;
                 
                inputNumber++;
            }
            else
            {
                inputNumber++;
            }
        }
         
//        sc.close();
    }
}
