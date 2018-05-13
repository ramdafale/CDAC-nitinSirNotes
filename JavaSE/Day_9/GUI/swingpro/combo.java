import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class combo extends JApplet
{
	JComboBox cb;
	String []val={"Australia","England","West Indies","Pakistan","Srilanka","South Africa"};
	String defval="India";
	public void init()
	{
		setLayout(new GridLayout(1,2));
		cb=new JComboBox(val);
		cb.setEditable(true);
		cb.configureEditor(cb.getEditor(),defval);
		cb.setMaximumRowCount(5);
		ComboBoxEditor cbeditor=cb.getEditor();
		Component editcomp=cbeditor.getEditorComponent();
		editcomp.setBackground(Color.white);
		editcomp.setForeground(Color.blue);
		Font f1=new Font("Dialog",Font.PLAIN,16);
		editcomp.setFont(f1);
		cb.setFont(f1);
		cb.addActionListener(new cboxlistener());
		JLabel lb=new JLabel("Enter a country :",JLabel.CENTER);
		lb.setFont(new Font("SansSerif",Font.BOLD,18));
		JPanel p1=new JPanel();
		p1.add(lb);
		add(p1);
		JPanel p=new JPanel();
		p.add(cb);
		add(p);
	}
	class cboxlistener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			boolean flag=false;
			for(int i=0;i<cb.getItemCount();i++)
			{
			if(cb.getItemAt(i).equals(cb.getSelectedItem()))
			{
				flag=true;
				break;
			}
			}
			if(!flag)
			{
				cb.insertItemAt(cb.getSelectedItem(),0);
				flag=false;
			}
		}
	}
}
/*
<Applet
code="combo.class"
width=400
height=400>
</Applet>
*/				