import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number=> ");
        a=sc.nextInt();
        
        if(a%5==0)
        {
        	System.out.print("Accepted");
        }
        else
        {
        	System.out.print("Rejected");
        }
        	
	}

}
