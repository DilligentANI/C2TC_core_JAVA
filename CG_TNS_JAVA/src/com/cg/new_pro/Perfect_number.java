package com.cg.new_pro;
import java.util.*;
public class Perfect_number {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,sum=0;
		System.out.print("Enter a number: ");		//to check the perfect number  i.e. the sum of the divisors is equal to the number
		n=in.nextInt();
		int x=n/2;
		for(int i=1;i<=x;i++)
		{
			int y=n%i;
			if (y==0)
					{
						sum = sum+i;
					}
		}
		if (sum==n)
			System.out.println(n+" is perfect number: ");
		else 
			System.out.println(n+" is not perfect");
	}
}
