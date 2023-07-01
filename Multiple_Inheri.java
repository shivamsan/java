package com.code;

interface AZ
{
	void display1();
}

interface BZ
{
	void display2();
}

public class Multiple_Inheri implements AZ,BZ
{

	public void display1()
	{
		System.out.println("From interface A");
	}
	
	public void display2()
	{
		System.out.println("From interface B");
	}
	
	public static void main(String[] args) {

		
		Multiple_Inheri obj = new Multiple_Inheri();
		obj.display1();
		obj.display2();

	}

}
