/*
3. Write a program which accept number from user and print even factors of that number.  
Input :  36 
Output:  2 6 12 18
*/

import java.lang.*;
import java.util.*;
		
class Program3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();
		
		int iRet = 0;

		for(int i = 1 ; i< no ; i++)
		{
			if((no % i == 0) && (i % 2 == 0 ))
			{
				System.out.print(" "+i);
			}
		}
	}
}