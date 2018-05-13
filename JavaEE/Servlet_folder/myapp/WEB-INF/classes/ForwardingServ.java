import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ForwardingServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
		ServletContext sc=getServletContext();
			RequestDispatcher rd=sc.getRequestDispatcher("/ForwardedServ");
			rd.forward(request,response);
					
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}
}










