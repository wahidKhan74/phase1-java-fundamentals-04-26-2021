package com.simplilearn.methods.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee employee1 = new Employee(10001, "John Smith");

		System.out.println("Id : " + employee1.id);
		System.out.println("Name : " + employee1.name);

		Employee employee2 = new Employee(10002, "Mike Smith","Engineering",2383473.23);

		System.out.println("Id : " + employee2.id);
		System.out.println("Name : " + employee2.name);
		System.out.println("Dept : " + employee2.dept);
		System.out.println("Salary : " + employee2.salary);
	}

}

class Employee {

	// properties : data members
	int id;
	String name;
	String dept;
	double salary;

	// zero parameter constructor // default constructor
	Employee() {
	};

	// Parameterized constructor
	Employee(int id) {
		this.id = id;
	};

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	};

	Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	};

	// this -> this keyword refers to the current object.
}
