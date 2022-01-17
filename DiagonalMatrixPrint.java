import java.util.Scanner;

public class DiagonalMatrixPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[100][100];
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
				if(i==j)
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}

	}

}
