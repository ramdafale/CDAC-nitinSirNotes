import java.awt.*;
import java.awt.event.*;


public class MyApp6 extends Frame
{
	Button b,b1;
	public MyApp6()
	{
		setTitle("My Window");
		setLayout(new FlowLayout());
		setBackground(Color.red);
		b=new Button("ok");
		b1=new Button("cancel");
		add(b);
		add(b1);
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
	
	public static void main(String args[])
	{
		new MyApp6();
	}
}











