import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class progressmonitor 
{
	static ProgressMonitorInputStream pmi;
	static JFrame fr;
	public static void main(String args[])
	{
		fr=new JFrame("my frame");
		fr.setSize(400,400);
		fr.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				fr.dispose();
			}
		});
		fr.setVisible(true);
		try
		{
			File f=new File(args[0]);
			FileInputStream input=new FileInputStream(f);
			pmi=new ProgressMonitorInputStream(fr,"Reading file :"+args[0],input);
			int ch;
			while((ch=pmi.read())!=-1)
			{
				System.out.print((char)ch);
			
				try
				{
					Thread.sleep(10);
				}
				catch(InterruptedException ii)
				{
				}
			}
			pmi.close();
		}
		catch(Exception ee)
		{
		}
	}
}
						