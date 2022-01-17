import java.util.*;
class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
public class jD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Dev",23);  
		Student s2=new Student(102,"Aum",21);  
	    Student s3=new Student(103,"Sanket",25);  
		  
	ArrayList<Student> al=new ArrayList<Student>();  
	  al.add(s1);//adding Student class object  
	  al.add(s2);  
	  al.add(s3);  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext())
	  {  
		  Student st=(Student)itr.next();  
		  System.out.println(st.rollno+" "+st.name+" "+st.age);
	  }
	  
	  

	}

}
}
