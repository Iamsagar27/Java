/*

1.Write a program which accept one number from user and print that number of even numbers on screen.  

Input :  7  
Output:  2 4  6  8  10  12  14 

*/

import java.lang.*;
import java.util.*;
		
class Program1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();
		int iRet = 0;

		for(int i = 1 ; i<= no ; i++)
		{
			iRet = iRet + 2 ;
			System.out.println(iRet);
		}
	}
}



