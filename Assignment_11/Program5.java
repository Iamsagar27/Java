/*
5.Write a program which accept accept range from user and display all numbers in between that range in reverse order. 

Input :  23 35  	Output :  35 34 33 32 31 30 29 28 27 26 25 24 23   
Input :  10 18 		Output :  18 17 16 15 14 13 12 11 10 
Input :  10 10 		Output :  10  
Input :  -10 2 		Output :  2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 
Input :  90 18 		Output :  Invalid range
*/


import java.lang.*;
import java.util.*;

class Program5
{
	public static void main(String[] args) 
	{
		int i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start :\t");
		int iStart = sc.nextInt();
		System.out.println("Enter the End :\t");
		int iEnd = sc.nextInt();
		
		if(iEnd < iStart)
		{
			System.out.println("Invalid range");
		}

		for (i = iEnd ; i>= iStart ; i--) 
		{		
			System.out.println(" "+ i);			
		}
	}
}


