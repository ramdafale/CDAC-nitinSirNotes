import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
	Dialog dlg;
	MenuBar mb;
	Menu mfile;
	MenuItem mopen;
	public MyFrame(String title)
	{
		super(title);
		dlg=new Dialog(this,"My Dialog",true);
		dlg.setSize(200,200);
		MyListener1 m1=new MyListener1();
		addWindowListener(m1);
		dlg.addWindowListener(m1);
		mb=new MenuBar();
		setMenuBar(mb);
		mfile=new Menu("File");
		mopen=new MenuItem("Open");
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

public class DialogDemo
{
	public static void main(String args[])
	{
		new MyFrame("My Window");
	}
}
