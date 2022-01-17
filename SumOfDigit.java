
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0,t;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=>");
		n=sc.nextInt();
        while (n!=0)
        {
        	t=n%10;
        	s=s+t;
        	n=n/10;
        }
        System.out.print("Sum="+s);

	}

}
