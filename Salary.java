public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int grosssalary,basic,da,hra,ma,ltc,va,netsalary;
    
    basic=8000;
    da=(52*basic)/100;
    hra=(10*basic)/100;
    ma=(52*basic)/100;
    ltc=(52*basic)/100;
    va=(52*basic)/100;
    grosssalary=da+hra+ma+ltc+va;
    
    netsalary=grosssalary-1000;
    System.out.println("Net Salary=> "+netsalary);
	}

}
