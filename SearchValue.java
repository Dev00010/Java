import java.util.Scanner;

public class SearchValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		int i,n,s=0,f=0;
		System.out.print("Enter Limit=>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Number for a["+i+"]=> ");
			a[i]=sc.nextInt();
;		}
		System.out.print("Enter value to search=>");
		s=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==s)
			{
				f=1;
			}
		}
		if(f==1)
		{
			System.out.print("Found");
		}
		else
		{
			System.out.print("!!!No such Value!!!");
		}

	}

}
