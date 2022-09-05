//Given String--Welcome to Edureka

//OUTPUT Wwant--emoclew ot akerudE
package String_Pro;

public class Demo6_Reverse_String
{
	public static void main(String[] args) 
	{
		String Str="Welcome to Edureka";
		String[] strArray=Str.split(" ");
		for(String temp:strArray)
		{
			System.out.print(temp);
			System.out.print(" ");
		}
		System.out.println();
		for(int i=0; i<3; i++)
		{
			char[] s1=strArray[i].toCharArray();
			for(int j=s1.length-1;j>=0; j--)
			{
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}

	}
}
