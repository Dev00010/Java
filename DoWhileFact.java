
import java.util.Scanner;

public class DoWhileFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		n=sc.nextInt();
        do
        {
        	System.out.print(i+" * ");
        	fact=fact*i;
        	i++;
        }
        while(i<=n);
        System.out.println("Factorial="+fact);

	}

}
