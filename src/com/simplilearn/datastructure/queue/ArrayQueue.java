package com.simplilearn.datastructure.queue;

public class ArrayQueue {

	public int front;
	public int rear;
	private Employee[] queue;
	
	// create a queue
	public ArrayQueue(int capacity){
		queue = new Employee[capacity];
	}
	
	// add  -> add elements from rear
	public void add(Employee employee) {
		// auto grow queue.
		if(rear == queue.length) {
			Employee[] newArr = new Employee[2*queue.length];
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr;
		}	
		// add element in queue.
		queue[rear++] = employee;
	}
	
	// remove -> remove elements from front
	public Employee remove() {
		if(size()==0) {
			rear= 0;
			front= 0;
			return null;
		}
		Employee removeElem = queue[front];
		queue[front] = null;
		front++;
		return removeElem;		
	}
	
	
	// size -> size of the queue
	public int size() {
		return rear - front;
	}
	
	// peek  -> front element
	public Employee peek() {
		if(size() ==0) {
			rear= 0;
			front= 0;
			return null;
		}
		return queue[front];
	}
	
	// print queue -> print all queue elements.
	public void printQueue() {
		System.out.println("Front end -> ");
		for (int index = 0; index < queue.length; index++) {
			if(queue[index] != null)
			System.out.println(queue[index]);
		}
		System.out.println(" <- Rear end ");
	}
	
}
