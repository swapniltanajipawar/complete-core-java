package ExceptionHandling;

public class Mul_Exce_Catch 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		try
		{
			Thread.sleep(1000);
		}
		catch(ArithmeticException | InterruptedException | NullPointerException ae)//Only Execute during runtime
		{
			System.out.println("Exception Handled");
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception Handler");
		}
		System.out.println("Main method Handled");
	}
}
/*
OUTPUT:
Main method started
Main method Handled
*/
