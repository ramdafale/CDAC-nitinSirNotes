import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Optionpanedemo extends JFrame implements ActionListener
{
	JButton b;
	public Optionpanedemo(String a)
	{
		super(a);
		b=new JButton("show");
		setLayout(new FlowLayout());
		add(b);
		b.addActionListener(this);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showConfirmDialog(this,"are you sure");
		//JOptionPane.showInputDialog(this,"Enter a file name");
//JOptionPane.showMessageDialog(this,"saving your contents");
	}
	public static void main(String args[])
	{
		new Optionpanedemo("My Win");
	}
}	






	