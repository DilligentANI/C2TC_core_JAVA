package com.cg.new_pro;
import java.util.*;
public class Factorial {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		long factorial=1;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.print("The factorial of "+n+" is "+factorial);
		
	}

}
