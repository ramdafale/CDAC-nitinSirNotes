
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.tree.*;
import java.awt.event.*;
public class TreeDemo extends JFrame implements TreeSelectionListener
{
	String colname[]={"blue","cyan","darkgray","red"};
	Color col[]={Color.blue,Color.cyan,Color.darkGray,Color.red};
	String fontname[]={"TimesRoman","Dialog","SansSerif","Helvetica"};
	Font font[]={new Font("TimesRoman",Font.PLAIN,16),new Font("Dialog",Font.PLAIN,16),new Font("SansSerif",Font.PLAIN,16),new Font("Helvetica",Font.PLAIN,16)};
	
	Map<String,Object> map=new HashMap<String,Object>();
	JLabel lb=new JLabel("Watch me !",JLabel.CENTER);
	
	public void valueChanged(TreeSelectionEvent e)
	{
		try
		{
		TreePath path=e.getNewLeadSelectionPath();
		DefaultMutableTreeNode option=

(DefaultMutableTreeNode)path.getLastPathComponent();
		Object value=map.get((String)option.getUserObject());
		if(value instanceof Color)
		{
			Color c=(Color)value;
			lb.setForeground(c);
		}
		if(value instanceof Font)
		{
			Font font=(Font)value;
			lb.setFont(font);
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	public TreeDemo()
	{
		super("My Frame");
		for(int i=0;i<colname.length;i++)
		{
			map.put(colname[i],col[i]);
		}
		for(int i=0;i<fontname.length;i++)
		{
			map.put(fontname[i],font[i]);
		}
		buildtree();
		buildwin();
	}
	public void buildtree()
	{
		DefaultMutableTreeNode root=new 

DefaultMutableTreeNode("Label options");
		DefaultMutableTreeNode colorbranch=new 

DefaultMutableTreeNode("Colors");
		for(int i=0;i<colname.length;i++)
		{
			colorbranch.add(new 

DefaultMutableTreeNode(colname[i]));
		}
		DefaultMutableTreeNode fontbranch=new 

DefaultMutableTreeNode("fonts");
		for(int i=0;i<fontname.length;i++)
		{
			fontbranch.add(new DefaultMutableTreeNode

(fontname[i]));
		}
		root.add(colorbranch);
		root.add(fontbranch);
		JTree tree=new JTree(root);
		tree.addTreeSelectionListener(this);
		JPanel holder=new JPanel();
		holder.add(lb);
		add("South",holder);
		add(new JScrollPane(tree));
	}
	public void buildwin()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				TreeDemo.this.dispose();
			}
		});
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new TreeDemo();
	}
}










	

