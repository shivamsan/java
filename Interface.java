package com.code;

interface my_interface
{
	//dec
	void my_method(int val);
}

class ASD implements my_interface
{
	public void my_method(int i) 
	{
		System.out.println("The value in the class A: "+i);
	}
	
	public void another_method() 
	{
		System.out.println("Another method in the class A: ");
	}
}

public class Interface {

	public static void main(String[] args) {
		//my_interface obj = new ASD();
		ASD obj = new ASD();
		ASD obj1 = new ASD();
		obj.my_method(100);
		obj1.another_method();

	}

}
