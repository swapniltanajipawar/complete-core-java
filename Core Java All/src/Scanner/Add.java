package Scanner;
/*2. Write a Java program to accept two numbers from end user and generate random
   numbers from it and pass the numbers to business logic class and perform
   addition (argument method) and subtraction (argument and return type method) operation.
 */
import java.util.*;
class Arithmatic
{
	void add(int num1 , int num2)
	{
		System.out.println("Addition result is:"+(num1+num2));
	}
	int sub(int num1, int num2)
	{
		return(num1-num2);
	}
}


public class Add
{
	public static void main(String [] args)
	{   Scanner scan=new Scanner(System.in);
	Random r1=new Random();
	int rNum1=r1.nextInt();
	System.out.println("Random number is:"+rNum1);
	int rNum2=r1.nextInt();
	System.out.println("Random number is:"+rNum2);
	System.out.println("Enter value of a:");
	int a=scan.nextInt();
	System.out.println("Enter value of b:");
	int b=scan.nextInt();
	Arithmatic a1=new Arithmatic();
	a1.add(rNum1,rNum2);
	a1.add(a,b);
	int sub=a1.sub(rNum1,rNum2);
	int sub1=a1.sub(a,b);
	System.out.println("Substraction result is:"+sub);
	System.out.println("Substraction result is:"+sub1);
	scan.close();

	}
}
