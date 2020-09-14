/*
1.Write a program which accept range from user and display all numbers in between that range. 
Input :  23 35  	Output :  23 24 25 26 27 28 29 30 31 32 33 34 35   
Input :  10 18 		Output :  10 11 12 13 14 15 16 17 18 
Input :  10 10 		Output :  10  
Input :  -10 2 		Output :  -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 
Input :  90 18 		Output :  Invalid range
*/

import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start :\t");
		int iStart =sc.nextInt();
		System.out.println("Enter the start :\t");
		int iEnd =sc.nextInt();

		if(iEnd < iStart)
		{
			System.out.println("Invalid range");
		}

		for(int i = iStart ; i <= iEnd ; i++)
		{
			System.out.print(" " + i);
		}

	}
}




