package com.code;

public class ExceptionHandling {

	public static void main(String[] args) {
		//TRY-CATCH
		
		
		
		
		int[] marks = {98, 97, 95};
		//System.out.println(marks[4])
		//will give error
		try {
		   System.out.println(marks[4]);
		} catch (Exception exception) {
			// do things after catching exeption
		   System.out.println("An exception for caught while accessing an index the 'marks' array");
		}

		System.out.println("We tried to print marks & an exception must have occurred with index >=3");

	}

}
