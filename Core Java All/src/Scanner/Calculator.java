package Scanner;
import java.util.Scanner;

public class Calculator
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a value:");
		int a=scan.nextInt();

		System.out.println("Enter b value:");
		int b=scan.nextInt();
		System.out.println("-----------");

		System.out.println("Addition result is:"+(a+b));
		System.out.println("Substration result is:"+(a-b));
		scan.close();
	}
}