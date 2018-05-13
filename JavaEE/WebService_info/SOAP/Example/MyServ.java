

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import mypack.HelloWorld;
import mypack.HelloWorldService;
import mypack.HelloWorldServiceLocator;

/**
 * Servlet implementation class MyServ
 */
@WebServlet("/MyServ")
public class MyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		HelloWorldServiceLocator service=new HelloWorldServiceLocator();
	 	HelloWorld hw=null;
		try {
			hw = service.getHelloWorld();
			pw.println("HelloWorld is   "+hw.getClass().getName());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<br><br><br>");
		pw.println(hw.sayHelloWorld("amar"));
	}

}
