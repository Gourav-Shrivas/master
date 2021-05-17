package com.nichethyself;

import java.util.Scanner;

public class SchoolImplementation  {
	


public static void main(String[] args) {
	
	Student array[]=new Student[10];
	
	
	for(int value1=0; value1<5; value1++) {
		System.out.println("1.add student details");
		System.out.println("2.print details");
		System.out.println("3.Search student");
		System.out.println("4.Edit details");
		System.out.println("5.exit");
		Scanner scan1=new Scanner(System.in);
		value1=scan1.nextInt();
		
		switch(value1) {
		
		case 1:
			int i3=0;
			
			while(i3<array.length) {
				Scanner s=new Scanner(System.in);
			String str1=s.nextLine();
				int contact1=s.nextInt();
				int percentage1=s.nextInt();
				int rollno1=s.nextInt();
				
				
				System.out.println("name is "+str1 +" percentage is "+percentage1 + " rollno is " +rollno1+ " contact is "+contact1);
				Student S=new Student(str1, rollno1, contact1, percentage1);
				array[i3]=S;
				i3++;
			}
		
			
			
		
		System.out.println("Student details added successfully");
		break;
		
		
		case 2: 
			
			System.out.println("printing student records");
			
			for(int i = 0; i<array.length; i++) {
				System.out.println("percentage is "+array[i].percentage);
				System.out.println("Name is "+array[i].name);
				System.out.println("Contact number is "+array[i].contact);
				System.out.println("Roll number is "+array[i].rollno);
			}
			
			break;
			
		case 3: 
			System.out.println("enter student roll no to search");
			
				
			Scanner Sc=new Scanner(System.in);
			int value=Sc.nextInt();
				for(int i1=0; i1<array.length; i1++) {
					
					if(value==array[i1].rollno) {
					boolean flag=true;
					if(flag) {
					System.out.println("print details");
					
					System.out.println("percentage is "+array[i1].percentage);
					System.out.println("Name is "+array[i1].name);
					System.out.println("Contact number is "+array[i1].contact);
				
			}
					

				}
				
					
				
				

			
		
				}
			break;
				
		case 4: 
			System.out.println("enter student roll no to edit");
			Scanner sc=new Scanner(System.in);
			int v=sc.nextInt();
			for(int i2=0; i2<array.length; i2++) {
				if(v==array[i2].rollno) {
					boolean flag=true;
					if(flag) {
				System.out.println("Record is found");
				
				System.out.println("1 name");
				System.out.println("2 percentage");
	            System.out.println("3 contact");
	            System.out.println("what do u want to edit?");
	            Scanner scan=new Scanner(System.in);
				int value2=scan.nextInt();
				switch(value2) {
				case 1: String n=array[i2].name="kishan";
				System.out.println("new name is "+n);
				break;
				
				case 2: int f=array[i2].percentage=99;
				System.out.println("new percentage is "+f );
				break;
				
				case 3: int c=array[i2].contact=5454;
				System.out.println("new contact is "+c);
				break;
				}
				
				

			}
				else {
					System.out.println("student record not found");
				}	
					
			}
				
			}
			
			break;
		case 5: 
			System.out.println("Exit");
			break;
			
	}
		scan1.close();
		
	}
	
	

}
}
	
	
	
