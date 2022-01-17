import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.print("Enter Limit=>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Number for a["+i+"]=> ");
			a[i]=sc.nextInt();
;		}
		for(i=n-1;i>=0;i--)
		{
			System.out.println("a["+i+"]=>"+a[i]);
;		}

	}

}
