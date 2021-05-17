package com.nichethyself;

public class PrintDetails {

	public static void main(String[] args) {
		Employee obj=new Manager();
		//Manager obj1=new Manager();
		obj.getName();
		obj.getContact();
		obj.getdesignation();
		obj.getSalary();
		Employee obj1=new Employee();
		obj1.getContact();
		obj1.getdesignation();
		obj1.getName();
		obj1.getSalary();
	}

}
