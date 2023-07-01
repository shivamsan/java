package com.code;

public class Loop {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
			//the declaration inside for loop is only till for loop can't be used outside
			
		{
			System.out.println(i);
		}
		
		for(int i=100;i>=1;i--)
		{
			System.out.println(i);
		}
		int i =100;
		while(i>=1)
		{
			System.out.println(i);
			i--;
			
		}
		
		int k = 100;
		do
		{
			System.out.println(k);
			k--;
			
		}while(k>=1);
		
		
	}

}
