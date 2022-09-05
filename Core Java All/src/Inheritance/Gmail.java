package Inheritance;

class Gmail1
{
	private final String username;
	private String password;
	Gmail1(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getUserName()
	{
		return username;
	}
}
public class Gmail
{
	public static void main(String [] args)
	{
		Gmail1 g1=new Gmail1("Samba","Samba@12345");
		System.out.println("Password:"+g1.getPassword());
		System.out.println("Username:"+g1.getUserName());
		System.out.println("----------------------------------");
		g1.setPassword("Sambi@12345");
		System.out.println("Password:"+g1.getPassword());
		System.out.println("Username:"+g1.getUserName());
	}
}

/*Password:Samba@12345
Username:Samba
----------------------------------
Password:Sambi@12345
Username:Samba
 */ 