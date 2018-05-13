package listpack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;




public class MyClass implements HttpSessionBindingListener {

   
    public MyClass() {
        // TODO Auto-generated constructor stub
    }


    public void valueBound(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("value bound");
			
    }


    public void valueUnbound(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("value unbound");
		
    }
	
}




