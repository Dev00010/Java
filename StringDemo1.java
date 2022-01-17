
public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcd efgh i j kl";
		
		char ch;
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		int i;
		
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			System.out.println(ch);
		}
		
	}

}
