package com.code;

public class JoinDemo extends Thread
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
		JoinDemo t1 = new JoinDemo();
		JoinDemo t2 = new JoinDemo();
		System.out.println("Starting first thread1");
		t1.start();
		try {
			t1.join();//waiting for t1 to finish
		}catch(InterruptedException e) {}
		System.out.println("staring another thread2");
		t2.start();
		
	}

}
