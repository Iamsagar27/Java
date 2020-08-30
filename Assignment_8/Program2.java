/*
2. Accept single digit number from user and print it into word.  
Input : 9  Output : Nine 
Input : -3 Output : Three  
Input : 12 Output : Invalid Number 
*/

import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int no = sc.nextInt();

		switch(no)
		{
			case 0:
				System.out.println("Zero");
				break;

			case 1:
			case -1:
				System.out.println("One");
				break;
			case 2:
			case -2:
				System.out.println("Two");
				break;

			case 3:
			case -3:
				System.out.println("Three");
				break;

			case 4:
			case -4:
				System.out.println("Four");
				break;

			case 5:
			case -5:
				System.out.println("Five");
				break;

			case 6:
			case -6:	
				System.out.println("Six");
				break;

			case 7:
			case -7:	
				System.out.println("Seven");
				break;

			case 8:
			case -8:
				System.out.println("Eight");
				break;

			case 9:
			case -9:
				System.out.println("Nine");
				break;
			
			default:
				System.out.println("Invalid");
			
		}	
	}
}

