package com.cg.new_pro;
import java.util.*;
public class ReversalNumb 
{
	public static void main(String[] args)
	{
		int n,x,rev=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number for the reversal: ");
		n=in.nextInt();
		while(n!=0)
		{
			x=n%10;
			rev = (rev*10)+x;
			n=n/10;
		}
		System.out.println("the reversal of the number is: " +rev);
	}
}
