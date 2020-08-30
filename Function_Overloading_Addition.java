import java.lang.*;

class Addition
{
	public int Add(int iNo1 , int iNo2)
	{
		return iNo1 + iNo2 ;
	}
	public int Add(int iNo1 , int iNo2 , int iNo3)
	{
		return iNo1 + iNo2 +iNo3;
	}
	public float Add(float fNo1 , float fNo2)
	{
		return fNo1 + fNo1 ;
	}
}

class Function_Overloading_Addition
{
	public static void main(java.lang.String args[])
	{
		Addition obj = new Addition();

		int iRet = 0;

		iRet = obj.Add(10,20);
		System.out.println("Addition of 2 numbers : " + iRet);

		iRet = obj.Add(10,20,30);
		System.out.println("Addition of 3 numbers : " + iRet);

		float fRet = 0.0f;
		float a = 10.5f , b =10.2f;

		fRet = obj.Add(a,b);
		System.out.println("Addition of 2 numbers : " + fRet);
 
	}
}