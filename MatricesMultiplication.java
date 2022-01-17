import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[100][100];
		int b[][]=new int[100][100];
		int c[][]=new int[100][100];
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter Number for a["+i+"]["+j+"]=> ");
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter Number for b["+i+"]["+j+"]=> ");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Additon of 2 Array:\n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]+=a[i][j]*b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}

	}

}
