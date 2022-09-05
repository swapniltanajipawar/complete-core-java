/*3. Write a Java program to accept value from user and identify 
whether the value is even or odd.*/

package Scanner;
import java.util.Scanner;

public class CompareNo
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter Value of a is:");
		int a=scan.nextInt();

		if(a%2==0)
		{
			System.out.println("It is Even number");
		}
		else
		{
			System.out.println("It is Odd number");
		}
	}
}
