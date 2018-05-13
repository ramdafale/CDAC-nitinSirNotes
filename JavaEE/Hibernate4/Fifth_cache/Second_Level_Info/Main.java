package mypack;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
	    
			Session session=HibernateUtil.getSessionFactory().openSession();
			Product p=new Product();
			p.setName("soap");
			p.setPrice(100);
			p.setQty(30);
			Transaction trans=session.beginTransaction();
			session.save(p);
			trans.commit();
			session.close();
			    Session session1=HibernateUtil.getSessionFactory().openSession();  
			    Product emp2=(Product)session1.load(Product.class,1);  
			   
			    System.out.println(emp2);
			    session1.close();  
			    
	            System.out.println(HibernateUtil.getSessionFactory().getStatistics().getSecondLevelCacheHitCount()); //Prints 0
			      
		    Session session2=HibernateUtil.getSessionFactory().openSession();  
			    Product emp3=(Product)session2.load(Product.class,1);  
			
			    System.out.println(emp3);
			    session2.close();  
			    
	            System.out.println(HibernateUtil.getSessionFactory().getStatistics().getSecondLevelCacheHitCount()); //Prints 1

             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}