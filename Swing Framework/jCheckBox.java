import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class check implements ItemListener
{
	JLabel jl1,jl2,jl3;
	JCheckBox jc1,jc2;
	JPanel jp1;
	
	check()
	{
		JFrame f=new JFrame();
		jl1=new JLabel("Checkbox 1");
		jl2=new JLabel("Checkbox 2");
		jl3=new JLabel();
		jc1=new JCheckBox();
		jc2=new JCheckBox();
		
		jl1.setBounds(10,30,100,30);
		f.add(jl1);
		jl2.setBounds(10,70,100,30);
		f.add(jl2);
		jl3.setBounds(10,130,190,30);
		f.add(jl3);
		
		jc1.setBounds(90,30,100,30);
		jc1.addItemListener(this);
		f.add(jc1);
		jc2.setBounds(90,70,100,30);
		jc2.addItemListener(this);
		f.add(jc2);
		
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(jc1.isSelected())
		{
			jl3.setText("Checkbox 1 Selected");
		}
		if(jc2.isSelected())
		{
			jl3.setText("Checkbox 2 Selected");
		}
		
	}
}
public class jcb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		check c1=new check();
	}

}
