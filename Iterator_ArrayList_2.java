import java.util.*;
class stu
{
	Scanner sc=new Scanner(System.in);
	public int no,english,hindi;
	public String name;
	void setdata()
	{
		
		System.out.println("Enter Number=>");
		no=sc.nextInt();
		System.out.println("Enter Name=>");
		name=sc.next();
		System.out.println("Enter English=>");
		english=sc.nextInt();
		System.out.println("Enter Hindi=>");
		hindi=sc.nextInt();
	}
	void printdata()
	{
		System.out.println("Number=>"+no+" Name=>"+name+" English=>"+english+" Hindi=>"+hindi);
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
public class jD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<stu> a1=new ArrayList<stu>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit=>");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			stu s1=new stu();
			s1.setdata();
			a1.add(s1);
		}
		
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			stu s1=(stu)itr.next();
			if(s1.passfail()==1)
			{
				s1.printdata();
			}
		}
	}

}
