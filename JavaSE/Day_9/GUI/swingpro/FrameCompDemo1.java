import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FrameCompDemo1
{
	JButton b;
	public FrameCompDemo1()
	{
		JFrame f=new JFrame("My Frame");
		f.setLayout(new FlowLayout());
		f.setBackground(Color.red);
		b=new JButton("ok");
		f.add(b);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				f.dispose();
			}
		});
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new FrameCompDemo1();
	}
}
	
