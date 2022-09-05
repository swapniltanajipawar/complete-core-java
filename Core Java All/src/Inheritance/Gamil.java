package Inheritance;

class Gamil1 
{
	private final String userName;//getter only
	private String password;
	Gmail( String userName, String password )
	{
		this.userName=userName;
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getUserName()
	{
		return userName;
	}

}
public class Test_Gmail
{
	public static void main(String [] args)
	{
		Gmail g1=new Gmail("Samba","Samba@12345");
		System.out.println("userName:"+g1.getUserName());
		System.out.println("Password:"+g1.getPassword());
		System.out.println("--------------------------------------------");
		g1.setPassword("Sambi@2233");
		System.out.println("userName:"+g1.getUserName());
		System.out.println("Password:"+g1.getPassword());
	}
}
