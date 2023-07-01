package com.code;
class X
{
	X()
	{
		System.out.println("inside constructoe X");
	}
}

class Y extends X
{
	Y()
	{
		System.out.println("inside constructoe Y");
	}
}


class Z extends Y
{
	Z()
	{
		System.out.println("inside constructoe Z");
	}
}
public class ConstSeq {

	public static void main(String[] args) {
		
		Z obj = new Z();
		

	}

}
