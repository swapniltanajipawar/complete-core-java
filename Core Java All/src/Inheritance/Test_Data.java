//3. Write a program on demonstrating hierarchical inheritance.
package Inheritance;

class Data 
{
	int a=10;
	int b=5;
	void details()
	{ System.out.println("a value is:"+a);
	System.out.println("b value is:"+b);	
	}
}
class Addition extends Data
{
	void add()
	{
		System.out.println("Addition result is:"+(a+b));
		a=50;
		b=30;
	}
}
class Substraction extends Data
{
	void sub()
	{
		System.out.println("Substraction result is:"+(a-b));
		a=22;
		b=8;
	}
}
class Multiplication extends Data
{
	void mul()
	{
		System.out.println("multipliction result is:"+(a*b));
		a=20;
		b=5;
	}
}
class Division extends Data
{
	void div()
	{

	}
}
public class Test_Data
{
	public static void main(String [] args)
	{
		Data d=new Data();
		d.details();
		System.out.println("-----------------------------");
		Addition a1=new Addition();
		a1.details();
		a1.add();
		a1.details();
		a1.add();
		System.out.println("-----------------------------");
		Substraction s1=new Substraction();
		s1.details();
		s1.sub();
		s1.details();
		s1.sub();
		System.out.println("-----------------------------");
		Multiplication m1=new Multiplication();
		m1.details();
		m1.mul();
		System.out.println("-----------------------------");
		Division d1=new Division();
		d1.details();

	}
}