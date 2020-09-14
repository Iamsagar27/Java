/*
5. Write a program which returns difference between Even factorial and odd factorial of given number.  
Input :  5  	Output :  -7   (8 - 15) 
Input :  -5  	Output :  -7   (8 - 15) 
Input :  10  	Output :  2895  (3840 - 945)
*/


import java.lang.*;
import java.util.*;

class Program5
{
	public static void main(String[] args) 
	{
		int iFactorial = 1 , iEvenFact = 1 ,iOddFact = 1, i =0;
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
				iEvenFact = iEvenFact * i ;
			}
			else
			{
				iOddFact = iOddFact * i;
			}
		}

		iFactorial = iEvenFact - iOddFact ;

		System.out.println("The factorial of number : " +iFactorial);		

	}
}


