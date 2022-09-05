
package String_Pro;
public class Demo1 
{
	public static void main(String [] args)
	{
		//without instantiation
		String s1="Hello";
		String s2="Hello";

		//with instantiation 
		String s3=new String("Hello");
		String s4=new String("Hello");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-------------------------------------");

		// to compare  object address
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println("-------------------------------------");

		// to compare object content 

		System.out.println(s1.equals(s2));
		//System.out.println(Hello.equals(Hello));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
	}
}
