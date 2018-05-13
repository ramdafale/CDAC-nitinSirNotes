import java.awt.*;
public class FrameCompDemo1
{
	Button b;
	public FrameCompDemo1()
	{
		Frame f=new Frame("My Frame");
		f.setLayout(new FlowLayout());
		f.setBackground(Color.red);
		b=new Button("ok");
		f.add(b);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new FrameCompDemo1();
	}
}
	
