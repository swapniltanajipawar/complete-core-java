package Blocks;

public class Sample1 
{
	static int a;
	static int b;

	static 
	{
		System.out.println("running static block");
		a=55;
		b=88;
	}

	public static void main(String [] args)
	{
		System.out.println("Main method running");
		System.out.println(a);
		System.out.println(b);
		System.out.println("main method ended");
	}

}
