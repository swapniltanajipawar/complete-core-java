package Collection_Assignment;

import java.util.ArrayList;

public class Clone_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Samba");
		a1.add("Dinga");
		a1.add("Manga");
		a1.add("Bunga");
		System.out.println("ActualArrayList:"+a1);
		ArrayList<String> a2=(ArrayList<String>)a1.clone();
		System.out.println("ClonnedArrayList:"+a2);

	}
}
/*
ActualArrayList:[Samba, Dinga, Manga, Bunga]
ClonnedArrayList:[Samba, Dinga, Manga, Bunga]
 */