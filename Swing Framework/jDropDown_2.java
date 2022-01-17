import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class drop1 implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JButton b1;
	JTextField jtf1,jtf2;
	final Choice c;
	
	drop1()
	{
		JFrame f=new JFrame();
		l1=new JLabel("Select from drop down");
		l2=new JLabel("Enter Number 1");
		l3=new JLabel("Enter Number 2");
		l4=new JLabel();
		b1=new JButton("Click to select");
		jtf1=new JTextField();
		jtf2=new JTextField();
		c=new Choice();
		
		l1.setBounds(10,30,130,30);
		f.add(l1);
		
		c.setBounds(150,30,130,30);
		c.add("Addition");
		c.add("Subtraction");
		c.add("Division");
		c.add("Multiplication");
		f.add(c);
		
		l2.setBounds(10,70,100,30);
		jtf1.setBounds(120,70,100,30);
		f.add(l2);
		f.add(jtf1);
		
		l3.setBounds(10,110,100,30);
		jtf2.setBounds(120,110,100,30);
		f.add(l3);
		f.add(jtf2);
		
		b1.setBounds(80,160,150,30);
		f.add(b1);
		b1.addActionListener(this);
		
		l4.setBounds(50,190,220,30);
		f.add(l4);
		
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Double a=Double.parseDouble(jtf1.getText());
		Double b=Double.parseDouble(jtf2.getText());
		if(c.getSelectedIndex()==0)
		{
			String str="Your answer for "+(c.getItem(c.getSelectedIndex())+" is "+(a+b));
			l4.setText(str);
		}
		if(c.getSelectedIndex()==1)
		{
			String str="Your answer for "+(c.getItem(c.getSelectedIndex())+" is "+(a-b));
			l4.setText(str);
		}
		if(c.getSelectedIndex()==2)
		{
			String str="Your answer for "+(c.getItem(c.getSelectedIndex())+" is "+(a/b));
			l4.setText(str);
		}
		if(c.getSelectedIndex()==3)
		{
			String str="Your answer for "+(c.getItem(c.getSelectedIndex())+" is "+(a*b));
			l4.setText(str);
		}
		
	}
}
public class jdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		drop1 d1=new drop1();
	}

}
