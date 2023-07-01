package com.code;
abstract class ABS
{
	abstract void fun1();
	
	void fun2()
	{
		System.out.println("A: in fun2");
	}
}
class BA extends ABS
{

	void fun1()
	{
		System.out.println("B: in fun1");
	}

}
class CA extends ABS
{

	void fun1()
	{
		System.out.println("C: in fun1");
	}

	
}
public class AbstClass {
	

	public static void main(String[] args) {
		BA objb = new BA();
		CA objc = new CA();
		objb.fun1();
		objb.fun2();
		objc.fun1();
		objc.fun2();

	}

}

