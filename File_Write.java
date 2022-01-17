import java.io.FileWriter; //To write in file
import java.io.IOException;
public class JF2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f1=new FileWriter("A:\\Trojan-Python\\jfiledemo.txt");
		f1.write("Demo program to write in java");
		f1.close();
		System.out.println("!!Done!!");
	}

}
