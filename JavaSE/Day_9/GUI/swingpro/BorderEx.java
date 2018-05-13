import java.awt.*;
import javax.swing.*;
public class BorderEx extends JApplet
{
	JScrollBar sb1,sb2,sb3,sb4;
	JTextArea ta;
	public void init()
	{
		setLayout(new BorderLayout());
		sb1=new JScrollBar(JScrollBar.HORIZONTAL);
		sb2=new JScrollBar(JScrollBar.HORIZONTAL);
		sb3=new JScrollBar(JScrollBar.VERTICAL);
		sb4=new JScrollBar(JScrollBar.VERTICAL);
		ta=new JTextArea(5,30);
		add("North",sb1);
		add(sb2,BorderLayout.SOUTH);
		add("East",sb3);
		add(sb4,BorderLayout.WEST);
		add("Center",ta);
	}
}

/*
<Applet
	code="BorderEx.class"
	width="400"
	height="400">
</Applet>
*/	