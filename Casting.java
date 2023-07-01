package com.code;

public class Casting {

	public static void main(String[] args) {
		double price = 100.00;
		double finalPrice = price +10;
		//double = double + int
		//implicite casting
		// small in large
		
		System.out.println(finalPrice);
		int p =100;
		//int fp = p + 19.0;
		//explicite casting
		//int = int +double
		
		//we do this
		int fp = p + (int)18.0;
		int fp2 = p + (int)18.99;
		//wont round off, it'll just cut the num after decimal
		System.out.println(fp);
		System.out.println(fp2);
		
	
	}

}
