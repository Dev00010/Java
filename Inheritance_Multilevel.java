import java.util.Scanner;

class stu
{
	private int no;
	private String name;
	public void setstu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id=>");
		no=sc.nextInt();
		System.out.print("Enter Name=>");
		name=sc.next();
	}
    public void printstu()
    {
    	System.out.println("No=>"+no+" Name=>"+name);
    }
}

class marks extends stu
{
	protected int hindi,english;
	public void setmarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks of Hindi=>");
		hindi=sc.nextInt();
		System.out.print("Enter marks of English=>");
		english=sc.nextInt();
	}
	public void printmarks()
	{
		System.out.println
		
		("Hindi=>"+hindi+" English=>"+english);
	}
}

class result extends marks
{
	private int result;
	public void printresult()
	{
		System.out.println("Result=>"+(hindi+english));
	}
}
public class JStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		result r1=new result();
		r1.setstu();
		r1.setmarks();
		r1.printstu();
		r1.printmarks();
		r1.printresult();

	}

}
