package org.servlet;

import java.net.URL;
 
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateServletContextListener implements ServletContextListener {
 
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        SessionFactory sf = (SessionFactory) sce.getServletContext().getAttribute("SessionFactory");
        sf.close();
    }
 
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        URL url = HibernateServletContextListener.class.getResource("/hibernate.cfg.xml");
        Configuration config = new Configuration();
        config.configure(url);
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        sce.getServletContext().setAttribute("SessionFactory", sf);
    }
 
}