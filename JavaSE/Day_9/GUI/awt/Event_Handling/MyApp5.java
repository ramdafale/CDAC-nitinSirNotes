import java.awt.*;
import java.awt.event.*;


public class MyApp5 extends Frame
{
	Button b,b1;
	public MyApp5()
	{
		setTitle("2 Buttons");
		setLayout(new FlowLayout());
		setBackground(Color.red);
		b=new Button("ok");
		b1=new Button("cancel");
		add(b);
		add(b1);
		addWindowListener(new MyListener());
		setSize(400,400);
		setVisible(true);
	}
	class MyListener extends WindowAdapter
	{
		@Override
		public void windowClosing(WindowEvent w)
		{
			dispose();
		}
	}
	public static void main(String args[])
	{
		new MyApp5();
	}
}











