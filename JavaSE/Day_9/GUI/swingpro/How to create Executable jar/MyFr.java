import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFr extends JFrame
{
	public MyFr(String str)
	{
		super(str);
		setBackground(Color.pink);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				dispose();
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new MyFr("My Window");
	}
}