import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame
{
	JDialog dlg;
	JMenuBar mb;
	JMenu mfile;
	JMenuItem mopen;
	public MyFrame(String title)
	{
		super(title);
		dlg=new JDialog(this,"My Dialog",true);
		dlg.setSize(200,200);
		MyListener1 m1=new MyListener1();
		addWindowListener(m1);
		dlg.addWindowListener(m1);
		mb=new JMenuBar();
		setJMenuBar(mb);
		mfile=new JMenu("File");
		mopen=new JMenuItem("Open");
		mb.add(mfile);
		mfile.add(mopen);
		mopen.addActionListener(new MyListener2());
		setSize(400,400);
		setVisible(true);
	}
	class MyListener1 extends WindowAdapter
	{
		public void windowClosing(WindowEvent w)
		{
			((Window)w.getSource()).dispose();
		}
	}
	class MyListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			dlg.setVisible(true);
		}
	}
}

public class JDialogDemo
{
	public static void main(String args[])
	{
		new MyFrame("My Window");
	}
}
