package Mcq;

class Sample1
{
	protected void name()
	{
		System.out.println("protected...");
	}
}
class Sample2 extends Sample1
{
	public void name()
	{
		System.out.println("public...");
	}
}
public class ASDemo4
{
	public static void main(String args[])
	{
		Sample2 obj = new Sample2();
		obj.name();
	}
}

