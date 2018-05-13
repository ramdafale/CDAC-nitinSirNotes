import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class buttgroup extends JFrame
{
	public buttgroup()
	{
		setLayout(new GridLayout(3,1));
		buildrb();
		buildtb();
		buildcb();
		buildwin();
	}
	public void buildrb()
	{
		ButtonGroup bg=new ButtonGroup();
		JRadioButton b1=new JRadioButton("first");
		JRadioButton b2=new JRadioButton("second");
		JRadioButton b3=new JRadioButton("third");
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);

		add(p);
	}
	public void  buildtb()
	{
		ButtonGroup bg=new ButtonGroup();
		JToggleButton b1=new JToggleButton(new ImageIcon("cut.gif"));
		JToggleButton b2=new JToggleButton(new ImageIcon("copy.gif"));
		JToggleButton b3=new JToggleButton(new ImageIcon("small.gif"));
		/*bg.add(b1);
		bg.add(b2);
		bg.add(b3);*/
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);

		add(p);
	}
	public void buildcb()
	{
		ButtonGroup bg=new ButtonGroup();
		JCheckBox b1=new JCheckBox("java");
		JCheckBox b2=new JCheckBox("dot net");
		JCheckBox b3=new JCheckBox("VC");
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);

		add(p);
	}
	public void buildwin()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});
		pack();
		setVisible(true);
	}
	public static void main(String args[])
	{
		buttgroup bt=new buttgroup();
	}
}	
