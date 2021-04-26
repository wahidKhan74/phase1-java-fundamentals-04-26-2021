package com.simplilearn.typecasting;

public class StringToNumericConvertor {

	public static void main(String[] args) {
		
		// String to Numeric conversion : Note String value should be a convertible value.
		
		String price = "123";  // string literal => convertible value.
		
		String amount = "126abc";  // non-convertible string.
		
		// convert string -> float
		// Use Wrapper class for conversion :- int, float ,double  >-> Integer , Float, Double etc.
		float floatPrice = Float.parseFloat(price);
		
		// convert string to int type
		int intPrice = Integer.parseInt(price);
		
		double doublePrice = Double.parseDouble(price);
		
		// Convention fails due to non-convertible string.
//		double doubleAmount = Double.parseDouble(amount);
		
		System.out.println("Float Price :: "+floatPrice);
		System.out.println("Double Price :: "+doublePrice);
		System.out.println("Integer Price :: "+intPrice);

	}

}
