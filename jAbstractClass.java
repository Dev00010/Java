
abstract class important
{
	abstract void hi();
	abstract void add(int a,int b);
}

class dev extends important
{

	@Override
	void hi() {
		// TODO Auto-generated method stub
		System.out.println("Hi Dev");
	}

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		int x=a;
		int y=b;
		System.out.println("Add=>"+(x+y));
	}
	
}

class karan extends important
{

	@Override
	void hi() {
		// TODO Auto-generated method stub
		System.out.println("Hi Karan");
	}

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		int x=a;
		int y=b;
		System.out.println("Add=>"+(x+y));
	}
	
}


public class jcls1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		dev d1=new dev();
		karan k1=new karan();
		d1.hi();
		d1.add(22, 22);
		k1.hi();
		k1.add(33, 33);
		
	}

}
