/*
2. Write a program which accept width & height of rectangle from user and calculate its area. 
(Area = Width * Height) 

Input :  5.3  	9.78 
Output :  51.834
*/

import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String[] args) 
	{
		double dArea ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Width :\t");
		double dWidth = sc.nextDouble();
		System.out.println("Enter the Height :\t");
		double dHeight = sc.nextDouble();

		dArea = dWidth * dHeight ;

		System.out.println("Area of rectangle :" +dArea);

	}
}

