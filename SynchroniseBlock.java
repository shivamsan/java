package com.code;
class Test11
{
	void display(int num)
	{
		synchronized(this)
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
	
}

class A11 extends Thread
{
	Test11 th1;
	A11(Test11 t)
	{
		th1=t;
	}
	
	public void run()
	{
		th1.display(2);
	}
}

class B11 extends Thread
{
	Test11 th2;
	B11(Test11 t)
	{
		th2=t;
	}
	
	public void run()
	{
		th2.display(100);
	}
}
public class SynchroniseBlock{
	
	public static void main(String[] args)
	{
		Test11 obj =new Test11();
		A11 t1  = new A11(obj);
		B11 t2  = new B11(obj);
		t1.start();
		t2.start();
	}

}
