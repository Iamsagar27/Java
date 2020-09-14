/*
3. Write a program which accept distance in kilometre and convert it into meter. 
(1 kilometre = 1000 Meter) 

Input :  5 			Output :  5000 
Input :  12 		Output :  12000 
*/

import java.lang.*;
import java.util.*;

class Program3
{
	public static void main(String[] args) 
	{
		int iDistance = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in kilometre :\t");
		int iNo = sc.nextInt();

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		iDistance = iNo * 1000 ;

		System.out.println("The distance in metre : " +iDistance);

	}
}