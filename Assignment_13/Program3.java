/*
3. Accept number from user and display below pattern. 
Input :  5  
Output : 1 * 2 * 3 * 4 * 5 * 
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


		for(i = 1 ; i<=iNo ; i++)	
		{
			System.out.print(i +" * ");
		}
	}
}