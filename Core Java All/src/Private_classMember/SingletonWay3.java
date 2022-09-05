//SingletonWay-3
package Private_classMember;
class Linkdin
{
	static Linkdin l;
	int totalUploadedPhoto=0;

	static 
	{
		l=new Linkdin();
	}
	private Linkdin()
	{
		System.out.println("Acccount created successfully");
	}
	void uploadPhoto(int photo)
	{
		System.out.println(photo+" photo uploaded successfully");
		totalUploadedPhoto=totalUploadedPhoto+photo;
		System.out.println("Total uploaded photo"+totalUploadedPhoto);
	}
	static Linkdin getLinkdin()
	{
		return l;
	}
}
public class SingletonWay3
{
	public static void main(String [] args)
	{
		Linkdin mobile=Linkdin.getLinkdin();
		System.out.println("mobile:"+mobile);
		mobile.uploadPhoto(2);
		System.out.println("-------------------------------");
		Linkdin laptop=Linkdin.getLinkdin();
		System.out.println("laptop:"+laptop);
		laptop.uploadPhoto(2);
		System.out.println("-------------------------------");
		Linkdin tablet=Linkdin.getLinkdin();
		System.out.println("tablet:"+tablet);
		tablet.uploadPhoto(2);
	}
}

/*
Acccount created successfully
mobile:Private_classMember.Linkdin@2f92e0f4
2 photo uloaded successfully
Total uploaded photo2
-------------------------------
laptop:Private_classMember.Linkdin@2f92e0f4
2 photo uloaded successfully
Total uploaded photo4
-------------------------------
tablet:Private_classMember.Linkdin@2f92e0f4
2 photo uploaded successfully
Total uploaded photo6
 */