//FOLDER CREATED WITH THE HELP OF THE FILE CLASS
package FileHandling;
import java.io.File;

public class Creating_Folder 
{
	public static void main(String[] args)
	{
		File f1=new File("D:\\FileHandling\\Javva");
		if(f1.exists())
		{
			System.out.println("Folder already exits...");
		}
		else
		{
			f1.mkdir();
			System.out.println("Folder created successfully...");
		}
	}
}