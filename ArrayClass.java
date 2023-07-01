package com.code;

import java.util.Arrays; //importing/including package Arrays


public class ArrayClass {

	public static void main(String[] args) {
		int[] marks = new int[5];
		// data type + sqr bracket(to indicate it's a list or array) = new keyword dataype[value/size]
		marks[0] =89;
		marks[2] =44;
		marks[3] = 77;
		marks[4] =444;
		// cannot take marks[5]=4567;
		
		System.out.println(marks);
		//will not print the array elements by printing the variable name
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		// we didn't inserted/ assign any value in 1th position but 
		//in java instead of storing or pointing to any garbage value it will indicate a null value (0)
		//this is because java has special garbage collector function
		
		//length
		System.out.println(marks.length);
		//its not a function of array its a property
		//we don't include parenthesis with property
		
		//sort
		Arrays.sort(marks);
		//Arrays is a class in which there is a fun sort
		// this class is included under java.util.Arrays package
		//so we include it in the beginning
		System.out.println("after sorting");
		System.out.println(marks[0]);
		
		
		int[] marks2 = {87,23,7,88};
		System.out.println(marks2[0]);
		Arrays.sort(marks2);
		System.out.println("after sorting marks2 ");
		System.out.println(marks2[0]);
		
		
		//2D array
		int[][] finalmarks = {{23,56,78},{13,46,70}};
		System.out.println(finalmarks[1][1]);
		
	
		
		
		
	}

}
