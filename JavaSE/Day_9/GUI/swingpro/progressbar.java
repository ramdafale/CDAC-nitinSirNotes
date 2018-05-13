import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class progressbar extends JApplet
{
	JButton start;
	JProgressBar pbar;
	JTextField tf;
	Timer timer=null;
	int i=0;
	public void init()
	{
		setLayout(new GridLayout(3,1));
		start=new JButton("Start");
		start.addActionListener(new Mylistener());
		add(start);
		pbar=new JProgressBar();
		
		Border border=BorderFactory.createLineBorder(Color.red,2);
		pbar.setBorder(border);
		pbar.setBackground(Color.white);
		pbar.setForeground(Color.blue);
		pbar.setMinimum(0);
		pbar.setMaximum(500);
		add(pbar);
		tf=new JTextField(20);
		add(tf);
		timer=new Timer(30,new Timelistener());
	}
	class Mylistener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			timer.start();
		}
	}
	class Timelistener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			i++;
			tf.setText(Integer.toString(i));
			pbar.setValue(i);
			if(i >= pbar.getMaximum())
			{
				timer.stop();
				i=0;
			}
		}
	}
}
/*
<Applet
code="progressbar.class"
width=400
height=400>
</Applet>
*/
