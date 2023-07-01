package com.code;

class Complex
{
	private double real, img;
	
	public Complex(double r, double i)
	{
		this.real = r;
		this.img = i;
		
	}
	
	Complex(Complex c)//copy cons
	{
		System.out.println("invoking copy constructor");
		real =c.real;
		img=c.img;
	}
	
	
	public void display()
	{
		System.out.println(real+ "+" + img+"i");
	}
	
}
public class CopyConstructor {

	public static void main(String[] args) {
		Complex obj1 = new Complex(10,20);
		Complex obj2 = new Complex(obj1); //invoking copy const
		Complex obj3 = obj2;
		obj3.display();
	}

}
