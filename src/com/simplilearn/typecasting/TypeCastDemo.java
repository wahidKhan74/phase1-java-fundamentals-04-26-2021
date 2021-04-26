package com.simplilearn.typecasting;

public class TypeCastDemo {

	public static void main(String[] args) {
		
		// Type Casting  : It is a process converting data from one type to another type.
		
		/**
		 * Widening / Implicit Type Cast : Converts data from lower range to higher range.
		 * byte -> short  -> int  -> long(8 byte) -> float( 4 byte) -> double.
		 */
		
		 byte count = 100;   // -128 to 127 -> 1 byte = 8 bit.
		 
		 int  incCount = count ;  // implicit type cast  -> widening -> -32768 to 32767.
		 
		 short shortCount = count ;  // byte  -> short
		 
		 long bigCount = incCount;  // int -> long
		 
		 float floatCount = bigCount;  // long -> float
		 
		 double decimalCount = floatCount;  // float -> double.
		 
		 System.out.println("Byte Count :: "+count);
		 System.out.println("Interger Count :: "+incCount);
		 System.out.println("Short Count :: "+shortCount);
		 System.out.println("Long Count :: "+bigCount);
		 System.out.println("Float Count :: "+floatCount);
		 System.out.println("Double Count :: "+decimalCount);
	}

}
