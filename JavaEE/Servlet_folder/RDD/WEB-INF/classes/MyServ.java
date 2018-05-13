import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServ extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
		PrintWriter pw=response.getWriter();
		pw.println("inside MyServ of RDD");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}



