import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MyCard extends Applet
{
	Panel p1,p2,p3,p4;
	CardLayout cl;
	public void init()
	{
		cl=new CardLayout();
		setLayout(cl);
		p1=new Panel();
		p1.setBackground(Color.red);
		p1.add(new Label("Panel 1"));
		p2=new Panel();
		p2.setBackground(Color.blue);
		p2.add(new Label("Panel 2"));
		p3=new Panel();
		p3.setBackground(Color.pink);
		p3.add(new Label("Panel 3"));
		p4=new Panel();
		p4.setBackground(Color.green);
		p4.add(new Label("Panel 4"));

		add(p1,"first");
		add(p2,"second");
		add(p3,"third");
		add(p4,"fourth");
		
		MyList3 m=new MyList3();
		p1.addMouseListener(m);
		p2.addMouseListener(m);
		p3.addMouseListener(m);
		p4.addMouseListener(m);
	}
	class MyList3 extends MouseAdapter
	{
		public void mouseClicked(MouseEvent m)
		{
			cl.next(MyCard.this);
		}
	}
}
		
/*
<Applet
	code="MyCard.class"
	width=400
	height=400>
</Applet>
*/