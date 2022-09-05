package Collection_FrameWork_ArrayList;
import java.util.Enumeration;
import java.util.Vector;


public class Vector1 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.add(22);
		v1.add('A');
		v1.add("Samba");
		v1.add(2.2);
		v1.add(null);
		
		System.out.println("Capacity:"+v1.capacity());
		System.out.println("Size:"+v1.size());
		
		v1.add(11);
		v1.add("Banana");
		
		System.out.println("Capacity:"+v1.capacity());
		System.out.println("Size:"+v1.size());
		System.out.println("---------------------------");
		System.out.println(v1.elementAt(1));
		System.out.println(v1.firstElement());
		v1.setElementAt("Hello",5 );
		v1.remove(null);
		
		
	    Enumeration e=v1.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
	}
}
/*

Capacity:10
Size:5
Capacity:10
Size:7
22
A
Samba
2.2
null
11
Banana

*/