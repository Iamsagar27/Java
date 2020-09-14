/*
4.Write a program which accept range from user and return addition of all even numbers in between that range. 
(Range should contains positive numbers only) 

Input :  23 30  	Output :  108    
Input :  10 18 		Output :  70 
Input :  -10 2 		Output :  Invalid range 
Input :  90 18 		Output :  Invalid range 
*/

import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String[] args) 
	{
		int i = 0 , iAddition = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start :\t");
		int iStart = sc.nextInt();
		System.out.println("Enter the End :\t");
		int iEnd = sc.nextInt();
		
		if((iEnd < iStart) || (iStart < 0) || (iEnd < 0))
		{
			System.out.println("Invalid range");
			return;
		}

		for (i = iStart ; i<= iEnd ; i++) 
		{
			if((i % 2) == 0)
			{
				iAddition = iAddition + i ;
			}	
		}

		System.out.println("Addition :\t" + iAddition);

	}
}

