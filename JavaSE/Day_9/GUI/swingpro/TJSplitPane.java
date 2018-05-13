import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TJSplitPane extends JApplet
{
	Icon i1=new ImageIcon("orbdns.gif");
	Icon i2=new ImageIcon("aservice.gif");
	Icon i3=new ImageIcon("computer.gif");
	public void init()
	{
		JLabel lb1=new JLabel(i1);
		JScrollPane topleft=new JScrollPane(lb1);
		JLabel lb2=new JLabel(i2);
		JScrollPane bottomleft=new JScrollPane(lb2);
		JLabel lb3=new JLabel(i3);
		JScrollPane right=new JScrollPane(lb3);
	
		JSplitPane sp1=new JSplitPane(JSplitPane.VERTICAL_SPLIT,true,topleft,bottomleft);
sp1.setDividerLocation(100);
		JSplitPane sp2=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,sp1,right);
sp2.setDividerLocation(200);
add(sp2);
}
}
/*
<Applet
code="TJSplitPane.class"
width=400
height=400>
</Applet>
*/