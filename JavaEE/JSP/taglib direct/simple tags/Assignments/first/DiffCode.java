package st1;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.*;
import javax.servlet.jsp.*;
public class DiffCode extends SimpleTagSupport
{
	private String first;
	private String second;
	public void setFirst(String first)
	{
		this.first=first;
	}
	public String getFirst()
	{
		return first;
	}
	public void setSecond(String second)
	{
		this.second=second;
	}
	public String getSecond()
	{
		return second;
	}
	public void doTag()throws JspException,IOException
	{
		JspContext context=getJspContext();
		int result= Integer.parseInt(getFirst())- Integer.parseInt(getSecond());
context.getOut().print(result);
		
	}
}