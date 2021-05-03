package com.simplilearn.datastructure.linkedlist.doublylinkedlist;


public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	// add elements to front
	public void addToFront(Employee employee) {
		// create a node
		EmployeeNode node = new EmployeeNode(employee);
		if (isEmpty()) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}
		head = node;
		size++;
	}

	// add elements to last / end
	public void addTOEnd(Employee employee) {
		// create a node
		EmployeeNode node = new EmployeeNode(employee);

		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	// remove element from front
	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		EmployeeNode removedNode = head;
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	// remove element from last

	public EmployeeNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}

		EmployeeNode removedNode = tail;
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	// print list
	public void printList() {
		EmployeeNode current = head;
		System.out.println("Head -> ");
		while (current != null) {
			System.out.print(current.getData());
			System.out.println("<->");
			current = current.getNext();
		}
		System.out.println("<- Tail");
	}
}
