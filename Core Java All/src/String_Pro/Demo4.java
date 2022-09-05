package String_Pro;

public class Demo4 
{
	public static void main(String [] args)
	{
		String s1="pune";
		String s2="PUNE";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3="Human";
		String s4="Nature";
		System.out.println(s3+s4);
		int num1=224488;
		String s5=String.valueOf(num1);
		int totaldigits=s5.length();
		System.out.println(totaldigits);
		int digits=String.valueOf(num1).length();
		System.out.println(digits);
		String s6="           India             ";
		System.out.println(s6);
		System.out.println(s6.trim());
	}
}
