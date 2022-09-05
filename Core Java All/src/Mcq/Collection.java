package Mcq;

import java.util.ArrayList;
import java.util.Collections;

public class Collection
{
	public static void main(String[] args)

	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(25);
		a.add(15);
		a.add(35);
		a.add(85);
		a.add(65);
		a.add(55);
		System.out.println("Largest:"+Collections.max(a));System.out.println("Smallest:"+Collections.min(a));
	}
}
