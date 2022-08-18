package com.cg.new_pro;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a1=0,a2=1,a3,i;
		System.out.println("Enter the range of fibonacci series:");
		int c=sc.nextInt();
		System.out.print(a1+","+a2);
		for(i=2;i<c;i++) {
			a3 = a1+a2;
			System.out.print(","+a3);
			a1=a2;
			a2=a3;
			
		}
	}
}
