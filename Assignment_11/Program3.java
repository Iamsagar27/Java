/*
3. Write a program which accept range from user and return addition of all numbers in between that range. 
(Range should contains positive numbers only) 

Input :  23 30  	Output :  212    
Input :  10 18 		Output :  126 
Input :  -10 2 		Output :  Invalid range 
Input :  90 18 		Output :  Invalid range 
*/

import java.lang.*;
import java.util.*;

class Program3
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
			iAddition = iAddition + i ;	
		}

		System.out.println("Addition :\t" + iAddition);		

	}
}