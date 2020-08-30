import java.lang.*;
import java.util.Scanner;

class Program2
{
	public static void main(java.lang.String[] args) 
	{
		int i = 0 , cnt = 0;

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();

		while(cnt > 0)
		{
			System.out.print("*\t");
			cnt--;
		}
	}
}