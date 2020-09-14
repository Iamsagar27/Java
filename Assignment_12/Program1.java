/*
1.Write a program which accept number from user and display below pattern. 
Input :  5  		Output :  * * * * * # # # # #   
Input :  6 			Output :  * * * * * * # # # # # # #   
Input :  -5  		Output :  * * * * * # # # # #   
Input :  2 			Output :  * * # # 
*/

import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String[] args) 
	{
		int i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();

		for(i = 1 ; i<=iNo ; i++)	
		{
			System.out.print("* ");
		}
		for(i = 1 ; i<=iNo ; i++)	
		{
			System.out.print("# ");
		}
	}
}




