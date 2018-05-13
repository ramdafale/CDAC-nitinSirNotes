import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class toolbar extends JFrame
{
	JToolBar tb=new JToolBar();
	String []icons={"new.gif","open.gif","save.gif","cut.gif","copy.gif","paste.gif"};
	String btlabl[]={"new","open","save","cut","copy","paste"};
	ImageIcon []ic=new ImageIcon[icons.length];
	JButton bt[]=new JButton[btlabl.length];
	JMenuBar mb=new JMenuBar();
	JMenu mfile=new JMenu("file");
	JMenuItem mexit=new JMenuItem("exit");
	public toolbar()
	{
		super("My Frame");
		mfile.add(mexit);
		setJMenuBar(mb);
		mb.add(mfile);
		mexit.addActionListener(new mylistener());
		setLayout(new BorderLayout());
		for(int i=0;i<btlabl.length;i++)
		{
			ic[i]=new ImageIcon(icons[i]);
			bt[i]=new JButton(btlabl[i],ic[i]);
			bt[i].setToolTipText(btlabl[i]);
			if(i==3)
			{
				tb.addSeparator();
			}
			tb.add(bt[i]);
		}
		add("North",tb);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
((Window)w.getSource()).dispose();
			}
		});
		setSize(400,400);
		setVisible(true);
	}
	class mylistener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			dispose();
		}
	}
	public static void main(String args[])
	{
		toolbar tt=new toolbar();	
	}
}
		
