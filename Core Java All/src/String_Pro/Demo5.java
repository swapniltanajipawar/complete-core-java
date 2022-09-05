
package String_Pro;

public class Demo5
{
	public static void main(String [] args)
	{
		String s1="Maharastra";

		for(int index=s1.length()-1; index>=0; index--)
		{
			System.out.print(s1.charAt(index));
		}

		System.out.println();

		for(int index=0; index<=s1.length()-1; index++)
		{
			System.out.print(s1.charAt(index));
		}

	}
}
