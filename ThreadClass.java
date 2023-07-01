package com.code;

class MyThread extends Thread
{   
    public void run()
    {
        System.out.println("Thread is Created");
    }
}

public class ThreadClass 
{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}