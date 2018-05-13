package listpack;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


public class RequestEventListener implements ServletRequestListener {

      public RequestEventListener() {
        // TODO Auto-generated constructor stub
    }


    public void requestDestroyed(ServletRequestEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("request destroyed");
    }

    public void requestInitialized(ServletRequestEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("request initialized");
    }
	
}


