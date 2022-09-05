package Private_classMember;

class Demo1 
{
	private Demo1()
	{
		System.out.println("running private constructor");
	}
	Demo1(int a)
	{
		this();
		System.out.println("running Demo1 constructor");
	}
}
class Demo2 extends Demo1
{
	Demo2(int a)
	{
		super(a);
	}

}
public class Test_Demo1_Demo2
{
	public static void main(String [] args)
	{
		Demo1 d1=new Demo1(10);
		System.out.println("------------------------------");
		Demo2 d2=new Demo2(22);
	}
}
