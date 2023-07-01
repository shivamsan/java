package com.code;
class QQ
{
	public String toString()
	{
		return "A";
	}
}

class WW extends QQ
{
	public String toString()
	{
		return "B";
	}
}

class EE
{
	public String toString()
	{
		return "C";
	}
}
public class PolyMorph {

	public static void main(String[] args) {
		
		QQ obj1 = new QQ();
		WW obj2 = new WW();
		EE obj3 = new EE();
		fun(obj1);
		fun(obj2);
		fun(obj3);

	}
	public static void fun(Object x)
	{
		System.out.println(x.toString());
	}

}
