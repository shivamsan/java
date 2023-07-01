package com.code;

public class FunctionClass {
	
	public static void printJava() {
		System.out.println("hello java");
	}
	
	public static void printName(String name) {
		System.out.println(name);
	}
	
	public static void sum(int a, int b) {
		int sum =a +b;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		//creating a fun
		
		printJava();
		printJava();
		printJava();
		
		printName("shivam");
		printName("saji");
		
		sum(1,4);
		
		

	}

}
