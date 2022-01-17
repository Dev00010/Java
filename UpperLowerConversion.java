import java.util.Scanner;

public class UpperLowerConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		char ch;
		int i,u=0,l=0,o=0;
		
		System.out.print("Enter Name/Statement=>");
		str=sc.nextLine();
		
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				//Wraper Class used
				System.out.print(Character.toLowerCase(ch));
			}
			else 
			{
				System.out.print(Character.toUpperCase(ch));
			}
			
		}
		

	}

}
