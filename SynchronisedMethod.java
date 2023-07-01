package com.code;
class Test
{
	synchronized void display(int num)
	{
		System.out.println("table for" +num);
		for(int i=0;i<=10;i++)
		{
			System.out.println(num * i);
		}
		System.out.println("end of table");
		try
		{
			Thread.sleep(1000);
		}catch( Exception e) {}
	}
	
}

class A1 extends Thread
{
	Test th1;
	A1(Test t)
	{
		th1=t;
	}
	
	public void run()
	{
		th1.display(2);
	}
}

class B1 extends Thread
{
	Test th2;
	B1(Test t)
	{
		th2=t;
	}
	
	public void run()
	{
		th2.display(100);
	}
}
public class SynchronisedMethod {
	
	public static void main(String[] args)
	{
		Test obj =new Test();
		A1 t1  = new A1(obj);
		B1 t2  = new B1(obj);
		t1.start();
		t2.start();
	}

}
