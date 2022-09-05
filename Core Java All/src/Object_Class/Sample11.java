package Object_Class;
public class Sample11
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Sample11 s11=new Sample11();
		new Sample11();
		Sample11 s12=new Sample11();
        s11=null;
        new Sample11();
        System.out.println("Calling Garbage Collector");
        System.gc(); 
	}
	@SuppressWarnings("deprecation")
	protected void finalize() throws Throwable 
	{
		super.finalize();
		System.out.println("Object distroyed");
	}
}
