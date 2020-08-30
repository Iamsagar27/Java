/*
5.Write a program which accept number from user and return difference between summation of all its factors and non factors. 
Input :  12 Output : -34  (16 - 50)  
Input :  10  Output : -29 (8 - 37)
*/


import java.lang.*;
import java.util.*;

class Program5
{
	public static void main(String args[])
	{
		int i = 0,factor = 1,sum1 = 0 ,sum2=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number  :");
		int no = sc.nextInt();
		
		for(i =1; i < no ; i++)
		{
			if((no % i) != 0)
			{
				sum1 = sum1 + i;				
			}
			else
			{
				sum2 = sum2 + i;
			}
		}
		System.out.print("Difference betn Summation of factors and non factors : " + (sum2 - sum1));
	}
}














