package com.code;
class MyThreadRunnable implements Runnable
{
	public void run()
    {
        System.out.println("Thread is Created");
    }
}
public class ThreadRunnable_Int {

	public static void main(String[] args) {
		MyThreadRunnable obj = new MyThreadRunnable();
		Thread t = new Thread(obj);
        t.start();
        //cannot directly use start

	}

}
