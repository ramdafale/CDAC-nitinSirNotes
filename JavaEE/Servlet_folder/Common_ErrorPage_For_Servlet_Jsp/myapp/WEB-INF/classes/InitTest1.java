import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class InitTest1 extends HttpServlet
{
	
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
		pw.println("Without overriding init");
		pw.println("Config parameter value  "+getServletConfig().getInitParameter("user"));
		pw.println("<br>");
		pw.println("Context parameter value   "+getServletContext().getInitParameter("driver"));
		
	}
}
		

		