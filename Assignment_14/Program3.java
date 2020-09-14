/*
3.Write a program to find even factorial of given number.  
Input :  5  	Output :  8   (4 * 2) 
Input :  -5  	Output :  8   (4 * 2) 
Input :  10  	Output :  3840  (10 * 8 * 6 * 4 * 2) 
*/

import java.lang.*;
import java.util.*;

class Program3
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
			if((i % 2) == 0 )
			{
				iFactorial = iFactorial * i ;
			}
		}

		System.out.println("The factorial of number : " +iFactorial);

	}
}