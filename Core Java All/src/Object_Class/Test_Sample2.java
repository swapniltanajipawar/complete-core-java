//Question on toString Method:

package Object_Class;
class Sample2 extends Object
{
	@Override
	public String toString()
	{
		return "Hello";
	}
}
public class Test_Sample2 
{
	public static void main(String[] args) 
	{
		Sample2 s2=new Sample2();
		System.out.println(s2);
		System.out.println(s2.toString());
	}
}
/*
OUTPUT:

Hello
Hello
 
*/