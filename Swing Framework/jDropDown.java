import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class drop implements ActionListener
{
	JLabel l1,l2;
	JButton b1;
	final Choice c;
	
	drop()
	{
		JFrame f=new JFrame();
		l1=new JLabel("Select from drop down");
		l2=new JLabel();
		b1=new JButton("Click to select");
		c=new Choice();
		
		l1.setBounds(10,30,130,30);
		f.add(l1);
		
		c.setBounds(150,30,130,30);
		c.add("C");
		c.add("C++");
		c.add("Python");
		c.add("Java");
		f.add(c);
		
		b1.setBounds(80,70,150,30);
		f.add(b1);
		b1.addActionListener(this);
		
		l2.setBounds(80,110,190,30);
		f.add(l2);
		
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String str="You have selected: "+c.getItem(c.getSelectedIndex());
		l2.setText(str);
	}
}
public class jdd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		drop d1=new drop();
	}

}
