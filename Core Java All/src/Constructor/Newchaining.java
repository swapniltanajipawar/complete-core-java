//8. Write a program to make constructor call explicitly to achieve constructor chaining operation.
package Constructor;

class Chain 
{ 
	int a=40;
	int b=10;
	int c=30;

}
class Sample0 extends Chain
{
	Sample0(int a)
	{
		System.out.println("running Sample1 constructor");
		a=20;

	}
	void add()
	{    
		System.out.println("Addition result is:"+(a+b));	
	}

}
class Sample2 extends Sample0
{
	Sample2()
	{
		super(33);
		System.out.println("running Sample2 constructor");
	}
	void sub()
	{
		System.out.println("Substaction result is:"+(a-c));
	}
}

class Sample3 extends Sample2
{
	Sample3()
	{
		super();
		System.out.println("running Sample2 constructor");
	}
	void mul()
	{
		System.out.println("Substaction result is:"+(a*c));
	}
}
public class Newchaining
{
	public static void main(String [] args)
	{
		Sample3 s3=new Sample3();
		s3.add();
		s3.sub();
		s3.mul();

	}
}

