//5. Write a Java program to make explicit constructor call operation.
package Constructor;

class Sample1 
{

}
class Sample2 extends Object
{
	Sample2(int a)
	{
		System.out.println("running Sample1 constructor");
	}
}
class Sample3 extends Sample2
{
	Sample3()
	{
		super(55);
		System.out.println("running Sample2 constructor");
	}
}
public class Sample
{
	public static void main(String [] args)
	{
		Sample3 s3=new Sample3();
	}
}