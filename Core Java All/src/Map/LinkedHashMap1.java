package Map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> l1=new LinkedHashMap<Integer,String>();
		l1.put(22,"Mango");
		l1.put(63,"Orange");
		l1.put(84,"Mango");
		l1.put(11,"Banana");
		l1.put(63,"Grapes");
		l1.put(93,"PineApple");
		System.out.println("LinkedHashMap elements are");
		for(Map.Entry m1:l1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}

	}
}
/*
  OUTPUT:
 
LinkedHashMap elements are
22 Mango
63 Grapes
84 Mango
11 Banana
93 PineApple

*/