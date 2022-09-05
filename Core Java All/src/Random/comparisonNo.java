/*2. Write a Java program to generate 2 random numbers and identify which number is larger*/
package Random;
import java.util.Random;
public class comparisonNo
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

	}
}