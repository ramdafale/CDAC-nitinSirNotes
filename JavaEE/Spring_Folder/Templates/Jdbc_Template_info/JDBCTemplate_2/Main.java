package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
	        CustomerDAO cd=(CustomerDAO)ac.getBean("customerDAO");
	        Customer c1=new Customer();
	        c1.setCustomerId(6);
	        c1.setCustomerName("Kanitkar");
	        c1.setAddress("Nagpur");
	        cd.insertCustomer(c1);
	        System.out.println("Now Retrieving");
	        Customer ref=cd.selectCustomer(6);
	        System.out.println("Customer is\t"+ref);
	        System.out.println("Done with NamedParameterJdbcTemplate");
	}
}
