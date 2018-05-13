import java.awt.*;
import javax.swing.*;
public class FlowEx extends JApplet
{
	JButton b1;
	JTextField tf;
	FlowLayout fl;
	public void init()
	{
		setBackground(Color.red);
		fl=new FlowLayout(FlowLayout.RIGHT,20,20);
		setLayout(fl);
		b1=new JButton("ok");
		tf=new JTextField(20);
		add(b1);
		add(tf);
	}
}

/*
<Applet
	code="FlowEx.class"
	width="400"
	height="400">
</Applet>
*/	