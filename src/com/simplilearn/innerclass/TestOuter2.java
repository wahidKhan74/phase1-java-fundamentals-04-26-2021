package com.simplilearn.innerclass;

public class TestOuter2 {
	
	// outer class data members
	private static int count = 100;
	private static String message = "This is a 'outer class' private string! ";
	public static String data = "Today is a good day !";

	// outer class member function
	private static int increaseCount() {
		return count++;
	}

	// static inner class : non static inner class
	static class TestInner {
		
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
		
		// create inner class instance
		TestOuter2.TestInner inner = new TestOuter2.TestInner();
		
		inner.showAll();
		

	}

}
