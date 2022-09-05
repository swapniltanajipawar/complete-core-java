/*1. Write a Java program on accepting two values from end 
 user and perform arithmetic operations */


package Scanner;
import java.util.Scanner;
public class Addition 
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter value of a is :");
		int a=scan.nextInt();

		System.out.println("Enter value of b is :");
		int b=scan.nextInt();
		System.out.println("-------------------------------");

		System.out.println("Addition result is:"+(a+b));
		System.out.println("Substraction result is:"+(a-b));
		scan.close();
	}
}
