package com.code;

public class FirstJavaClass {

	public static void main(String[] args) 
	{
		System.out.println("hello");
		
		//primitive data types
		
		//String name = "Shivam";
		//int age = 21;
		String neighbour = "akkuj";
		String friend = neighbour;
		System.out.println(friend);
		
		byte age = 30;
		int phone =1234567890;  //reached max int capacity so we store no greater than this long
		long phone2 = 12345678900000000L;  // adding L indicates that its long not int
		float pi = 3.14F; //we add F to indicate that the given no is a float num and not an integer, coz java take it as int
		char letter = 'a';
		boolean isAdult = true;

		System.out.println(age);
		System.out.println(phone);
		System.out.println(phone2);
		System.out.println(pi);
		System.out.println(letter);
		System.out.println(isAdult);

		
		//non-primitive data types
		String name = "shivam";
		//has diffrent fun of itself
		System.out.println(name.length());
		//size of primitive data type is fixed
		//size pf non primitive data types are not fixed
		//of variable size
		
		//whenever we want to create a non-primitive type or refrence type we create it through the use of new keyword
		String name2 = new String("Saji");
		//in string refrence type the use of new keyword is not compulsory
		System.out.println(name2);
	}

}
