package com.simplilearn.datastructure.statck.arraystack;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private int top;
	private Employee[] stack;
	
	// create stack
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	// push 
	public void push(Employee employee) {
		// auto growable stack-> increase capacity of stack
		if(top == stack.length) {
			//double the size of the stack
			Employee[] newArr = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack = newArr;
		}		
		// add value in stack array
		stack[top++] = employee;
	}
	
	//pop
	public Employee pop() {
		//verify stack is empty
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		//remove element from top
		Employee removedElem = stack[--top];
		stack[top] = null;
		return removedElem;
	}
	
	// peek
	public Employee peek() {
		// verfiy stack is empty.
		if(isEmpty()) {
			throw new EmptyStackException();
		}		
		return stack[top-1];
	}
	
	// size
	public int size() {
		return top;
	}
	
	// capacity
	public int capacity() {
		return stack.length;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return top == 0;
	}
	
	//print stack
	public void printStack() {
		System.out.println(" top ->");
		for (int index = top-1; index >= 0 ; index--) {
			System.out.println(stack[index]);
		}
	}
	
}
