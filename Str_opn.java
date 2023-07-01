package com.code;

public class Str_opn {

	public static void main(String[] args) {
		String name1 ="shivam ";
		String name2 = "singh";
		String name3 = name1 +name2;
		System.out.println(name3);
		System.out.println(name1.charAt(0));
		//in java position start from 0
		System.out.println(name1.length());
		String replace = name1.replace('v', 'b');
		System.out.println(replace);
		
		//in java strings are immutable(cannot be changed)
		
		String name4 = "Shivam and Saji";
		System.out.println(name4.substring(0,4));
		//in substring 1st index is include but the second index is not included
		char str[]= {'1','s','r','w'};
		String S = new String(str);
		System.out.println("string "+S+"length "+S.length());
		
		
		
		
		
	}

}
