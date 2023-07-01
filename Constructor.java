package com.code;
class Test1{
	int a;
	Test1()
	{
		a= 0;
		System.out.println("inside default const");
		System.out.println(a);
	}
	
	Test1(int x)
	{
		a=x;
		System.out.println("inside para const");
		System.out.println(a);
	}
}
public class Constructor {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		Test1 obj2 = new Test1(5);

	}

}
