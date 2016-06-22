package com.model;

import java.util.List;
import java.util.Map;
import org.db.Deadlines;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import com.opensymphony.xwork2.ActionContext;
import com.dev.actions.HibernateUtil;

public class DeadlinesManager extends HibernateUtil {
	
	public Deadlines add(String nom, String groupe, String date) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Deadlines deadlines = new Deadlines(nom, groupe, date);
        session.save(deadlines);
        session.getTransaction().commit();
        return deadlines;
    }
    public Deadlines delete(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Deadlines deadlines = (Deadlines) session.load(Deadlines.class, id);
        if(null != deadlines) {
            session.delete(deadlines);
        }
        session.getTransaction().commit();
        return deadlines;
    }
 
    public List<Deadlines> list() {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Deadlines> deadlines = null;
        try {
             
            deadlines = (List<Deadlines>)session.createQuery("from Deadlines").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return deadlines;
    }
    
    public List<Deadlines> getDeadlinesByGroup() {
    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    	session.beginTransaction();
    	Map session2 = (Map) ActionContext.getContext().get("session");
    	String num_groupe = session2.get("groupe").toString();
    	System.out.println(num_groupe);
    	List<Deadlines> deadlinesbygroup = null;
    	try {
    		deadlinesbygroup = (List<Deadlines>)session.createQuery("select date_deadline, nom from Deadlines where num_groupe ='"+num_groupe+"' ORDER BY date_deadline").list();
    		System.out.println(deadlinesbygroup);
    	} catch (HibernateException e) {
    		e.printStackTrace();
    		session.getTransaction().rollback();
    	}
    	session.getTransaction().commit();
    	return deadlinesbygroup;
    }
}
