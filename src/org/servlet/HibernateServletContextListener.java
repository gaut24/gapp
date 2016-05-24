package org.servlet;

import java.net.URL;
 
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateServletContextListener implements ServletContextListener {
	private Configuration config;
    private SessionFactory sf;
 
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        SessionFactory sf = (SessionFactory) sce.getServletContext().getAttribute("SessionFactory");
        sf.close();
    }
 
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        URL url = HibernateServletContextListener.class.getResource("/hibernate.cfg.xml");
        sf = config.buildSessionFactory();
        
        //save the Hibernate session factory into serlvet context
        sce.getServletContext().setAttribute("SessionFactory", sf);
        config = new Configuration().configure(url);
    }
 
}