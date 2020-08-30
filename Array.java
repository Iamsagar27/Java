import java.lang.*;

class Array
{
	public static void main(java.lang.String args[])
	{
		int arr[]=new int[5];

		//int *arr = new int [5];       in C++

		System.out.println(arr.length);

		int brr[] = {10,20,30,40,50};

		int iSum = 0;

		for(int i = 0 ; i < brr.length ; i++)
		{
			iSum = iSum + brr[i];
		}

		System.out.println(iSum);

		int iSum1 = 0;

		for(int no :brr)
		{
			iSum1 = iSum1 + no;
		}
		System.out.println(iSum1);
	}
}