//3. Write a Java program to achieve Down Casting.
package Casting;
class Data11
{
	int a=10;
	int b=5;
	void add()
	{

	}
	void sub()
	{

	}
}
class Calculator1 extends Data11
{
	@Override
	void add()
	{
		System.out.println("Add. result is:"+(a+b));
	}
	@Override
	void sub()
	{
		System.out.println("sub. result is:"+(a-b));
	}
	void mul()
	{
		System.out.println("mul. result is:"+(a*b));
	}
}
public class Tests_Data_Calculator
{
	public static void main(String [] args)
	{	//upcasting:super class=sub class
		Data11 d1=new Calculator();
		Calculator c1=(Calculator)d1;
		d1.add();
		d1.sub();
		c1.mul();          
	}
}

