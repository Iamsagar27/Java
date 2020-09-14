/*
4. Write a program to find odd factorial of given number.  
Input :  5  	Output :  15   (5 * 3 * 1) 
Input :  -5  	Output :  15   (5 * 3 * 1) 
Input :  10  	Output :  945  (9 * 7 * 5 * 3 * 1) 
*/

import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String[] args) 
	{
		int iFactorial = 1 , i =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();

		if(iNo < 0)
		{
			iNo = -iNo;  
		}

		for(i = 1 ; i <= iNo ; i++)
		{
			if((i % 2) != 0 )
			{
				iFactorial = iFactorial * i ;
			}
		}

		System.out.println("The factorial of number : " +iFactorial);
		
	}
}

