import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyCard extends JApplet
{
	JPanel p1,p2,p3,p4;
	CardLayout cl;
	public void init()
	{
		cl=new CardLayout();
		setLayout(cl);
		p1=new JPanel();
		p1.setBackground(Color.red);
		p1.add(new JLabel("JPanel 1"));
		p2=new JPanel();
		p2.setBackground(Color.blue);
		p2.add(new JLabel("JPanel 2"));
		p3=new JPanel();
		p3.setBackground(Color.pink);
		p3.add(new JLabel("JPanel 3"));
		p4=new JPanel();
		p4.setBackground(Color.green);
		p4.add(new JLabel("JPanel 4"));

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
			cl.next(getContentPane());
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