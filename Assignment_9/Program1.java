/*
1.Write a program which accept number from user and print that number of $ & * on screen.  
Input :  5 Output :  $ * $ * $ * $ * $ * 
Input :  3 Output :  $ * $ * $ * 
Input :  -3 Output :  $ * $ * $ *
*/

import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String args[])
	{
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();

		if(iNo < 0)
		{
			iNo = -iNo;
		}
	
		for(i = 1 ; i<= iNo ; i++)
		{
			System.out.print("$  * ");
		}
	}
}












