package listpack;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;


public class RequestAttributeListener implements ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public RequestAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("inside attributeRemoved");
    }

	
    public void attributeAdded(ServletRequestAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("inside attributeadded");
    }

    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("inside attributeReplaced");
    }
	
}
