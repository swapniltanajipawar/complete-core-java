//Compile time Exception
package ExceptionHandling;

public class Sample1 
{
	public static void main(String[] args)
	{
		System.out.println("Main method Started");
		try
		{
			Thread.sleep(1000);//Event gets get generated during compile time
		}
		catch(InterruptedException ie)//catch block gets execute only during Runtime Exception
		{
			System.out.println("Interrupted Exception handled");
		}
		System.out.println("Main method ended");
	}
}
