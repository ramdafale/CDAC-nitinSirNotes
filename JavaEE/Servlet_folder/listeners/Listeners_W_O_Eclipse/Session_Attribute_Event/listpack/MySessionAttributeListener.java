package listpack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class MySessionAttributeListener implements HttpSessionAttributeListener {

  
    public MySessionAttributeListener() {
        // TODO Auto-generated constructor stub
    }


    public void attributeAdded(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("inside attributeAdded method");
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("inside attributeRemoved method");
    }


    public void attributeReplaced(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("inside attributeReplaced method");
    }
	
}
