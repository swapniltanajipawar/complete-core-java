package Collection_Assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_all_Ele 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Samba");
		arr1.add("Dinga");
		arr1.add("Bunga");
		arr1.add("Ranga"); 
		
		List<String> arr2=new ArrayList<String>();
		arr2.add("Samba");
		arr2.add("Dinga");
		System.out.println("Does arr1 contains all elements?");
		System.out.println("arr1:"+arr1);
		System.out.println("arr2:"+arr2);
		System.out.println(arr1.containsAll(arr2));
		
		System.out.println("--------------------------------");
		arr2.add("Manga");
		System.out.println("Does arr1 contains all arr2 elements?");
		System.out.println("arr1: "+arr1);
		System.out.println("arr2: "+arr2);
		System.out.println(arr1.containsAll(arr2));
	}
}
/*
Does arr1 contains all elements?
arr1:[Samba, Dinga, Bunga, Ranga]
arr2:[Samba, Dinga]
true
--------------------------------
Does arr1 contains all arr2 elements?
arr1: [Samba, Dinga, Bunga, Ranga]
arr2: [Samba, Dinga, Manga]
false

*/