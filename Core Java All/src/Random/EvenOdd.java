/*1. Write a Java program to generate random number and identify whether
  the number is even or odd.*/
package Random;

import java.util.Random;

public class EvenOdd
{
	public static void main(String [] args)
	{
		Random r1=new Random();
		int rNum=r1.nextInt();
		System.out.println("Random number is:"+rNum);


		if(rNum%2==0)
		{
			System.out.println("It is Even number");
		}
		else
		{
			System.out.println("It is Odd number");
		}
	}
}
