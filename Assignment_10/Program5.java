/*
5. Write a program which accept area in square feet and convert it into square meter. 
(1 square feet = 0.0929 Square meter) 

Input :  5 			Output :  0.464515 
Input :  7 			Output :  0.650321 
*/


import java.lang.*;
import java.util.*;

class Program5
{
	public static void main(String[] args) 
	{
		double dArea ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area in square feet :\t");
		double dNo = sc.nextDouble();

		if(dNo < 0)
		{
			dNo = -dNo;
		}

		dArea = dNo * 0.0929 ;

		System.out.println("The area in square meter :\t"+ dArea);		

	}
}


