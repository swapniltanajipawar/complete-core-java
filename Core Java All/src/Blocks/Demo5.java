package Blocks;

public class Demo5 
{


	int a=50;
	int b=30;

	{   
		System.out.println("running 1st non-Static");

		System.out.println(a);
		System.out.println(b);
	}
	static
	{

	}
	public static void main(String [] args)
	{
		System.out.println("main method started");

		Demo5 d5=new Demo5();



		System.out.println(d5.a);
		System.out.println(d5.b);
		System.out.println("main method ended");
	}
}
