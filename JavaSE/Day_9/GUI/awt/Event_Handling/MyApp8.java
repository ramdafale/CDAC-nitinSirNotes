import java.awt.*;
import java.awt.event.*;

public class MyApp8 extends Frame
{
	MenuBar mb;
	Menu mcolor;
	MenuItem mred,mblue,mpink;

	public MyApp8(String title)
	{
	super(title);
	mb=new MenuBar();
	mcolor=new Menu("Color");
	mred=new MenuItem("red");
	mblue=new MenuItem("blue");
	mpink=new MenuItem("pink");
	setMenuBar(mb);
	mb.add(mcolor);
	mcolor.add(mred);
	mcolor.add(mblue);
	mcolor.add(mpink);
	MyListener m=new MyListener();
	mred.addActionListener(m);
	mblue.addActionListener(m);
	mpink.addActionListener(m);
	addWindowListener(new WindowAdapter()
	{
		@Override
		public void windowClosing(WindowEvent w)
		{
			dispose();
		}
	});
	setSize(400,400);
	setVisible(true);
	}

	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==mred)
			{
				setBackground(Color.red);
			}
			else if(ae.getSource()==mblue)
			{
				setBackground(Color.blue);
			}
			else
			{
				setBackground(Color.pink);
			}
		}
	}

	public static void main(String args[])
	{
		new MyApp8("My Window");
	}
}
		
























