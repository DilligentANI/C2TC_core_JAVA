package com.cg.new_pro;
import java.util.*;
public class String_reversal
{
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			String s;
			System.out.print("Enter the word: ");
			s=sc.next();
			s = s.toLowerCase();
			int x = s.length();
			String reverse = "";
			boolean k = Character.isUpperCase(s.charAt(0));
			for(int i=x-1; i >=0;i--)
			{
				reverse = reverse + s.charAt(i);
			}
			if (k == true) 
			{
				String output = reverse.substring(0,1).toUpperCase() + reverse.substring(1);
				System.out.println("The reverse of the String: "+output);
			}
			else
				{
				System.out.println("The reverse of the String: "+reverse);
				}
		}
	}
}