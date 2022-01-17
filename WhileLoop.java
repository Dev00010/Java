
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		n=sc.nextInt();
        while (i<=n)
        {
        	System.out.print(i+" ");
        	i++;
        }

	}

}
