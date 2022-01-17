package jGUItextarea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class area1 implements ActionListener
{
	JLabel jl1;
	JButton  jb1;
	JTextField jtf1;
	JTextArea jta1, jta2;
	
	area1()
	{
		JFrame f=new JFrame();
		jl1=new JLabel("Input");
		jb1=new JButton("Click");
		jtf1=new JTextField();
		jta1=new JTextArea(5,5);
		jta2=new JTextArea(5,5);
		
		jl1.setBounds(10,20,80,20);
		jtf1.setBounds(60,20,80, 20);
		f.add(jl1);
		f.add(jtf1);
		
		jb1.setBounds(20,50,100,20);
		f.add(jb1);
		jb1.addActionListener(this);
		
    	jta1.setBounds(20,80,130,200);
		f.add(jta1);
		
		jta2.setBounds(180,80,130,200);
		f.add(jta2);
		
		f.setSize(400,350);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int a,i;
		String str = "", str1="";
		a=Integer.parseInt(jtf1.getText());
		for(i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				str+=i+" "+"\n";
			}
			else
			{
				str1+=i+" "+"\n";
			}
		}
		jta1.setText(str);
		jta2.setText(str1);
	}
}

public class jgta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		area1 a1=new area1();
	}

}
