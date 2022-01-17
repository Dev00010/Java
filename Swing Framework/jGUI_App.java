package jgui4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myframe1 implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1;
	
	myframe1()
	{
		JFrame f=new JFrame();
		
		l1=new JLabel("Student ID");
		l2=new JLabel("Name");
		l3=new JLabel("English Marks");
		l4=new JLabel("Hindi Marks");
		l5=new JLabel("Maths Marks");
		l6=new JLabel("Answer");
		l7=new JLabel("Grade");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		t7=new JTextField();
		
		b1=new JButton("Click to Get Result");
		
		l1.setBounds(10,20,80,20);
		t1.setBounds(100,20,80, 20);
		f.add(l1);
		f.add(t1);
		
		l2.setBounds(10,50,80,20);
		t2.setBounds(100,50,80, 20);
		f.add(l2);
		f.add(t2);
		
		l3.setBounds(10,80,80,20);
		t3.setBounds(100,80,80, 20);
		f.add(l3);
		f.add(t3);
		
		l4.setBounds(10,110,80,20);
		t4.setBounds(100,110,80, 20);
		f.add(l4);
		f.add(t4);
		
		l5.setBounds(10,140,80,20);
		t5.setBounds(100,140,80, 20);
		f.add(l5);
		f.add(t5);
		
		b1.setBounds(50,180,180,20);
		f.add(b1);
		
		b1.addActionListener(this);
		
		l6.setBounds(10,220,80,20);
		t6.setBounds(100,220,80, 20);
		f.add(l6);
		f.add(t6);
		
		l7.setBounds(10,250,80,20);
		t7.setBounds(100,250,80, 20);
		f.add(l7);
		f.add(t7);
		
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible 
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int a,b,c;
		a=Integer.parseInt(t3.getText());
		b=Integer.parseInt(t4.getText());
		c=Integer.parseInt(t5.getText());
		
		t6.setText((a+b+c)+"");
		
		if((a+b+c)>=250)
		{
			t7.setText("A");
		}
		else if ((a+b+c)>=200 && (a+b+c)<=250)
		{
			t7.setText("B");
		}
		else if  ((a+b+c)>=150 && (a+b+c)<=199)
		{
			t7.setText("C");
		}
		else
		{
			t7.setText("Sorry you Failed");
		}
	}
}



public class jg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myframe1 f1=new myframe1();
	}

}
