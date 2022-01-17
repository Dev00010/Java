
class stu
{
	private int no;
	private String name;
	static
	{
		System.out.println("In Static Block 1");
	}
	stu()
	{
		System.out.println("In constructor");
		no=5;
		name="Dev";
	}
	static
	{
		System.out.println("In Static Block 2");
	}
	public void printdata()
	{
		System.out.println("No=>"+no+" Name=>"+name);
	}
	static
	{
		System.out.println("In Static Block 3");
	}
}
public class jsb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu s1=new stu();
		stu s2=new stu();
		stu s3=new stu();
		s1.printdata();
		s2.printdata();
		s3.printdata();

	}

}
