//2. Program to demonstrate abstract class and concrete class using argument abstract class Constructor.
package Abstract;
abstract class Demo1
{
	abstract void test();
	Demo1(int student)
	{
		System.out.println("Total number of student in class present today:"+student);
	}
}
class Demo2 extends Demo1
{
	void test()
	{
		System.out.println("Test on java Section-2 ");
	}
	Demo2()
	{
		super(20);
	}
}
public class Demo3
{
	public static void main(String[] args) 
	{
		Demo2 d2=new Demo2();
		d2.test();
		
		
	}
}
