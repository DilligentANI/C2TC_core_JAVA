package com.cg.new_pro;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); //Object creation 
		System.out.println("Enter a number:");	
		int a=sc.nextInt();
		if(a%2==0)
				{
					System.out.println("is even");
				}
		else {
				System.out.println("odd");
			 }
		}
	}
