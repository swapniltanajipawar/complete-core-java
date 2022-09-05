//7. Write a program to demonstrate the difference between static and non static block and constructor.
package Blocks;

public class Demo4 
{
	static int a;
	static int b;


	static
	{
		System.out.println("running 1st static");
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);

	}
	{
		System.out.println("running 1st non-Static");
		a=30;
		b=40;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String [] args)
	{
		System.out.println("main method started");
		System.out.println(a);
		System.out.println(b);
		Demo4 d4=new Demo4();
		System.out.println(d4.a);
		System.out.println(d4.b);
		System.out.println(a);
		System.out.println(b);
		System.out.println("main method ended");
	}
}
