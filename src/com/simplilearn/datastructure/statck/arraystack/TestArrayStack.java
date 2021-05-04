package com.simplilearn.datastructure.statck.arraystack;


public class TestArrayStack {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(10001, "Marry Smith", 87653.33);
		Employee employee2 = new Employee(10002, "John Smith", 337653.33);
		Employee employee3 = new Employee(10003, "WWill Clark", 987653.33);
		Employee employee4 = new Employee(10004, "Tony Stark", 887653.33);
		
		ArrayStack stack = new ArrayStack(2);
		
		System.out.println("stack size :: "+stack.size());
		System.out.println("stack is Empty :: "+stack.isEmpty());
		
		stack.push(employee1);
		stack.push(employee2);
		
		stack.push(employee3);
		
		System.out.println("stack size :: "+stack.size());
		System.out.println("stack is Empty :: "+stack.isEmpty());
		
		stack.printStack();
		System.out.println("Top : => "+stack.peek());
		
		stack.pop();
		System.out.println("After removal Top : => "+stack.peek());
	}

}
