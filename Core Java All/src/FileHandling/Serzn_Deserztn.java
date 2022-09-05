package FileHandling;
import java.io.*;

class student implements Serializable
{
	String name="Samba";
	int yop=2021;
	transient double per=99.99;
}
public class Serzn_Deserztn
{
	public static void main(String[] args) throws Exception 
	{   
		student s1=new student();
		System.out.println("S1:"+s1);
		System.out.println("Name:"+s1.name);
		System.out.println("YOP:"+s1.yop);
		System.out.println("Percentage:"+s1.per);
		System.out.println("---------------------------------");
		//Serialisation
		FileOutputStream f1=new FileOutputStream("D:\\FileHandling\\Test\\team.txt");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		o1.writeObject(s1);//Sending student object data inside Studentifo.txt
		
		//De-serialisation
		FileInputStream f2=new FileInputStream("D:\\FileHandling\\Test\\team.txt");
		ObjectInputStream o2=new ObjectInputStream(f2);
		student s2=(student)o2.readObject();
		
		System.out.println("s2:"+s2);
		System.out.println("Name:"+s2.name);
		System.out.println("Yop:"+s2.yop);
		System.out.println("Percentage:"+s2.per);
	}
}
/*
S1:FileHandling.student@2f92e0f4
Name:Samba
YOP:2021
Percentage:99.99
---------------------------------
s2:FileHandling.student@246b179d
Name:Samba
Yop:2021
Percentage:0.0
*/