package Scanner;
import java.util.Scanner;

public class Student
{
	void display(String name, int yop, double per)
	{
		System.out.println("Student Information");
		System.out.println("Student name is:"+name);
		System.out.println("Student year of passing is:"+yop);
		System.out.println("Student percentage is:"+per);
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Name:");
		String n=scan.nextLine();

		System.out.println("Enter year of passing:");
		int y=scan.nextInt();

		System.out.println("Enter percentage(%):");
		double p=scan.nextDouble();

		Student s1=new Student();
		s1.display(n,y,p);
		scan.close();
	}
}
