package com.simplilearn.serialization;

import java.io.Serializable;

// employee pojo : plane old java object class
public class Employee  implements Serializable{
	
	int id;
	String name;
	double slary;	
	
	public Employee(int id, String name, double slary) {
		this.id = id;
		this.name = name;
		this.slary = slary;
	}
	
	public Employee() { }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", slary=" + slary + "]";
	}
	
}
