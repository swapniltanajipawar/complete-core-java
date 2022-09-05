package Map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMap1 
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> t1=new TreeMap<Integer,String>();

		t1.put(22,"Mango");
		t1.put(63,"Orange");
		t1.put(84,"Mango");
		t1.put(11,"Banana");
		t1.put(63,"Grapes");
		t1.put(93,"PineApple");
		System.out.println("TreeMap elemenys:");
		
		for(Map.Entry m1:t1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}
}
/*
TreeMap elemenys:
11 Banana
22 Mango
63 Grapes
84 Mango
93 PineApple

*/