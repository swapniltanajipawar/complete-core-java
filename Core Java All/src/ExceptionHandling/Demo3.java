//Runtime Exception Example
package ExceptionHandling;

public class Demo3 
{
	public static void main(String[] args)
	{
		System.out.println("main method started");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();//fully qualified information about Exception12q
			
		}
		System.out.println("Main method ended");
	}
}
