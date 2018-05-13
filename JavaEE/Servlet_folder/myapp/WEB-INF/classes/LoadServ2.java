import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoadServ2 extends HttpServlet
{
	static
	{
		System.out.println("inside LoadServ2 static block");
	}

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Welcome to LoadServ2");
			pw.println("<br>");
			pw.println("have a good day");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}



