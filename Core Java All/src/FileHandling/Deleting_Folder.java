//To delete the Folder with help of the file class 
//which is present in the io package
package FileHandling;
import java.io.File;

public class Deleting_Folder 
{
	public static void main(String[] args) 
	{
		File f1=new File("D:\\FileHandling\\Javva");
		if(f1.exists())
		{
			f1.delete();
			System.out.println("Folder Deleted Successfully");
		}
		else
		{
			System.out.println("Sorry//folder not exits");
		}	
	}
}