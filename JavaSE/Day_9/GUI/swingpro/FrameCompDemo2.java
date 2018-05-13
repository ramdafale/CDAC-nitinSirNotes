import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FrameCompDemo2 extends JFrame
{
	JButton b,b1;
	public FrameCompDemo2()
	{
		setTitle("2 Buttons");
		setLayout(new FlowLayout());
		setBackground(Color.red);
		b=new JButton("ok");
		b1=new JButton("cancel");
		add(b);
		add(b1);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				FrameCompDemo2.this.dispose();
			}
		});
		//setSize(400,400);
		pack();
		setVisible(true);
	}
	public static void main(String args[])
	{
		new FrameCompDemo2();
	}
}
	
