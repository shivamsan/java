package com.code;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		// How to take input
		//we create a scanner class using new keyword
		//we dont have this class int the program so we have to import his from scanner package
		Scanner sc =  new Scanner(System.in);
		
		//just like we use System.out for output 
		//we use System.in for input and we'll pass it int scanner
		//sc is the object of scanner class
        System.out.println("input your age");
        
        //int age = sc.nextInt();
        float age = sc.nextFloat();
        System.out.println(age);

        System.out.println("enter yout name");
        String name =sc.next();
        //next takes only a token that is inly a word
        //not a whole line

        //for a complete line we use nextLine
        System.out.println(name);

        System.out.println("enter a line");
        String line = sc.nextLine();
        System.out.println(line);
    }

}
//runing in vscode
