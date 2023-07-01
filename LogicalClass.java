package com.code;

public class LogicalClass {

	public static void main(String[] args) {
		int a =60;
		int b=40;
		
		if (a< 50 && b <50)//and
			System.out.println("both are less than 50");
		
		if (a< 50 || b <50)//or
			System.out.println("at least one is less than 50");
		
		
		boolean isSunUp = true;
		
		if (isSunUp != true)
			System.out.println("night");
		else
			System.out.println("day");
		
		
	}

}
