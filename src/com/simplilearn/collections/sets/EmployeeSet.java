package com.simplilearn.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {

		// create multiple employee objects
		Employee employee1 = new Employee(1001, "John Smith", 238237.342);
		Employee employee2 = new Employee(1002, "Marry Smith", 138237.342);
		Employee employee3 = new Employee(1003, "Mike Smith", 9878237.342);
		Employee employee4 = new Employee(1004, "David Smith", 998237.342);
		
		Set<Employee> setOfEmployee = new LinkedHashSet<Employee>();
		
		// add employees
		setOfEmployee.add(employee1);
		setOfEmployee.add(employee2);
		setOfEmployee.add(employee3);
		setOfEmployee.add(employee4);
		
		System.out.println(setOfEmployee);
		
		System.out.println("----------------------");
		// enhance for loop
		for(Employee emp : setOfEmployee) {
			System.out.println(emp);
		}

	}

}
