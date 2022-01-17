import java.util.Scanner;
public class DeleteChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i;
		char ch,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name/Statement=>");
		str=sc.nextLine();
		
		
		System.out.print("Enter Character to be deleted=>");
		d=sc.next().charAt(0);
		
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch!=d)
			{
				System.out.print(ch);
			}
		}
		

	}

}
