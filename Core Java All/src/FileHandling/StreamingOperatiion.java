package FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamingOperatiion
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream f1=new FileOutputStream("D:\\FileHandling\\Test\\Team.txt");
		f1.write('A');
		System.out.println("---------------------------");

		FileInputStream f2=new FileInputStream("D:\\FileHandling\\Test\\Team.txt");
		int value=f2.read();
		System.out.println((char)value);
		f1.close();
		f2.close();

	}
}
