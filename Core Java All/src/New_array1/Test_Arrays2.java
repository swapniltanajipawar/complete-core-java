package New_array1;

import java.util.Arrays;
import java.util.Scanner;

public class Test_Arrays2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int number[]=new int[6];
		System.out.println("Enter the 6 values");
		for(int i=0; i<=5; i++)
		{
			number[i]=scan.nextInt();
		}
		System.out.println("After Assigning values in array:");
		for(int i=0; i<=5; i++)
		{
			System.out.println(i+": "+number[i]);
		}
		System.out.println("-----------------------------------");
		Arrays.sort(number);
		System.out.println("After Sorting:");
		for(int i=0; i<=5; i++)
		{
			System.out.println(i+": "+number[i]);
		}
		System.out.println("------------------------------------");
	}
}
