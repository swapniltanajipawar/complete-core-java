package Map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(22,"Mango");
		h1.put(63,"Oramge");
		h1.put(84, "Mango");
		h1.put(11, "Banana");
		h1.put(63, "Grapes");
		
		System.out.println(h1);
		System.out.println(h1.get(11));
		System.out.println(h1.containsKey(22));
		System.out.println(h1.containsValue("Gauva"));
		h1.remove(22);
		h1.replace(84, "Orange");
		System.out.println("HashMap elements are:");
		for(Map.Entry m1:h1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		

	}
}
