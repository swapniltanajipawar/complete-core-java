//Singleton Way-1
package Private_classMember;

class Facebook
{ static Facebook f;
static int count;
int totalUploadedPhoto=0;
private Facebook()
{
	System.out.println("account created Successfullly");
	count++;
}
void uploadPhoto(int photo)
{
	System.out.println(photo+"photo uploaded successfully");
	totalUploadedPhoto=totalUploadedPhoto+photo;
	System.out.println("Total uploaded photo:"+totalUploadedPhoto);
}
static Facebook getFacebook()
{
	if(count==0)
	{
		f=new Facebook();
	}
	System.out.println("f:"+f);
	return f;
}
}
public class Singletonway1
{
	public static void main(String [] args)
	{
		Facebook mobile=Facebook.getFacebook();
		System.out.println("mobile:"+mobile);
		mobile.uploadPhoto(2);
		System.out.println("-------------------------");
		Facebook laptop=Facebook.getFacebook();
		System.out.println("laptop:"+laptop);
		laptop.uploadPhoto(3);
		System.out.println("-------------------------");
		Facebook tablet=Facebook.getFacebook();
		System.out.println("tablet:"+tablet);
		tablet.uploadPhoto(4);
	}
}

/*
output:
account created Successfullly
f:Private_classMember.Facebook@2f92e0f4
mobile:Private_classMember.Facebook@2f92e0f4
2photo uploaded successfully
Total uploaded photo:2
-------------------------
f:Private_classMember.Facebook@2f92e0f4
laptop:Private_classMember.Facebook@2f92e0f4
3photo uploaded successfully
Total uploaded photo:5
-------------------------
f:Private_classMember.Facebook@2f92e0f4
tablet:Private_classMember.Facebook@2f92e0f4
4photo uploaded successfully
Total uploaded photo:9
 */

