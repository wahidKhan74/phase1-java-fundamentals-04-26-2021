package com.simplilearn.datastructure.linkedlist;

import java.util.LinkedList;

public class EmployeeLinkedListDemo {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(10001, "Marry Smith", 87653.33);
		Employee employee2 = new Employee(10002, "John Smith", 337653.33);
		Employee employee3 = new Employee(10003, "WWill Clark", 987653.33);
		Employee employee4 = new Employee(10004, "Tony Stark", 887653.33);
		
		
		// linked list  -> java collections -> backed by doubly linked
		LinkedList<Employee> employees = new LinkedList<Employee>();
		
		// add employee
		employees.add(employee1);
		employees.add(employee2);
		
		//add element in first
		employees.addFirst(employee3);
		
		// add element from last
		employees.addLast(employee4);
		
		employees.add(2,employee2);
		System.out.println(employees);
		
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		

	}

}
