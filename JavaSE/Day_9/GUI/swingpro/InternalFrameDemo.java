// JDesktopPane
// A container used to create a multiple-document interface or a virtual desktop. You create JInternalFrame objects and add them to the JDesktopPane

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.beans.*;
public class InternalFrameDemo extends JFrame
{
	Container con;
	JButton b1;
	JDesktopPane dt;
	JInternalFrame jif;
	static int framecount=1;
	static final int xoffset=25;
	static final int yoffset=25;
	public InternalFrameDemo()
	{
		super("My Frame");
		b1=new JButton("Click to add more internal frames");
		b1.addActionListener(new ButtonListener());
		add("South",b1);
		dt=new JDesktopPane();
		dt.setBackground(Color.pink);
		add(dt);
		adframe();
		addWindowListener(new WindowEventHandler());
		setSize(400,400);
		setVisible(true);
	}
	public void adframe()
	{

		jif=new JInternalFrame("internal frame "+(framecount++),true,true,true,true);
		jif.setLocation(xoffset*(framecount-2),yoffset*(framecount-2));
		jif.setSize(200,150);
		dt.add(jif);
		jif.setBackground(Color.green);
		jif.show();
		
	}
class ButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		adframe();
	}
}
class WindowEventHandler extends WindowAdapter
{
	public void windowClosing(WindowEvent w)
	{
		((Window)w.getSource()).dispose();
	}
}
public static void main(String args[])
{
	InternalFrameDemo a=new InternalFrameDemo();
}
}



	