package st1;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.*;
import javax.servlet.jsp.*;
public class Convert extends SimpleTagSupport
{
	private String val;
	public void setVal(String val)
	{
		this.val=val;
	}
	public String getVal()
	{
		return val;
	}
	public void doTag()throws JspException,IOException
	{
		JspContext context=getJspContext();
		char ch[]=val.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				ch[i]+=32;
			}
			else if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]-=32;
			}
		}
		String ptr=new String(ch);
context.getOut().print(ptr);
		
	}
}