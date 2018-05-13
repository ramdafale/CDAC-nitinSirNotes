import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFr extends JFrame
{

JMenuBar mb;
JMenu mcolor;
JMenuItem mred,mblue,mpink;

public MyFr(String title)
{
	super(title);
	mb=new JMenuBar();
	mcolor=new JMenu("Color");
	mred=new JMenuItem("red");
	mblue=new JMenuItem("blue");
	mpink=new JMenuItem("pink");
	setJMenuBar(mb);
	mb.add(mcolor);
	mcolor.add(mred);
	mcolor.add(mblue);
	mcolor.add(mpink);
	addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent w)
		{
			dispose();
		}
	});
	MyListener m=new MyListener();
	mred.addActionListener(m);
	mblue.addActionListener(m);
	mpink.addActionListener(m);
	setSize(400,400);
	setVisible(true);
  }
class MyListener implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mred)
		{
	getContentPane().setBackground(Color.red);
		}
		else if(ae.getSource()==mblue)
		{
			getContentPane().setBackground(Color.blue);
		}
		else 
		{
			getContentPane().setBackground(Color.pink);
		}
	}
}
public static void main(String args[])
{
	new MyFr("My Window");
}
}
