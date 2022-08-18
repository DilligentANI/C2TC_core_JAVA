package com.cg.new_pro;
import java.util.*;
public class CheckPrime 
{
	public boolean isPrime(int n)
	{
		int i,a;
		a=n/2;
		if(n==0||n==1) return false;
		for(i=2;i<=a;i++)
				{
					if(n%i==0) 
						return false;
					else
						return true;
				}
		return false;
		}
			
	
	public static void main(String args[])
	{
		int n;
		boolean res;
		CheckPrime ob = new CheckPrime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		res = ob.isPrime(n);
		if(res == true)
			System.out.println(n+" is a prime number");
		else 
			System.out.println(n+" is not a prime number");
	}
}
