/*
4. Accept o4e character from user and convert case of that character.  
Input : a   Output : A  
Input : D   Output : d 
*/


import java.lang.*;
import java.util.*;
		
class Program4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		char ch=sc.next().charAt(0);
		int temp = 0;
		if(ch >= 'a' && ch <= 'z')
		{
			//System.out.println(" "+ (ch - 32));
			temp = (int) ch;
			temp = temp - 32;
			ch = (char)temp;
			System.out.println(ch);
		}
		else if(ch >= 'A' && ch <= 'Z')
		{
			//System.out.println(" "+(ch + 32));
			temp = (int) ch;
			temp = temp + 32;
			ch = (char)temp;
			System.out.println(ch);
		}
	}
}