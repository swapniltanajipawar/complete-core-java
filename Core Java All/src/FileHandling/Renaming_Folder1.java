//Folder Renamed Successfully


package FileHandling;
import java.io.File;

public class Renaming_Folder1 
{
	public static void main(String[] args) 
	{
		File f1=new File("D:\\FileHandling\\Test11");
		File f2=new File("D:\\FileHandling\\Test");

		if(f1.exists())
		{   f1.renameTo(f2);
		System.out.println("Folder Renamed Successfully..");
		}
		else
		{
			System.out.println("Folder not exists");
		}
	}
}
