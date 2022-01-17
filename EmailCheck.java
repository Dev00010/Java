import java.util.Scanner;
public class EmailCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		char ch;
		int i,f=0,d=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Email Id=>");
		str=sc.nextLine();
		
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);

			if(ch=='.')
			{
				d++;
			}
			else if(ch=='@')
			{
				f++;
			}
		}
		
		if(f==1 && (d==1 || d==2))
		{
			System.out.print("Valid");
		}
		else
		{
		   System.out.print("Not Valid");	
		}
		
	}
}


