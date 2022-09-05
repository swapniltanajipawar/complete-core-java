package ExceptionHandling;
import java.util.Scanner;

public class Demo2 
{
	public static void main(String[] args)
	{
		System.out.println("Main method started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=scan.nextInt();
		System.out.println("Enter b value:");
		int b=scan.nextInt();

		int c=0;
		try
		{
			System.out.println("try block started");
			c=a/b;
			System.out.println("try block ended");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception handled");
		}
		finally
		{
			System.out.println("finaly block running");
			scan.close();
		}
		System.out.println("Division result is:"+c);

	}
}
/*
OUTPUT:
without Exception
Main method started
Enter a value:
10
Enter b value:
2
try block started
try block ended
finaly block running
Division result is:5

with exception
Main method started
Enter a value:
10
Enter b value:
0
try block started
Arithmetic Exception handled
finaly block running
Division result is:0

*/