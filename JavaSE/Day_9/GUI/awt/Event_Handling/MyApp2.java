import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class MyApp2 extends Applet
{
	Button b1,b2;
	String str;

	public void init()
	{
		setBackground(Color.red);
		b1=new Button("ok");
		b2=new Button("cancel");
		add(b1);
		add(b2);
		MyListener m=new MyListener();
		b1.addActionListener(m);
		b2.addActionListener(m);
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
			str=((Button)ae.getSource()).getLabel();
			repaint();
		}
	}
}

/*
<Applet
	code="MyApp2.class"
	width="400"
	height="400">
</Applet>
*/









