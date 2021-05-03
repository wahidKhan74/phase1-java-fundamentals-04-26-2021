package com.simplilearn.datastructure.linkedlist.circularlinkedlist;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(10001, "Marry Smith", 87653.33);
		Employee employee2 = new Employee(10002, "John Smith", 337653.33);
		Employee employee3 = new Employee(10003, "Will Clark", 987653.33);
		Employee employee4 = new Employee(10004, "Tony Stark", 887653.33);
		
		// create employee list
		EmployeeCircularLinkedList list = new EmployeeCircularLinkedList();
		
		System.out.println("List size :: "+list.getSize());
		System.out.println("List is Empty :: "+list.isEmpty());
		
		// add values
		list.addToFront(employee1);
		list.addToFront(employee2);
		list.addToFront(employee3);
		list.addToFront(employee4);
		
		System.out.println("List size :: "+list.getSize());
		System.out.println("List is Empty :: "+list.isEmpty());
		
		
		list.removeFromFront();
//		list.removeFromFront();
		
		list.printList();

	}

}
