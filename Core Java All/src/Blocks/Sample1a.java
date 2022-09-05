package Blocks;

public class Sample1a
{
	static 
	{
		System.out.println("running 2nd static block");
	}
	static
	{
		System.out.println("running 1st static block");
	}
	public static void main(String [] args)
	{
		System.out.println("main method started");
		Sample1a s1=new Sample1a();
	}
	static 
	{
		System.out.println("running  static block");
	}
}
