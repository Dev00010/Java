import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int maths,english,hindi,total;
		
		System.out.print("Enter Marks of Maths=> ");
		maths=sc.nextInt();
		System.out.print("Enter Marks of English=> ");
		english=sc.nextInt();
		System.out.print("Enter Marks of Hindi=> ");
		hindi=sc.nextInt();
		total=maths+english+hindi;
		
		if(total>50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
