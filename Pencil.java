package com.code;
import java.util.Scanner;
public class Pencil {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
    
    System.out.println(" pencil=10  and  notebook=40");
    System.out.println("enter how much cash do you have");
    int cash = sc.nextInt();
    if( cash<10)
    {
        System.out.println("cannot buy anything ");
        System.out.println("get more cash");

    }

    else if( cash>10 && cash<50)
    {
        System.out.println("can get 1 thing");

    }

    else{
        System.out.println("can get both");
    }

	}
}
