package Scanner;
/*4. Write a Java program to accept two numbers from end 
user and find the highest value.*/

import java.util.Scanner;

public class CompareNumber
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=scan.nextInt();

		System.out.println("Enter b value:");
		int b=scan.nextInt();
		System.out.println("-----------");

		if(a>b)
		{
			System.out.println("Highest number is:"+a);
		}
		else
		{
			System.out.println("Highest number is:"+b);
		}

	}
}
