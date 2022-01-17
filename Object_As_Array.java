import java.util.Scanner;

class stu
{
	private int n;
	private String name;
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		n=sc.nextInt();
		System.out.print("Enter Name=>");
		name=sc.next();
	}
	public void printdata()
	{
		System.out.println("No=>"+n+" Name=>"+name+"\n");
	}
	
}
public class Stu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i,n;
		stu s[]=new stu[100];
		System.out.print("Enter Limit=>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			s[i]=new stu();
			s[i].setdata();
		}
		for(i=0;i<n;i++)
		{
			s[i].printdata();
		}

	}

}
