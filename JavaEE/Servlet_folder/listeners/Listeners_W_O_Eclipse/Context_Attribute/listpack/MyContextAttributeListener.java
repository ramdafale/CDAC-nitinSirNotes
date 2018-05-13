package listpack;

import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyContextAttributeListener implements ServletContextAttributeListener {

   

    public void attributeAdded(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("attribute added\n");

    	
    }

    public void attributeRemoved(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("attribute removed");
    }


    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("attribute replaced\t");
    }
	
}
