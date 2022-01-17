import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
        	fact=fact*i;
        	
        }
        System.out.print("Factorial=>"+fact);
	}

}
