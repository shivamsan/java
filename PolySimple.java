package com.code;
class polygon
{
	public void render()
	{
		System.out.println("drawing polygon");
	}
}
class circle extends polygon
{
	public void render()
	{
		System.out.println("drawing cirlce");
	}
}
class square extends circle
{
	public void render()
	{
		System.out.println("drawing square");
	}
}
public class PolySimple {

	public static void main(String[] args) {
		circle c1 = new circle();
	    c1.render();
		square s1 = new square();
	    s1.render();
	}

}
