//Singleton Way-2
package Private_classMember;

class Instagram
{
	static Instagram i=new Instagram();
	int totalUploadedPhoto=0;
	//Main rule for singleton class is constructor must be private
	private Instagram()
	{
		System.out.println("Account created successfully");
	}
	void uploadPhoto(int photo)
	{
		System.out.println(photo +" photo uploaded successfully");
		totalUploadedPhoto=totalUploadedPhoto+photo;
		System.out.println("Total uploade photo:"+totalUploadedPhoto);
	}
	static Instagram getInstagram()
	{
		return i;
	}
}
public class Singletonway2
{
	public static void main(String [] args)
	{
		Instagram mobile=Instagram.getInstagram();
		System.out.println("mobile:"+mobile);
		mobile.uploadPhoto(2);
		System.out.println("---------------------------------------------");
		Instagram laptop=Instagram.getInstagram();
		System.out.println("laptop:"+laptop);
		laptop.uploadPhoto(3);
		System.out.println("---------------------------------------------");
		Instagram tablet=Instagram.getInstagram();
		System.out.println("tablet:"+tablet);
		tablet.uploadPhoto(4);
	}
}
/*
 Account created successfully
mobile:Private_classMember.Instagram@2f92e0f4
2 photo uploaded successfully
Total uploade photo:2
---------------------------------------------
laptop:Private_classMember.Instagram@2f92e0f4
3 photo uploaded successfully
Total uploade photo:5
---------------------------------------------
tablet:Private_classMember.Instagram@2f92e0f4
4 photo uploaded successfully
Total uploade photo:9

*/