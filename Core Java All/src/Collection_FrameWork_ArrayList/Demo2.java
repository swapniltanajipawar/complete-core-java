package Collection_FrameWork_ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class Demo2 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		ArrayList hero=new ArrayList();
		hero.add("Samba");
		hero.add("Dinga");
		hero.add("Bunga");
		hero.add("Manga");

		ArrayList heroin=new ArrayList();
		heroin.add("Dingi");
		heroin.add("Sambi");
		heroin.add("Bungi");
		heroin.add("Mangi");

		ArrayList film=new ArrayList();
		film.add("Thakur");
		film.addAll(hero);
		film.addAll(heroin);
		
		System.out.println("Film object elements are:");
		Iterator it=film.iterator();
		while(it.hasNext())//check element present inside object or not...
		{
			System.out.println(it.next());//retrieve the element from the object
		}
		System.out.println("-------------------------------------------------------");
		System.out.println(film.contains("Bunga"));//boolean Output
		System.out.println(film.contains("Runga"));//cheack element existance
		System.out.println(film.containsAll(heroin));
		System.out.println("-------------------------------------------------------");
		film.remove("Dingi");
		film.removeAll(hero);
		System.out.println("------------------------------------------------------");
		
		System.out.println("Film object elements are:");
		it=film.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());//retrieve the element from the object
		}
		System.out.println("-------------------------------------------------------");
		film.retainAll(heroin);
		
		System.out.println("Film object elements are:");
		it=film.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());//retrieve the element from the object
		}
	}
}
/*
OUTPUT:

Film object elements are:
Thakur
Samba
Dinga
Bunga
Manga
Dingi
Sambi
Bungi
Mangi
------------------------------------------------------
true
false
true
------------------------------------------------------
------------------------------------------------------
Film object elements are:
Thakur
Sambi
Bungi
Mangi
-------------------------------------------------------
Film object elements are:
Sambi
Bungi
Mangi

*/