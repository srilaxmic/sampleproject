package com.geekbull.maven.Helloworld;

import java.util.Scanner;

public class Firstprogram {

	public static void main(String[] args)
	{
		int c;
		
		System.out.println(" input an integer");
		
		Scanner in=new Scanner(System.in);
		
		c=in.nextInt();
		
		
		if((c/2)*2==c)
		{
			System.out.println("even");
			
		}
		else
			
			System.out.println("odd");
			
	

	}

}
