package com.code;

public class BreakConti {

	public static void main(String[] args) {
		int i =0;
		while(true)
		{
			if(i==3)
			{
				i++;
				continue;
				//skip rest block
			}
			System.out.println(i);
			i++;
			if(i>5)
			{
				break;
			}
		}

	}

}
