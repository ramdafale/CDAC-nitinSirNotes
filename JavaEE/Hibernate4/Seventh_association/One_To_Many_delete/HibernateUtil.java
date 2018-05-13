package mypack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
    private static final SessionFactory sessionFactory; 
   static { 
        try { 
        	Configuration cfg = new Configuration();
        	cfg.configure();

        	ServiceRegistryBuilder builder = new ServiceRegistryBuilder();
        	builder.applySettings(cfg.getProperties());
        	ServiceRegistry sr = builder.buildServiceRegistry();
        	sessionFactory=cfg.buildSessionFactory(sr);
            
        } catch (Throwable ex) { 
            System.err.println("Initial SessionFactory creation failed." + ex); 
            throw new ExceptionInInitializerError(ex); 
        } 
    } 
  
    public static SessionFactory getSessionFactory() { 
        return sessionFactory; 
    } 
}











