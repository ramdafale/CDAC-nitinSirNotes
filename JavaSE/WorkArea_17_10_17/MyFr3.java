import java.awt.*;
public class MyFr3 extends Frame
{
	Button b1,b2;
	public MyFr3(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		b1=new Button("ok");
		b2=new Button("cancel");
		add(b1);
		add(b2);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new MyFr3("My Window");
	}
}	