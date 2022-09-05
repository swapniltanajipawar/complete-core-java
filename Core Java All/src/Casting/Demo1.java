//1. Write a Java program on Widening and Narrowing.
package Casting;

public class Demo1 
{
	public static void main(String [] args)
	{  //A.Widening
		System.out.println("Widening");
		int a=33;
		System.out.println(a);
		double b=a;
		System.out.println(b);
		char i='A';
		System.out.println(i);
		int j=i;
		System.out.println(j);

		int m=48;
		System.out.println(m);
		float n=m;
		System.out.println(n);
		float x=21.5f;
		System.out.println(x);
		// int y=x; error
		System.out.println("---------------------");
		//B.Narrowing
		System.out.println("Narrowing");
		double l=66.8;
		System.out.println(l);
		int w=(int)l;
		System.out.println(w);
		int e=68;
		System.out.println(e);
		char q=(char)e;
		System.out.println(q);
		float r=21.5f;
		System.out.println(r);
		int y=(int)r;
		System.out.println(y);
	}
}
