import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServ extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Welcome to Servlet world");
			pw.println("<br>");
			pw.println("have a good day");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}



