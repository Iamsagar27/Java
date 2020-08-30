/*
2.Write a program which accept number from user and display its factors in decreasing order. 
Input :  12 Output : 6 4 3 2 1 
Input : 13 Output : 1  
Input :  10  Output : 5 2 1
*/


import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String args[])
	{
		int i = 0,factor = 1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number  :");
		int no = sc.nextInt();
		
		for(i = no-1; i >= 1 ; i--)
		{
			if((no % i) == 0)
			{
				System.out.print(" " +i);		
			}
		}
	}
}






























