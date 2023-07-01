package com.code;
class Q
{
	int a=0;
	void fun(int i)
	{
		this.a=i;
		
	}
}

class W extends Q
{
	int b;
	void fun(int i)
	{
		int c;
		b=20;
		super.fun(i+5);
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		c=a*b;
		System.out.println("value of c: "+c);
	}
}
public class Overriding {

	public static void main(String[] args) {
		W obj = new W();
		obj.fun(10);//fun redefined in derived class

	}

}
