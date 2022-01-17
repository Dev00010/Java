import java.util.Scanner;
class Student
{
	Scanner sc=new Scanner(System.in);
	private int no;
	private String name;
	
	public void setData()
	{
		System.out.println("Enter Number=>");
		no=sc.nextInt();
		
		System.out.println("Enter Name=>");
		name=sc.next();
	}
	
	public void printData()
	{
		System.out.println("No = " + no + " Name = "+ name);
	}
}

public class jcls1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1=new Student();
		Student s2,s3;
		s2=new Student();
		s3=new Student();

		s1.setData();
		s2.setData();
		s3.setData();
		
		s1.printData();
		s2.printData();
		s3.printData();
	
	
	}

}
