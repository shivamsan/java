package com.code;

public class Operators_Art_Logical {

	public static void main(String[] args) {
		int a =1;
		int b = 2;
		int sum = a+b;
		System.out.println(sum);
		int diff = a-b;
		System.out.println(diff);
		
		int div =a/b;
		System.out.println(div);
		//in int the num after the decimal point is trinkate/ removed/dropped
		
		double c=5;
		double d=3;
		double divi =c/d;
		System.out.println(divi);
		double modulo =c%d;
		System.out.println(modulo);
		
		//unary operator
		
		int num =1;
		//num = num +1;
		//num++;
		System.out.println(num++);
		//first print then increamented
		//++num;
		System.out.println(++num);
		//first increamented then print
		
		System.out.println(num--);
		System.out.println(--num);
	}

}
