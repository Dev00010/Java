package jGUI;
import javax.swing.*; //Swing is a framework to develop GUI Application
import java.awt.*;
import java.awt.event.*;


class myframe1 implements ActionListener
{
	JLabel lblno;
	JLabel lblans;
	JTextField txtno,txtans;
	JButton btnans;
	
	myframe1()
	{
		JFrame f=new JFrame();//creating instance of JFrame  
	    
		
		lblno=new JLabel("No");
		lblans=new JLabel("Ans");
		
		txtno= new JTextField();
		txtans= new JTextField();
		
		
		btnans=new JButton("click");//creating instance of JButton  
		
		
		lblno.setBounds(10,20,100, 40);
		txtno.setBounds(50,20,100, 40);
		
		btnans.setBounds(10,70,100, 40);//x axis, y axis, width, height  
		
		lblans.setBounds(10,130,100, 40);
		txtans.setBounds(50,130,100, 40);
		
		btnans.addActionListener(this);
		
		f.add(lblno);
		f.add(txtno);
		f.add(lblans);
		f.add(txtans);
		
		f.add(btnans);//adding button in JFrame  
		     
		f.setSize(300,300);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		int no;
		no=Integer.parseInt(txtno.getText());
		
		txtans.setText((no*no)+"");
		
	}
}
public class JG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myframe1 f1=new myframe1();
	}

}
