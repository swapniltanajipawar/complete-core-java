/*3. Write a Java program to generate 2 random numbers and identify which is larger and
  identify whether it is even or odd.*/

package Random;
import java.util.Random;

public class compare1 
{

	public static void main(String [] args)
	{
		Random r1=new Random();
		int rNum1=r1.nextInt();
		int rNum2=r1.nextInt();
		System.out.println("Random number is:"+rNum1);
		System.out.println("Random number is:"+rNum2);

		if(rNum1>rNum2)
		{
			System.out.println("Highest number is:"+rNum1);
		}
		else
		{
			System.out.println("Highest number is:"+rNum2);
		}
		if(rNum1%2==0)
		{
			System.out.println("It is Even number");
		}
		else
		{
			System.out.println("It is Odd number");
		}
		if(rNum2%2==0)
		{
			System.out.println("It is Even number");
		}
		else
		{
			System.out.println("It is Odd number");
		}
	}

}
