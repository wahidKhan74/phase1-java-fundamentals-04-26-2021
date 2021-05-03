package com.simplilearn.datastructure.linkedlist.doublylinkedlist;


public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(10001, "Marry Smith", 87653.33);
		Employee employee2 = new Employee(10002, "John Smith", 337653.33);
		Employee employee3 = new Employee(10003, "WWill Clark", 987653.33);
		Employee employee4 = new Employee(10004, "Tony Stark", 887653.33);
		
		// create a doubly linked list
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		System.out.println("List size :: "+list.getSize());
		System.out.println("List is Empty :: "+list.isEmpty());
		
		// add values
		list.addToFront(employee1);
		list.addToFront(employee2);
		
		list.addTOEnd(employee3);
		list.addTOEnd(employee4);
		
		System.out.println("List size :: "+list.getSize());
		System.out.println("List is Empty :: "+list.isEmpty());
		
		list.removeFromFront();
		list.removeFromEnd();
		
		list.printList();
		
	}
	
}
