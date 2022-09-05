//Swap two variables using ^ operator(k=11,g=25)

package Operators;
public class Swapping 
{
	public static void main(String [] args)
	{
		System.out.println("Program Satrted");
		int k=11;
		int g=25;
		System.out.println("------------Before Swapping-----------");
		System.out.println("Value of k:"+k);
		System.out.println("Value of g:"+g);
		k=k^g;
		g=k^g;
		k=k^g;
		System.out.println("------------After Swapping-----------");
		System.out.println("Value of k:"+k);
		System.out.println("Value of g:"+g);
		System.out.println("Program ended");
	}
}
/*
Program Explanation as given below:-

Before Swapping Value of k and g as:

k=11------>01011
g=25------>11001

--------------------------------------------------------------------------------------
After Swapping Value of K and g as

 k=k^g              g=k^g               k=k^g
 01011              10010               10010
 11001              11001               01011
 --------         ----------           ----------
 10010--->K=18      01011---->g=11      11001------->k=25

k=25  and g=11

----------------------------------------------------------------------------------------


 */