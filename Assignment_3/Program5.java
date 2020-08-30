/*
5. Accept on character from user and check whether that character is vowel  (a,e,i,o,u) or not.  
Input : E   Output : TRUE  
Input : d   Output : FALSE 
*/

import java.util.Scanner;

public class Program5
{
	public static void main(String args[])
	{
		System.out.println("Enter the character :");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
			ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  )
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Not Vowel");	
			}	
	}
}