package com.nichethyself;

public class Manager extends Employee {
	String name="Sourav";
	int salary=100000;
	int contact=8357091;
	String designation="Manager";
	String workplace="Bracknell";

	public String getName() {
		System.out.println("manager name is "+name);
		return name;
		}
	

public int getSalary() {
	System.out.println("manager salary is "+salary);
	return salary;
	
}
public int getContact() {
	System.out.println("manager contact is "+contact);
	return contact;
	
}
public String getdesignation() {
	System.out.println("manager designation is "+designation);
	
	return designation;
}
}
