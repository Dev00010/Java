
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		int i,n,se=0,ce=0,so=0,co=0;
		System.out.print("Enter Limit=>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Number for a["+i+"]=> ");
			a[i]=sc.nextInt();
;		}
		for(i=0;i<n;i++)
		{
			if(a[i]>=0)
			{
				System.out.println(a[i]+" is positive");
				se+=a[i];
				ce++;
			}
			else
			{
				System.out.println(a[i]+" is negative");
				so+=a[i];
				co++;
			}
;		}
		System.out.println("Positive:: Sum=>"+se+" Count=>"+ce);
		System.out.println("Negative:: Sum=>"+so+" Count=>"+co);


	}

}
