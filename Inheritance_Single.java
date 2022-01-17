import java.util.Scanner;
class india
{
	protected int x;
	public void setindia()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for x=>");
		x=sc.nextInt();
	}
	public void printindia()
	{
		System.out.println("X=>"+x);
	}
}

class us extends india
{
	private int y;
	public void setdus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for y=>");
		y=sc.nextInt();
	}
	public void printus()
	{
		System.out.println("Y=>"+y);
	}
	public void multi()
	{
		System.out.println("Nulti = " + (x*y));
	}
}
public class Jinh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		us u1=new us();
		
		u1.setdus();
		u1.setindia();
		u1.printus();
		u1.printindia();
	}

}
