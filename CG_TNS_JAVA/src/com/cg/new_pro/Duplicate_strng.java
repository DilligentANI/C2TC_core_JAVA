package com.cg.new_pro;
import java.util.*;
public class Duplicate_strng {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s;
		int i;
		System.out.print("ENTER a string ");
		s=sc.next();
		s=s.toLowerCase();
		char a[] = s.toCharArray();
		int x=s.length();
		for(i=0;i<x;i++)
		{
			int count = 1;
			for(int j=i+1;j<x;j++)
			{
			if (a[i]==a[j] && a[i]!= 32)
				count=count+1;
				a[j]='0';
			}	
		if (count>1 && a[i]!= '0')
			System.out.print(a[i]);
		}
	}
	
}

