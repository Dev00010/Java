class stu
{
	private int no,eng,hindi;
	private String name;
	
	stu()
	{
		no=5;
		eng=20;
		hindi=30;
		name="ram";
	}
	stu(int x,int y,int z,String a)
	{
		no=x;
		name=a;
		eng=y;
		hindi=z;
	}
	public void printdata()
	{
		System.out.print("No=>" + no +" \tName=>"+ name +"\tEnglish=>"+ eng +"\tHindi=>"+ hindi + "\n");
	}
}
public class jc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stu s1=new stu();
		stu s2=new stu();
		stu s3=new stu(11,22,33,"Shivam");
		stu s4=new stu();
		s1.printdata();
		s2.printdata();
		s3.printdata();
		s4.printdata();

	}

}
