/*
5. Accept number from user and display below pattern. 
Input :  8 
Output : 2 4 6 8 10 12 14 16 
*/


import java.lang.*;
import java.util.*;

class Program5
{
	public static void main(String[] args) 
	{
		int i =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();

		if(iNo < 0)
		{
			iNo = -iNo;  
		}

		for(i = 1 ; i <= iNo ; i++)
		{
			System.out.print(" " + (i*2));
		}
	}
}


