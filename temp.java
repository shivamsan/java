package com.code;
import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);

String str = input.nextLine();
System.out.println(str);
System.out.println(str.length());
String str1 =("India");
if(str.equals(str1)) {
	System.out.println("string are equal");
}
else
{
	System.out.println("string not are equal");
}

System.out.println(str.concat(str1));

System.out.println(str.charAt(4));
	}

}
