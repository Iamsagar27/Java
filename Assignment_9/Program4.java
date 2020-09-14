/*
4. Write a program which accepts N from user and print all odd numbers up to N. 
Input :  18  
Output :  1  3  5  7  9  11  13 15 17
*/

import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String[] args) 
	{
		int i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();

		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		for(i = 1 ; i <= iNo ;i++)
		{
			if((i % 2) != 0)
			{
				System.out.print(" " + i);
			}
		}
		
	}
}

