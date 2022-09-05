package New_array1;

import java.util.*;
public class Test_Arrays1
{
	public static void main(String[] args) 
	{
		Random r1=new Random();
		int nm[]=new int[6];

		for(int i=0; i<=5; i++)
		{
			nm[i]=r1.nextInt(100);
			System.out.println(i+":"+nm[i]);
		}
		System.out.println("Random number in Array After Sorting:");
		Arrays.sort(nm);
		for(int i=0; i<=5; i++)
		{
			System.out.println(i+":"+nm[i]);
		}
	}
}
/*
 Arrays.sort(array object reference);
 will sort in assending order only
0:41
1:85
2:9
3:51
4:95
5:79
Random number in Array After Sorting:
0:9
1:41
2:51
3:79
4:85
5:95
*/