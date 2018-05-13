package listpack;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


public class MyContextListener implements ServletContextListener {

   
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }


    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("context destroyed");
    }


    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("context initialized");
		ServletContext sc=arg0.getServletContext();
		sc.setAttribute("user","scott");
    }
	
}
