package jStatic;
import java.util.Scanner;

class stu
{
	private int no;
	private String name;
	private static int x;
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		no=sc.nextInt();
		System.out.print("Enter Name=>");
		name=sc.next();
		x++;
	}
	public void printdata()
	{
		System.out.println("No=>"+no+" Name=>"+name);
	}
	
	public static void pritncnt()
	{
		System.out.println(" Static x=>"+ x );
	}
}
public class jstaticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stu s1=new stu();
		stu s2=new stu();
		stu s3=new stu();
		s1.setdata();
		
		s2.setdata();
		
		s3.setdata();
		s1.printdata();
		s2.printdata();
		s3.printdata();

		
		stu.pritncnt();
	}

}
