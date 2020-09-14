/*
5. Write a program which accept N and print first 5 multiples of N.  
Input :  4  
Output :  4  8  12  16  20 
*/


import java.lang.*;
import java.util.*;

class Program5
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

		for(i = 1 ; i<=5 ; i++)
		{
			System.out.print(" " + (i*iNo));
		}

				
	}
}


