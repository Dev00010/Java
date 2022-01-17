import java.io.File; //for using file
import java.io.IOException;
public class JF1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1= new File("A:\\Trojan-Python\\abc.txt");
		if(f1.createNewFile())
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("File already created");
			System.out.println("Write="+f1.canWrite());
			System.out.println("Read="+f1.canRead());
			//f1.delete will delete file
		}
	}

}
