//4. WRITE A JAVA PROGRAM TO SHOW A DEFFERENCE 
//BETWEEN EXTEND AND IMPLEMENTS IN MULTIPLE LEVEL INHERITANCE.
package Interface;
interface Matrimonial
{
	void personalDetail (String name, String Gender, int age, String instrestedin);
	void employeementStatus(String job , String company, double sal);
	void hobbies();
	void expectationsFromPartner();
	void contactInfo();
}
abstract class Detail implements Matrimonial//IMPLEMENTS B/W INTEFACE AND CLASS
{
	public void personalDetail (String name, String gender, int age, String instrestedin)	
	{
		System.out.println("NAME :"+name);
		System.out.println("GENDER:"+gender);
		System.out.println("AGE:"+age);
		System.out.println("INTRESTEND IN:"+instrestedin);
	}
	public void employeementStatus(String job , String company, double sal)
	{
		System.out.println("COMPANY NAME:"+company);
		System.out.println("DESIGNATION:"+job);
		System.out.println("ANNUAL-SALARY:Rs"+sal);

	}
	public void hobbies()
	{
		System.out.println("HOBBIES:Makeup , Dancing , Coding, Acting , Watching Movies");
	}
}
class DetailFinal extends Detail//EXTENDS USED BETWEEN TWO CLASSES OR INTERFACE
{
	public void expectationsFromPartner()
	{
		System.out.println("EXPECTION FROM PATNER: Good Looking , Caste-HINDU BRAHMIN");
		System.out.println("Age Below 30, Goverment Servent");
	}
	public void contactInfo()
	{
		System.out.println("ADDRESS:Flat no-12 wing -A of Nyati Buidings ShivajiNagar Pune, 411030");
		System.out.println("Mobile NO-7766962222");
	}
}
public class Test_Matrimonial_Site 
{
	public static void main(String[] args)
	{
		System.out.println("             **WELCOME IN MATRIMONIAL SITE**                      ");
		System.out.println("------------------------------------------------------------------");
		DetailFinal d1=new DetailFinal();
		d1.personalDetail ("MADHURA DIXIT", "FEMALE", 25 , "MALE");
		d1.employeementStatus("Software Developer"," TCS", 1000000);
		d1.hobbies();
		d1.expectationsFromPartner();
		d1.contactInfo();
		System.out.println();
		System.out.println("THANK YOU FOR VISITING MATRIMONIAL SITE FEEL FREE TO CONTACT US ON BELOW DETAIL");
		System.out.println("MOBILE NO-9988554433");
		System.out.println("WWW.MATRIMONIAL.COM");
		

	}
}
