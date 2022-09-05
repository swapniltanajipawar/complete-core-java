//QUESTION: equal(arg)

package Object_Class;
class A
{

}
public class Test_A 
{
	public static void main(String[] args)
	{
		String s1="Hello";
		String s2=new String("Hello");
		System.out.println(s1==s2);//EQUATE THE OBJECT ADDRESS
		System.out.println(s1.equals(s2));//EQUATE THE OBJECT CONTENT
	}
}
/*
OUTPUT:

false
true

*/