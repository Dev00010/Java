import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.print("Enter Number=>");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
