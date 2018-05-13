import java.awt.*;
import java.applet.*;
public class BorderEx extends Applet
{
	Scrollbar sb1,sb2,sb3,sb4;
	TextArea ta;
	public void init()
	{
		setLayout(new BorderLayout());
		sb1=new Scrollbar(Scrollbar.HORIZONTAL);
		sb2=new Scrollbar(Scrollbar.HORIZONTAL);
		sb3=new Scrollbar(Scrollbar.VERTICAL);
		sb4=new Scrollbar(Scrollbar.VERTICAL);
		ta=new TextArea(5,30);
		add("North",sb1);
		add(sb2,BorderLayout.SOUTH);
		add("East",sb3);
		add(sb4,BorderLayout.WEST);
		add("Center",ta);
	}
}

