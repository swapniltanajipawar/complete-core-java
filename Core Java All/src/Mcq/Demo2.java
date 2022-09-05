package Mcq;

class Demo1
{
	private double a, b;
	Demo1(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString()
	{
		return String.format(a+" + i "+b);
	}
}
public class Demo2
{
	public static void main(String args[])
	{
		Demo1 d1 = new Demo1(2.2, 4.2);
		System.out.println(d1);
	}
}
/*
  OUTPUT:
  2.2 + i 4.2 
*/