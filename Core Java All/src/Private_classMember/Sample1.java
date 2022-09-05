//2. Write a program to access non static members of the class where constructor is declared as private (2 ways).
package Private_classMember;
class Sample0
{
	private void test()
	{
		System.out.println("running private method");
	}
	//caller method calling private method
	public void callTest()
	{
		test();
	}
}
class Sample2 extends Sample0
{

}
public class Sample1
{
	public static void main(String [] args)
	{
		Sample0 s0=new Sample0();
		s0.callTest();
		System.out.println("-------------------------------------------------------");
		Sample2 s2=new Sample2();
		s2.callTest();

	}
}
/*Output:

running private method
---------------------------------------------
running private method

 */
