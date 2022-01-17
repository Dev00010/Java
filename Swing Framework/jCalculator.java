import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calc implements ActionListener
{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,div,mult,equal;
	JTextField tnum;
	int no1,no2;
	String op;
	calc()
	{
		JFrame f=new JFrame();
		
//		Button create
		add=new JButton("+");
		sub=new JButton("-");
		div=new JButton("/");
		mult=new JButton("X");
		equal=new JButton("=");
		b0=new JButton("9");
		b1=new JButton("8");
		b2=new JButton("7");
		b3=new JButton("6");
		b4=new JButton("5");
		b5=new JButton("4");
		b6=new JButton("3");
		b7=new JButton("2");
		b8=new JButton("1");
		b9=new JButton("0");
		
//		Text Field Create
		tnum=new JTextField();
		
//		Set Bounds
		tnum.setBounds(10,20,320,60);
		b0.setBounds(10,100,70,40);
		b1.setBounds(90,100,70,40);
		b2.setBounds(170,100,70,40);
		add.setBounds(250,100,70,40);
		
		b3.setBounds(10,150,70,40);
		b4.setBounds(90,150,70,40);
		b5.setBounds(170,150,70,40);
		sub.setBounds(250,150,70,40);
		
		b6.setBounds(10,200,70,40);
		b7.setBounds(90,200,70,40);
		b8.setBounds(170,200,70,40);
		div.setBounds(250,200,70,40);
		
		b9.setBounds(50,250,70,40);
		mult.setBounds(130,250,70,40);
		equal.setBounds(210,250,70,40);
		
//		Action Listeners
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		add.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		equal.addActionListener(this);

//		ADDITION TO FRAME
		f.add(tnum);
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(add);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(sub);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(div);
		f.add(b9);
		f.add(mult);
		f.add(equal);
		
		
		f.setSize(360,370);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String strbutton1=e.getActionCommand();
		if(strbutton1.equals("0") || strbutton1.equals("1") || strbutton1.equals("2") ||  strbutton1.equals("3") || strbutton1.equals("4") || strbutton1.equals("5") || strbutton1.equals("6") || strbutton1.equals("7") || strbutton1.equals("8") || strbutton1.equals("9"))
		{
			String str1=tnum.getText();
			tnum.setText(str1 + strbutton1);
		}
	
		
		if(strbutton1.equals("+") || strbutton1.equals("-") || strbutton1.equals("X") ||  strbutton1.equals("/"))
		{
			no1= Integer.parseInt(tnum.getText());
			tnum.setText("");
			
			op=strbutton1;
		}
		
		//equals
		
		if(strbutton1.equals("="))
		{
			no2=Integer.parseInt(tnum.getText());
			tnum.setText("");
			if(op=="+")
			{
				tnum.setText((no1+no2)+"");
			}
			else if(op=="-")
			{
				tnum.setText((no1-no2)+"");
			}
			else if(op=="X")
			{
				tnum.setText((no1*no2)+"");
			}
			else if(op=="/")
			{
				tnum.setText((no1/no2)+"");
			}
		}
		
		
		
	}
}

public class jc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calc c1=new calc();
	}

}
