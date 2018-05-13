package st1;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
public class DateCode extends SimpleTagSupport
{
	public void doTag()throws JspException,IOException
	{
		JspContext context=getJspContext();
		context.getOut().print(new Date());
		
	}
}