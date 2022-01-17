import java.util.Scanner;
class math
{
	Scanner sc=new Scanner(System.in);
	private float a,b;
	public void setdata()
	{
		System.out.println("Enter Value of a=>");
		a=sc.nextInt();
		System.out.println("Enter Value of b=>");
		b=sc.nextInt();
	}
	public void printdata()
	{
		System.out.println("Value of A="+a+" B="+b);
	}
	public void add()
	{
		System.out.println("Addition=>"+(a+b));
	}
	public void sub()
	{
		System.out.println("Subtraction=>"+(a-b));
	}
	public void mult()
	{
		System.out.println("Multiplication=>"+(a*b));
	}
	public void div()
	{
		System.out.println("Division=>"+(a/b));
	}
	
}



public class jcls2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		math m1=new math();
		m1.setdata();
		m1.printdata();
		m1.add();
		m1.sub();
		m1.mult();
		m1.div();

	}

}
