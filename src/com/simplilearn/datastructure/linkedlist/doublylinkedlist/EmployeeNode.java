package com.simplilearn.datastructure.linkedlist.doublylinkedlist;

public class EmployeeNode {

		private EmployeeNode previous;
		private Employee data;
		private EmployeeNode next;
		
		// create a node
		EmployeeNode(Employee data){
			this.data = data;
		}

		// getter and setter
		public EmployeeNode getPrevious() {
			return previous;
		}

		public void setPrevious(EmployeeNode previous) {
			this.previous = previous;
		}

		public Employee getData() {
			return data;
		}

		public void setData(Employee data) {
			this.data = data;
		}

		public EmployeeNode getNext() {
			return next;
		}

		public void setNext(EmployeeNode next) {
			this.next = next;
		}

		//ovverid tostring
		public String toString() { return data.toString(); };	
		
}
