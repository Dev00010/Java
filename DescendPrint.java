
import java.util.Scanner;

public class DescendPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		int i,n,j,c;
		System.out.print("Enter Limit=>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Number for a["+i+"]=> ");
			a[i]=sc.nextInt();
;		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}

	}

}
