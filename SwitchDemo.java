import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b;
		char a;
		System.out.println("Enter p for Positive-Negative");
		System.out.println("Enter c for Cube");
		System.out.println("Enter s for Square");
		System.out.print("Enter choice=>");
		a=sc.next().charAt(0);
		
		switch(a)
		{
		    case(a=='p' || a=='P'):
	     	{
		    	System.out.print("Enter your Number=>");
			    b=sc.nextInt();
			       if(b>0)
		        	{
				       System.out.print("Positive");
			        }
			       else
			       {
				       System.out.print("Negative");
			       }
		    }
		    case (a=='c' || a=='C'):
	     	{
		    	System.out.print("Enter your Number=>");
			    b=sc.nextInt();
			    System.out.print("Cube=>"+ b*b*b);
		    }
		    case (a=='s' || a=='S'):
    		{
	    		System.out.print("Enter your Number=>");
		    	b=sc.nextInt();
	    		System.out.print("Square=>"+ b*b);
		    }
		    default:
		    {
			    System.out.print("!!Wrong Option!!");
	        }
       	}

	}

}
