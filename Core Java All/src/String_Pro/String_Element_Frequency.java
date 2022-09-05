package String_Pro;
import java.util.*;

public class String_Element_Frequency 
{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("have");
		a1.add("nice");
		a1.add("day");
		a1.add("day");
		System.out.println(Collections.frequency(a1, "day"));
	}
}
