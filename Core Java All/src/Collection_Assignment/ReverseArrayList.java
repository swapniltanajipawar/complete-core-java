package Collection_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String>arr = new ArrayList<String>();
		arr.add("Samba");
		arr.add("Dinga");
		arr.add("Bunga");
		arr.add("Manga");
		
		System.out.println("Actual ArrayList:"+arr); 
		Iterator it=arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Collections.reverse(arr);
		System.out.println("Reversed ArrayList contains:");
		
		Iterator it1=arr.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}
}
/*
OUTPUT
Actual ArrayList:[Samba, Dinga, Bunga, Manga]
Samba
Dinga
Bunga
Manga
Reversed ArrayList contains:
Manga
Bunga
Dinga
Samba

*/