import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
public class lookandfeel extends JFrame implements ActionListener
{
	JToggleButton win;
	JToggleButton motif;
	JToggleButton metal;
	
	public  void actionPerformed(ActionEvent ae)
	{
	try
	{
		if(ae.getSource()==win)
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
}
else if(ae.getSource()==motif)
{
	UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}
else if(ae.getSource()==metal)
{
	UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
}		
}
catch(Exception ee)
{
}
SwingUtilities.updateComponentTreeUI(getContentPane());
}
public lookandfeel()
{
	buildCenterPanel();
	buildSouthPanel();
	buildwin();
}
public void buildCenterPanel()
{
	JPanel centerpanel=new JPanel();
	centerpanel.setLayout(new BoxLayout(centerpanel,BoxLayout.Y_AXIS));
	JButton bt=new JButton("This is a button");
	JSlider slider=new JSlider(JSlider.HORIZONTAL);
	JCheckBox checkbox=new JCheckBox("this is a checkbox");
	JScrollBar sb=new JScrollBar(JScrollBar.HORIZONTAL);
	JRadioButton rb=new JRadioButton("this is a radio button");
	centerpanel.add(bt);
	centerpanel.add(slider);
	centerpanel.add(checkbox);
	centerpanel.add(sb);
	centerpanel.add(rb);
	
	add(centerpanel);
}
public void buildSouthPanel()
{
	win=new JToggleButton("windows look and feel");
	motif=new JToggleButton("motif look and feel");
	metal=new JToggleButton("metal look and feel");
	
	ButtonGroup bg=new ButtonGroup();
	bg.add(win);
	bg.add(motif);
	bg.add(metal);

	win.addActionListener(this);
	motif.addActionListener(this);
	metal.addActionListener(this);

	JPanel holder=new JPanel();
	holder.add(win);
	holder.add(motif);
	holder.add(metal);

	add("South",holder);
}
public void buildwin()
{
	addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent w)
		{
			lookandfeel.this.dispose();
		}
	});
	setSize(400,400);
	setVisible(true);
}
public static void main(String args[])
{
	new lookandfeel();
}
}			