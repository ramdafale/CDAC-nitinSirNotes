import java.awt.*;
import java.applet.*;
public class GridEx extends Applet
{
	Button b[]=new Button[9];
	String arr[]={"one","two","three","four","five","six","seven","eight","nine"};
	public void init()
	{
		setLayout(new GridLayout(3,3));
		for(int i=0;i<arr.length;i++)
		{
			b[i]=new Button(arr[i]);
			add(b[i]);
		}
	}
}
	