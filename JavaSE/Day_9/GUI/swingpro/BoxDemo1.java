import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BoxDemo1 extends JFrame
{
	JButton b[]=new JButton[4];
	String lab[]={"one","two","three","four"};
	Box bx;
	public BoxDemo1()
	{
		setTitle("My box layout win");
		bx=new Box(BoxLayout.X_AXIS);
		add(bx);
		for(int i=0;i<b.length;i++)
		{
			b[i]=new JButton(lab[2]);
			b[i].setAlignmentY(Component.CENTER_ALIGNMENT); 
			bx.add(b[i]);
			bx.add(Box.createHorizontalGlue());
			//bx.add(Box.createHorizontalStrut(10));
		}
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				BoxDemo1.this.dispose();
			}
		});
	
		setSize(400,400);
		setVisible(true);
	}
	
		
	public static void main(String args[])
	{
		BoxDemo1 ob=new BoxDemo1();
	}
}