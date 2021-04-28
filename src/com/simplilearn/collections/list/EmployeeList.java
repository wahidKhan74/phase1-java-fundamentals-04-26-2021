package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		// create multiple employee objects
		Employee employee1 = new Employee(1001, "John Smith", 238237.342);
		Employee employee2 = new Employee(1002, "Marry Smith", 138237.342);
		Employee employee3 = new Employee(1003, "Mike Smith", 9878237.342);
		Employee employee4 = new Employee(1004, "David Smith", 998237.342);
		
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		
		listOfEmployee.add(employee1);
		listOfEmployee.add(employee2);
		listOfEmployee.add(employee3);
		
		// insert at index
		listOfEmployee.add(2,employee4);
		
		System.out.println(listOfEmployee);
		System.out.println(listOfEmployee.get(2));
		
		System.out.println("----------------");
		
		// list iterator  -> old syntax
		Iterator<Employee> itr = listOfEmployee.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----------------");
		// enhance for loop -> new syntax over list
		for(Employee emp : listOfEmployee) {
			System.out.println(emp);
		}
	}
	
}
