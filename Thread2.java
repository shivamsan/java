package com.code;

class MyThread1 extends Thread
{   
    public void run()
    {
    	int k =0;
    	while(k<10)
        System.out.println("Thread 1 is Created");
    	k++;
    }
}


class MyThread2 extends Thread
{   
    public void run()
    {
    	int k=0;
    	while(k<10)
    	{
        System.out.println("Thread 2 is Created");
        k++;
    	}
    }
}

public class Thread2
{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}