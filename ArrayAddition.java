
import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		int b[]=new int[100];
		int c[]=new int[100];
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.print("Enter Limit=>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Number for a["+i+"]=> ");
			a[i]=sc.nextInt();
;		}
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Number for b["+i+"]=> ");
			b[i]=sc.nextInt();
;		}
		for(i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println("Sum=>"+c[i]);
		}

	}

}
