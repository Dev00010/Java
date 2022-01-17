
import java.util.Scanner;

public class DoWhileTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		n=sc.nextInt();
        do
        {
        	System.out.println(n+" * "+i+" = "+n*i);
        	i++;
        }
        while(i<=10);

	}

}
