package com.simplilearn.datastructure.linkedlist.circularlinkedlist;

public class EmployeeCircularLinkedList {

	private EmployeeNode head;
	private int size;
	private EmployeeNode tail;
	
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
		// if list empty
		if(isEmpty()) {
			head = node;
			tail = node;
		} else {
			// set next node ref
			tail.setNext(node);
		}
		// set current/created node as head
		tail= node;
		// for circular linked list  tail -> head
		tail.setNext(head);		
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
		tail.setNext(head);
		return removedNode;
	}
	
	// print list
	public void printList() {
		EmployeeNode current = head;
		if(current == null) {
			System.out.println("Circular Linked list is empty !");
		} else {
			System.out.println("Head <-> Tail ");
			do {
				if(current != null) {
					System.out.print(current.getData());
					System.out.println("->");
					current = current.getNext();
				}
			} while(current != head);
		}
	}
}
