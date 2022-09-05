package Mcq;
public class ExceptionDemo6
{
	public static void main(String args[])
	{
		try
		{
			int a[]= {1, 2, 3, 4};
			for (int i = 1; i <= 4; i++)
			{
				System.out.println ("a[" + i + "]=" + a[i] + "n");
			}
		}
		catch (Exception e)
		{
			System.out.println ("error = " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)//error
		{
			System.out.println ("ArrayIndexOutOfBoundsException");
		}
	}
}