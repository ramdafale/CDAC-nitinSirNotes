import java.awt.*;
import java.awt.event.*;
public class MyApp7
{
	Button b;
	public MyApp7()
	{
		Frame f=new Frame("My Frame");
		f.setLayout(new FlowLayout());
		f.setBackground(Color.red);
		b=new Button("ok");
		f.add(b);
		f.addWindowListener(new WindowAdapter()
		{
			@Override
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
		new MyApp7();
	}
}
	
