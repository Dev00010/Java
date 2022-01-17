package jRadioButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calci implements ActionListener
{
	JLabel n1,n2,n3;
	JTextField nt1,nt2,nt3;
	JRadioButton rb1,rb2,rb3,rb4;
	JButton jb1;
	
	calci()
	{
		JFrame f=new JFrame();
		n1=new JLabel("Enter Number 1");
		n2=new JLabel("Enter Number 2");
		n3=new JLabel("Answer");
		
		nt1=new JTextField();
		nt2=new JTextField();
		nt3=new JTextField();
		
		rb1=new JRadioButton("Addition");
		rb2=new JRadioButton("Subtraction");
		rb3=new JRadioButton("Division");
		rb4=new JRadioButton("Multiplication");
		
		jb1=new JButton("Click to Get Answer");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		
		n1.setBounds(10,20,120,30);
		nt1.setBounds(120,20,80,30);
		f.add(n1);
		f.add(nt1);
		
		n2.setBounds(10,60,120,30);
		nt2.setBounds(120,60,80,30);
		f.add(n2);
		f.add(nt2);
		
		rb1.setBounds(10,110,130,30);
		f.add(rb1);
		rb2.setBounds(10,140,130,30);
		f.add(rb2);
		rb3.setBounds(10,170,130,30);
		f.add(rb3);
		rb4.setBounds(10,200,130,30);
		f.add(rb4);
		
		jb1.setBounds(80,230,150,30);
		f.add(jb1);
		jb1.addActionListener(this);
		
		n3.setBounds(70,270,80,30);
		nt3.setBounds(120,270,100,30);
		f.add(n3);
		f.add(nt3);
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
//		f.getContentPane().setBackground(Color.BLUE); // To Add Background Color
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double a,b;
		a=Double.parseDouble(nt1.getText());
		b=Double.parseDouble(nt2.getText());
		if(rb1.isSelected())
		{
			nt3.setText((a+b)+"");
		}
		if(rb2.isSelected())
		{
			nt3.setText((a-b)+"");
		}
		if(rb3.isSelected())
		{
			nt3.setText((a/b)+"");
		}
		if(rb4.isSelected())
		{
			nt3.setText((a*b)+"");
		}
	}
}
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calci c1=new calci();
	}

}
