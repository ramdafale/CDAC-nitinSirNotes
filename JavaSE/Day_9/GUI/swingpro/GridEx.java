import java.awt.*;
import javax.swing.*;
public class GridEx extends JApplet
{
	JButton b[]=new JButton[9];
	String arr[]={"one","two","three","four","five","six","seven","eight","nine"};
	public void init()
	{
		setLayout(new GridLayout(3,3));
		for(int i=0;i<arr.length;i++)
		{
			b[i]=new JButton(arr[i]);
			add(b[i]);
		}
	}
}

/*
<Applet
	code="GridEx.class"
	width="400"
	height="400">
</Applet>
*/	