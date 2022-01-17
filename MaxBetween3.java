import java.util.Scanner;
public class MaxBetween3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of A=>");
		a=sc.nextInt();
		System.out.print("Enter Value of B=>");
		b=sc.nextInt();
		System.out.print("Enter Value of C=>");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.print("A is Max");
			}
		}
		else if(b>a)
		{
			if(b>c)
			{
				System.out.print("B is Max");
			}
		}
		else
		{
			System.out.print("C is Max");
		}

	}

}
