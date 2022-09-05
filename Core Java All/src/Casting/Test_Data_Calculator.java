//2. Write a Java program to achieve Up Casting.
//UPCASTING EXAMPLE
package Casting;

class Data
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
class Calculator extends Data
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
public class Test_Data_Calculator
{
	public static void main(String [] args)
	{
		//upcasting:super class=sub class
		Data d1=new Calculator();
		d1.add();
		d1.sub();
		//d1.mul();          error
	}
}
/*
OUTPUT:
Add. result is:15
sub. result is:5
*/