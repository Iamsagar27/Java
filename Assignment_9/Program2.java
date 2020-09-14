/*
2.Write a program which accept number from user and print numbers till that  number. 
Input :  8  
Output :  1  2  3  4  5  6  7  8 
*/

import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		for(int i = 1 ;i <= iNo ; i++)
		{
			System.out.print(" "+ i );
		}			
	}
}

