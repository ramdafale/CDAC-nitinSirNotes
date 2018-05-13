import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class THello extends JApplet
{
	public void init()
	{
		add(new JLabel("Hello! Swing world",new ImageIcon("computer.gif"),JLabel.CENTER));
}
public static void main(String args[])
{
	JFrame f=new JFrame("THello");
	THello app=new THello();
	app.init();
	f.add(app);
	f.addWindowListener(new WindowEventHandler());
	f.setSize(300,150);
	f.setVisible(true);
}
}
class WindowEventHandler extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		((Window)e.getSource()).dispose();
	}
}


/*
<Applet
	code="THello.class"
	width="400"
	height="400">
</Applet>
*/










