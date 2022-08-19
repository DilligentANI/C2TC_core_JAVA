package com.cg.new_pro;
import java.util.*;
public class Pallindrome_no {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	boolean pall;
	Pallindrome_no obj = new Pallindrome_no();
	System.out.print("Enter a number");
	n = sc.nextInt();
	pall = obj.isPallindrome(n);
	if (pall == true)
		System.out.println(n+" is a Pallindrome number");
	else 
		System.out.println(n+" is not a Pallindrome number");
}
public boolean isPallindrome(int n)
{
	int x,rev=0;
	int a = n;
	while(n>0)
	{
		x=n%10;
		rev = (rev*10)+x;
		n=n/10;
	}
	if (rev == a)
		return true;
	else 
		return false;
}
}
