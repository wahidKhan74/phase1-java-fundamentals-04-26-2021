package com.simplilearn.innerclass;

public class TestOuter {
	
	// outer class data members
	private int count = 100;
	private String message = "This is a 'outer class' private string! ";
	public String data = "Today is a good day !";

	// outer class member function
	private int increaseCount() {
		return count++;
	}

	// inner class : non static inner class
	class TestInner {
		
		// inner class data members.
		private String message2 = " This is a 'inner class' private string !";
		
		// inner class member function.
		public void showAll(){
			
			System.out.println(" --- Outer class data -----");
			System.out.println(message);
			System.out.println("The Count : "+count);
			System.out.println(data);
			
			System.out.println(" --- Inner class data -----");
			System.out.println(message2);
			
			increaseCount();
			System.out.println("The Count : "+count);
		}

	}

	public static void main(String[] args) {
		
		// create outer class instance
		TestOuter outer = new TestOuter();
		
		// create inner class instance
		TestOuter.TestInner inner = outer.new TestInner();
		
		inner.showAll();
		

	}

}
