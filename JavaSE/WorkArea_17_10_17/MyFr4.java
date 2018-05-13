import java.awt.*;
public class MyFr4
{
	Frame fr;
	Button b1,b2;
	public MyFr4(String title)
	{
		fr=new Frame(title);
		fr.setLayout(new FlowLayout());
		b1=new Button("ok");
		b2=new Button("cancel");
		fr.add(b1);
		fr.add(b2);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public static void main(String args[])
	{
		new MyFr4("My Window");
	}
}		