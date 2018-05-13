import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class MyApp4 extends Applet
{
	String str;
	int x,y;
	public void init()
	{
		setBackground(Color.red);
		MyListener m=new MyListener();
		addMouseListener(m);
	}

	public void paint(Graphics g)
	{
		if(str!=null)
		{
			g.drawString(str,x,y);
		}
	}

	class MyListener extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent me)
		{
			x=me.getX();
			y=me.getY();
			str="welcome";
			repaint();
		}
	}
}

/*
<Applet
	code="MyApp4.class"
	width="400"
	height="400">
</Applet>
*/









