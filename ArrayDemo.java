
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Number for a["+i+"]=> ");
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("a["+i+"]=>"+a[i]);
		}

	}

}
