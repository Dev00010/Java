
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Value of A=> ");
		a=sc.nextInt();
		System.out.print("Enter Value of B=> ");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is Max");
		}
		else if (b>a)
		{
			System.out.println("B is Max");
		}
		else
		{
			System.out.println("Equal Value");
		}

	}

}
