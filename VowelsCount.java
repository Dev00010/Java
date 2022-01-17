import java.util.Scanner;
public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String str;
		char ch;
		int i,c=0;
		System.out.print("Enter Name/Statement=>");
		str=sc.nextLine();
		
		for(i=0;i<str.length();i++)  //str.length for string length
		{
			ch=str.charAt(i); //To fetch single character
			if(ch=='A' || ch=='a' || ch=='e' || ch=='E' || ch=='i' ||  ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			{
				c++;
			}
		}
		System.out.println("Vowel Count=>"+c);

	}

}
