/*
3. Write a program which accept number from user and print its numbers line. 
Input :  4  
Output :  -4  -3  -2  -1  0  1  2  3  4
*/

import java.lang.*;
import java.util.*;

class Program3
{
	public static void main(String[] args) 
	{
		int i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		for(i=(-iNo) ; i<= iNo ; i++)
		{
			System.out.print(" "+ i);
		}
		
	}
}