import java.awt.*;
import java.applet.*;
public class FlowEx extends Applet
{
	Button b1;
	TextField tf;
	FlowLayout fl;
	public void init()
	{
		setBackground(Color.red);
		fl=new FlowLayout(FlowLayout.RIGHT,20,20);
		setLayout(fl);
		b1=new Button("ok");
		tf=new TextField(20);
		add(b1);
		add(tf);
	}
}
