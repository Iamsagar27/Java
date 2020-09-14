/*
2. Write a program which accept range from user and display all even numbers in between that range. 

Input :  23 35  		Output :  24 26 28 30 32 34    
Input :  10 18 			Output :  10 12 14 16 18 
Input :  10 10 			Output :  10  
Input :  -10 2 			Output :  -10 -8 -6 -4 -2 0 2 
Input :  90 18 			Output :  Invalid range 
*/

import java.lang.*;
import java.util.*;

class Program2
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

		for(i = iStart ; i <= iEnd ; i++)
		{
			if((i % 2) == 0 )
			{
				System.out.println(" "+ i);		
			}
		}


	}
}

