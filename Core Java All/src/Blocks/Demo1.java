package Blocks;

public class Demo1 
{
	int a;//Declaration of data member--->variables
	int b;//Declaration of data member--->variables
	
	{
		System.out.println("running non-static block");   //---->Initialisation of data members
	    a=22;
		b=99;
	}
 void add()
	{
		
	}
	public static void main(String [] args)
	{
		System.out.println("main method started");
		Demo1 d1=new Demo1();
		System.out.println(d1.a);
		System.out.println(d1);
		System.out.println("main method ended");
	}
}
