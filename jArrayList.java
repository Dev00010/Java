import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class stu
{
	
	int no, english, hindi;
	String name;
	
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		no=sc.nextInt();
		System.out.print("Enter Name=>");
		name=sc.next();
		System.out.print("Enter English Marks=>");
		english=sc.nextInt();
		System.out.print("Enter English Marks=>");
		hindi=sc.nextInt();
	}
	void printdata()
	{
		System.out.println("No=>"+no+" Name=>"+name+" English=>"+english+" Hindi=>"+hindi);
	}
	int passfail()
	{
		if(english+hindi>50)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
}
public class jAl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<stu> a1 =new ArrayList<stu>();
		
		Scanner sc=new Scanner(System.in);
		
		int n,i;
		System.out.println("Enter Limit=>");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			stu s1=new stu();
			s1.setdata();
			a1.add(s1);
		}

		Iterator itr=a1.iterator();
		
		while(itr.hasNext())
		{
			stu s1=(stu)itr.next();
			if(s1.passfail()==2)
			{
				s1.printdata();
			}
		}
		
		

	}

}
