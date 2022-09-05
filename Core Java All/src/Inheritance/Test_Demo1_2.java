//5. Write a Java program to demonstrate this keyword operation and super keyword operation.
package Inheritance;
//Super class
class Demo1
{
	static int a=10;
	int b=20;

	void test()
	{
		int a=30;
		int b=40;
		System.out.println(a);//30
		System.out.println(b);//40
		System.out.println(Demo1.a);//10
		System.out.println(this.b);//20
	}
}
//sub class
class Demo2 extends Demo1
{
	static int a=50;
	int b=60;
	void view()
	{
		int a=70;
		int b=80;
		System.out.println(a);//70
		System.out.println(b);//80
		System.out.println(Demo2.a);//50
		System.out.println(super.b);//20
	}
}
public class Test_Demo1_2
{
	public static void main(String [] args)
	{
		Demo2 d2=new Demo2();
		d2.test();//class call+method call
		d2.view();

	}
}