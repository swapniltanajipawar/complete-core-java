package Collection_Assignment;
import java.util.ArrayList;

public class ArrayList_T_ArrayObject 
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Mango");
		a.add("Orange");
		a.add("Apple");
		a.add("Grapes");
		a.add("Guava");
		
		int size=a.size();
		String[] s=new String[size];
		a.toArray(s);
		
		for(String st:s)
		{
			System.out.println(st);
		}
	
	}
}
/*
Mango
Orange
Apple
Grapes
Guava
*/