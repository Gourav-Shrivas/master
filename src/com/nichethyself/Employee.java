package com.nichethyself;

public class Employee {

	 String name="Gourav";
	 int salary=30000;
	 int contact=83570951;
	 String designation="ASE";
	
	
	public String getName() {
		System.out.println("Employee name is "+name);
	return name;
	}
	public  int getSalary() {
		System.out.println("Employee salary is "+salary);
		return salary;
		
}
	public  int getContact() {
		System.out.println("Employee contact is "+contact);
		return contact;
		
	}
	 public  String getdesignation() {
		System.out.println("Employee designation is "+designation);
		
		return designation;
	}
}
