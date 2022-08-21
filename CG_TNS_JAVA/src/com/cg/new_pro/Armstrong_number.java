package com.cg.new_pro;
import java.util.*;
public class Armstrong_number 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,n,sum=0;
		System.out.print("Enter a number");
		a=sc.nextInt();
		n = a;
		
		while(a>0)
		{
			int x=a%10;
			int cube= (int) Math.pow(x, countDigit(n));
			sum =sum+cube;
			a=a/10;
		}
		if (sum == n)
			System.out.println("Is an ARMSTRONG number");
		else
			System.out.println("Is not an ARMSTRONG number");
	}
	 static int countDigit(int n)
	 {
		 int count = 0;
		 while(n!=0)
		 {
			 n=n/10;
			 ++count;
		 }
		 return count;
	 }
}
