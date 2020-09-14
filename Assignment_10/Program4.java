/*
4. Write a program which accept temperature in Fahrenheit and convert it into celsius. 
(1 celsius = (Fahrenheit -32) * (5/9)) 

Input :  10 			Output :  -12.2222 (10 - 32) * (5/9) 
Input :  34 			Output :  1.11111 (34 - 32) * (5/9)
*/

import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String[] args) 
	{
		float fDegree ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit :\t");
		float fNo = sc.nextFloat();

		if(fNo < 0)
		{
			fNo = -fNo;
		}

		fDegree = (fNo - 32) * 5/9;
		
		System.out.println("The temperature in celsius :\t"+ fDegree);
		
	}
}

