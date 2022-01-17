import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		char ch;
		int i,u=0,l=0,o=0;
		
		System.out.print("Enter Name/Statement=>");
		str=sc.nextLine();
		
		for(i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			System.out.print(ch);
		}

	}

}
