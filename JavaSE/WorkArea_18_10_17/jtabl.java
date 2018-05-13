import javax.swing.*;
import java.awt.*;
public class jtabl extends JApplet
{
	String []col={"Name","Size","Date","Directory"};
	Object [][] row={{"abc.txt","125","09-11-90",new Boolean(false)},	{"xyz.txt","125","09-11-90",new Boolean(true)},{"pqr.txt","125","09-11-90",new Boolean(false)},{"lmn.txt","125","09-11-90",new Boolean(true)}};
	public void init()
	{
		JTable table=new JTable(row,col);
		add(table.getTableHeader(),BorderLayout.NORTH);
		add(table);
	}
}
/*
<Applet
	code="jtabl.class"
	width=400
	height=400>
</Applet>
*/





