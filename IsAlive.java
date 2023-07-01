package com.code;

public class IsAlive extends Thread
{
	public void run()
	{
		System.out.println("Begin");
		try {
			Thread.sleep(500);
		}catch(InterruptedException ie) {}
		System.out.println("end");
	}
	public static void main(String[] args) {
		IsAlive t1 = new IsAlive();
		IsAlive t2 = new IsAlive();
		t1.start();
		System.out.println("IS Thread1 Alive ?" + t1.isAlive());
		System.out.println("IS Thread2 Alive ?" + t2.isAlive());
		t2.start();
		System.out.println("Now is Thread2 Alive ?" + t2.isAlive());
	}

}
