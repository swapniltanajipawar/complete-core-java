package New_array1;
import java.util.Arrays;
public class Data 
{
	public static void main(String [] args )
	{   // Variable
		int number=22;
		System.out.println(number);
		System.out.println("-----------------------");

		//Array
		int numbers[]= {10,6,2,22,8,3};
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println("------------------------------------");

		//loop used to retrieve elements/values
		for(int index=0; index<=5; index++)
		{
			System.out.println(index+": "+numbers[index]);
		}
		System.out.println("------------------------------------");

		Arrays.sort(numbers);
		System.out.println("After Sorting:");
		for(int index=0; index<=5; index++)
		{
			System.out.println(index+": " +numbers[index]);
		}
	}
}

