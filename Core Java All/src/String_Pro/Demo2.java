package String_Pro;

public class Demo2 
{
	public static void main(String [] args)
	{

		String s1="Maharastra";
		System.out.println(s1);

		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);

		System.out.println(s1.startsWith("Maha"));
		System.out.println(s1.endsWith("Maha"));
		System.out.println(s1.contains("rash"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,8));
		System.out.println(s1.subSequence(4,8));
		System.out.println(s1.replace("Maha","Raha"));
		System.out.println(s1);

	}

}
