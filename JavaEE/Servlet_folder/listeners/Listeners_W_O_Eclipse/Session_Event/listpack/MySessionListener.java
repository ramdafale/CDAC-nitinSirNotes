package listpack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MySessionListener implements HttpSessionListener {

    public MySessionListener() {
        // TODO Auto-generated constructor stub
    }


    public void sessionCreated(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("inside session created method");
    }


    public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("inside session destroyed method");
    }
	
}
