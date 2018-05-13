import java.awt.*;
import java.applet.*;
public class DualCode extends Applet
{
	Button b1;
	public void init()
	{
		setBackground(Color.red);
		b1=new Button("ok");
		add(b1);
	}
	public static void main(String args[])
	{
		DualCode d=new DualCode();
		d.init();
		Frame f=new Frame("DualCode");
		f.add(d);
		f.setSize(400,400);
		f.setVisible(true);
	}
}
	