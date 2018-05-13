import java.awt.*;
import java.applet.*;
public class MyApp1 extends Applet
{
	Scrollbar s1,s2,s3,s4;
	TextArea ta;
	public void init()
	{
		setLayout(new BorderLayout());
		s1=new Scrollbar(Scrollbar.HORIZONTAL);
		s2=new Scrollbar(Scrollbar.HORIZONTAL);
		s3=new Scrollbar(Scrollbar.VERTICAL);
		s4=new Scrollbar(Scrollbar.VERTICAL);
		ta=new TextArea(5,30);
		add("North",s1);
		add(s2,BorderLayout.SOUTH);
		add("West",s3);
		add(s4,BorderLayout.EAST);
		add(ta); // by default center, so no need to specify
	}
}