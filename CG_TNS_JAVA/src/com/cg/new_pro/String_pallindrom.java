package com.cg.new_pro;
import java.util.*;
public class String_pallindrom {
	public static boolean isPallindrome(String s)
	{
		int x = s.length();
		String reverse = "";
		for(int i=x-1; i >=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
		boolean res;
		if(s.equals(reverse)) {res = true;}
		else res =false;
		
		return res;
	}
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String s;
			boolean res;
			
			System.out.print("Enter the word: ");
			s=sc.next();
			s=s.toLowerCase();
			res = isPallindrome(s);
			if(res==true)
				System.out.println(" CONGRATULATIONS : The word is Pallindrome: ");
			else 
				System.out.println("SORRY: the word is nor pallindrome:");
		}
		}
}
