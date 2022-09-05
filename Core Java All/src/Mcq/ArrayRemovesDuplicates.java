package Mcq;

import java.util.TreeSet;
public class ArrayRemovesDuplicates
{
	public static void main(String[] args)
	{
		String sarr[] = {"One", "Two", "One", "Three", "Four","Two"};

		TreeSet t = new TreeSet();
		for(String s:sarr)
		{
			if(!t.add(s))
			{
				System.out.println(s);
			}
		}
	}
}