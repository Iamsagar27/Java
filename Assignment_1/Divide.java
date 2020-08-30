import java.lang.*;
import java.util.Scanner;

class Divide
{
	public static void main(String[] args) 
	{
		int no1=0,no2=0;
		int ret=0;

		System.out.println("Enter 2 numbers: ");

		Scanner sc = new Scanner(System.in);
		no1 = sc.nextInt();
		no2 = sc.nextInt();

		ret = no1 / no2 ;

		System.out.println("Division is "+ret);

	}
}