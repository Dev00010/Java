package jgui5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myframe1 implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	
	myframe1()
	{
		JFrame f=new JFrame();
		
		l1=new JLabel("Enter Limit");
		l2=new JLabel("Answer");
		
		t1=new JTextField();
		t2=new JTextField();
		
		b1=new JButton("Click to Get Answer");
		
		l1.setBounds(10,20,80,20);
		t1.setBounds(100,20,80, 20);
		f.add(l1);
		f.add(t1);
		
		b1.setBounds(10,50,180,20);
		f.add(b1);
		b1.addActionListener(this);
		
		l2.setBounds(10,80,80,20);
		t2.setBounds(100,80,80, 20);
		f.add(l2);
		f.add(t2);
		
		f.setSize(400,350);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int a=Integer.parseInt(t1.getText());
		String str="";
		for(int i=1;i<=a;i++)
		{
			str+=i+" ";
		}
		
		t2.setText(str); 
	}
}

public class jg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myframe1 f1=new myframe1();
	}

}
