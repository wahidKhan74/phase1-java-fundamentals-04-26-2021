package com.simplilearn.datastructure.queue;


public class TestArrayQueue {

	public static void main(String[] args) {
		
		// create employee objects
		Employee employee1 = new Employee(10001, "Marry Smith", 87653.33);
		Employee employee2 = new Employee(10002, "John Smith", 337653.33);
		Employee employee3 = new Employee(10003, "WWill Clark", 987653.33);
		Employee employee4 = new Employee(10004, "Tony Stark", 887653.33);
		
		ArrayQueue queue = new ArrayQueue(3);
		
		System.out.println("Queue size is "+queue.size());
		//add elements in queue.
		queue.add(employee1);
		queue.add(employee2);
		queue.add(employee3);
		
		System.out.println("Queue size is "+queue.size());
		queue.add(employee4);
		System.out.println("Queue size is "+queue.size());		
		queue.printQueue();
		
		System.out.println("Before Remove Peek :=> "+queue.peek());
		//remove elements from queue
		queue.remove();
		System.out.println("After Remove Peek :=> "+queue.peek());
		
		queue.printQueue();
	}

}
