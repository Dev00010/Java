import java.util.Scanner;
class err extends Exception
{
	public String toString()
	{
		return "!!!Address lenght is less than 10 character!!!";
	}
}
public class jed4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String add;
		int c=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter your address=>");
			add=sc.next();
			c=add.length();
			if(c<10)
			{
				throw new err();
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
	}

}
