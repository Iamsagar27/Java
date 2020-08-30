/*
4.Write a program which accept number from user and return summation of all its non factors. 
Input :  12 Output : 50  
Input :  10  Output : 37
*/


import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String args[])
	{
		int i = 0,factor = 1,sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number  :");
		int no = sc.nextInt();
		
		for(i =1; i < no ; i++)
		{
			if((no % i) != 0)
			{
				sum = sum + i;				
			}
		}
		System.out.print("Summation of non factors : " +sum);
	}
}











