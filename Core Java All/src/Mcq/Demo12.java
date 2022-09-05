package Mcq;

public class Demo12
{
	public static void main(String args[])
	{
		int intArray[] = {1,2,3};
		int cloneArray[] =intArray.clone();
		for (int i = 0; i < cloneArray.length; i++)
		{
			System.out.print(cloneArray[i]+" ");
		}
	}
}