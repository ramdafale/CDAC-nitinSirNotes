import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class tabpan extends JApplet
{
	JTabbedPane tb;
	String []pict={"orbdns.gif","aservice.gif","computer.gif"};
	String []tips={"orbdns","aservice","computer"};
	public void init()
	{
		tb=new JTabbedPane(JTabbedPane.TOP);
		tb.addChangeListener(new Tablistener());
		for(int i=0;i<pict.length;i++)
		{
			JLabel lb=new JLabel(new ImageIcon(pict[i]));
			tb.addTab("pict-"+(i+1),new ImageIcon("smile.gif"),lb,tips[i]);
		}
		add(tb);
	}
	class Tablistener implements ChangeListener
	{
		int selectedindex=-1;
		public void stateChanged(ChangeEvent c)
		{
			if(selectedindex==-1 || selectedindex!=tb.getSelectedIndex())
{
	tb.setEnabledAt(tb.getSelectedIndex(),false);

if(selectedindex !=-1)
{
	tb.setEnabledAt(selectedindex,true);
}	
}
selectedindex=tb.getSelectedIndex();
}
}
}
	
/*
<Applet
code="tabpan.class"
width=400
height=400>
</Applet>
*/