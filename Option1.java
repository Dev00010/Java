package jdemo1;
import java.util.Scanner;
public class Option1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter 1 for Positive-Negative");
		System.out.println("Enter 2 for Cube");
		System.out.println("Enter 3 for Square");
		System.out.print("Enter choice=>");
		a=sc.nextInt();
		
		if(a==1)
		{
			System.out.print("Enter your Number=>");
			b=sc.nextInt();
			if(b>0)
			{
				System.out.print("Positive");
			}
			else
			{
				System.out.print("Negative");
			}
		}
		else if (a==2)
		{
			System.out.print("Enter your Number=>");
			b=sc.nextInt();
			System.out.print("Cube=>"+ b*b*b);
		}
		else
		{
			System.out.print("Enter your Number=>");
			b=sc.nextInt();
			System.out.print("Square=>"+ b*b);
		}

	}

}
