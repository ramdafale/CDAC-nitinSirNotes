import java.awt.*;
public class FrameCompDemo2 extends Frame
{
	Button b,b1;
	public FrameCompDemo2()
	{
		setTitle("2 Buttons");
		setLayout(new FlowLayout());
		setBackground(Color.red);
		b=new Button("ok");
		b1=new Button("cancel");
		add(b);
		add(b1);
		//setSize(400,400);
		pack();
		setVisible(true);
	}
	public static void main(String args[])
	{
		new FrameCompDemo2();
	}
}
	
