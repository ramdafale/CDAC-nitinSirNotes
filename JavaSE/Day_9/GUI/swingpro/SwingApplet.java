import java.awt.*;
import javax.swing.*;
public class SwingApplet extends JApplet
{
	JButton b;
	JTextField tf;
	public void init()
	{
		setLayout(new FlowLayout());
		b=new JButton("swing button");
		tf=new JTextField(20);
		add(b);
		add(tf);
	}
}
/*
<Applet
	code="SwingApplet"
	width=400
	height=400>
</Applet>
*/