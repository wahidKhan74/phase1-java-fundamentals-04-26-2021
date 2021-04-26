package com.simplilearn.typecasting;

public class TypeCastDemo2 {

	public static void main(String[] args) {
		/**
		 * Explicit type cast or Narrowing : Convert data from higher range to lower range.
		 * double -> float -> long -> int  -> short -> byte.
		 */
		double price  = 120.754;
		
		long bigPrice = (long) price;  // explicit convertion -> double -> long
		
		int intPrice = (int) bigPrice;  // long -> int
		
		short shorPrice = (short) price;  // double -> short
			
		byte bytePrice = (byte) bigPrice;  // long -> byte.
		
		System.out.println("Double value :: " + price);
		System.out.println("Long value :: " + bigPrice);
		System.out.println("Integer value :: " + intPrice);
		System.out.println("Short value :: " + shorPrice);
		System.out.println("Byte value :: " + bytePrice);

	}

}
