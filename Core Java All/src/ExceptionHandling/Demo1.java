package ExceptionHandling;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		int a=10;
		int b=0;
		int c=0;

		try
		{
			c=a/b;
		}
		catch( ArithmeticException ae)
		{
			System.out.println("Arithmatic Exception handled");
		}
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
		System.out.println("Division Result is:"+c);
		System.out.println("main method ended");
	}
}
/*
OUTPUT:
Main method started
Arithmatic Exception handled
a value is:10
b value is:0
Division Result is:0
main method ended
*/