import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class MyApp3 extends Applet
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

	class MyListener implements MouseListener
	{
		public void mouseClicked(MouseEvent me)
		{
			x=me.getX();
			y=me.getY();
			str="hello";
			repaint();
		}
		public void mousePressed(MouseEvent me)
		{
		}
		public void mouseEntered(MouseEvent me)
		{
		}
		public void mouseExited(MouseEvent me)
		{
		}
		public void mouseReleased(MouseEvent me)
		{
		}
	}
}

/*
<Applet
	code="MyApp3.class"
	width="400"
	height="400">
</Applet>
*/









