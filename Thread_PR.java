package com.code;
class AA extends Thread
{
	public void run()
	{
		System.out.println("thread 1");
		for(int i=0;i<=5;i++)
		{
			System.out.println("A" + i);
		}
		System.out.println("end of thread 1");
	}
}

class BB extends Thread
{
	public void run()
	{
		System.out.println("thread 2");
		for(int i=0;i<=5;i++)
		{
			System.out.println("B" + i);
		}
		System.out.println("end of thread 2");
	}
}
public class Thread_PR {

	public static void main(String[] args) {
		AA obj1 = new AA();
		BB obj2 = new BB();
		obj1.setPriority(1);
		obj2.setPriority(10);//highest
		System.out.println("starting thread 1");
		obj1.start();
		
		System.out.println("starting thread 2");
		obj2.start();

	}

}
