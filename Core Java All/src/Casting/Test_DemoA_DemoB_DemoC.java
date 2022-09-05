package Casting;
class DemoA
{
	int a=10;
	int b=5;
	@SuppressWarnings("unused")
	private void add()
	{

	}
	void sub()
	{

	}
}
class DemoB extends DemoA 
{
	void mul()
	{

	}
}
class DemoC extends DemoB 
{
	@Override
	void sub()
	{
		System.out.println("sub. result is:"+(a-b));
	}
	@Override
	void mul()
	{
		System.out.println("mul. result is:"+(a*b));
	}
}
public class Test_DemoA_DemoB_DemoC
{
	public static void main(String [] args)
	{
		DemoC c1=new DemoC();
		c1.sub();
		c1.mul();	
	}
}

