import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class MyApp1 extends Applet
{
	Button b1;
	String str;

	public void init()
	{
		setBackground(Color.red);
		b1=new Button("ok");
		add(b1);
		MyListener m=new MyListener();
		b1.addActionListener(m);
	}

	public void paint(Graphics g)
	{
		if(str!=null)
		{
			g.drawString(str,20,200);
		}
	}

	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			str=b1.getLabel();
			repaint();
		}
	}
}

/*
<Applet
	code="MyApp1.class"
	width="400"
	height="400">
</Applet>
*/









