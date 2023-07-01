package com.code;

public class Constant {

	public static void main(String[] args) {
		int age=30;
		age=31;
		age=32;
		System.out.println(age);
		
		//we use "final" keyword to indicate the variable to be a constant
		float PI = 3.14F;
		PI = 1.1F;
		System.out.println(PI);
		//we define usually final variable in upper case

		final float PIE = 3.14F;
		//PIE = PIE+PI;
		System.out.println(PIE);
	}
	
	

}
