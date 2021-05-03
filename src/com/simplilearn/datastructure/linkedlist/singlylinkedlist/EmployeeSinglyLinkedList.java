package com.simplilearn.datastructure.linkedlist.singlylinkedlist;

public class EmployeeSinglyLinkedList {

	private EmployeeNode head;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element to the first/ front in the singly list
	public void addToFront(Employee employee) {
		
		// create a node
		EmployeeNode node = new EmployeeNode(employee);
		
		// set next node ref
		node.setNext(head);
		
		// set current/created node as head
		head= node;
		
		size++;
		
	}
	
	// remove element from head in a singly list 
	public EmployeeNode removeFromFront() {
		
		// check list is empty
		if(isEmpty()) {
			return null;
		}
		
		// remove head
		EmployeeNode removedNode = head;
		
		// set next node in list as head node
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	// print list
	public void printList() {
		EmployeeNode current = head;
		System.out.println("Head -> ");
		while(current != null ) {
			System.out.print(current.getData());
			System.out.println("->");
			current = current.getNext();
		}
		System.out.println("null <- tail");
	}
}
