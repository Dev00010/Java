package jinhstu4;

class stu
{
	private int no;
	private String name;		
	stu(int x, String y)
	{
		no=x;
		name=y;
	}
	public void printstu()
	{
		System.out.println("No=>"+no+" Name=>"+name);
	}
}
class marks extends stu
{
	protected int hindi,english;
	marks(int x, String y,int a, int b)
	{
		super(x,y);
		english=a;
		hindi=b;
	}
	public void printmarks()
	{
		System.out.println("Hindi=>"+hindi+" English=>"+english);
	}
	
}

class result extends marks
{
	result(int x, String y,int a, int b)
	{
		super(x,y,a,b);
	}
	public void printresult()
	{
		System.out.println("Result=>"+(english+hindi));
	}
}
public class jin4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		result r1=new result(1,"Ram",22,33);
		r1.printstu();
		r1.printmarks();
		r1.printresult();

	}

}
