package com.model;

import java.util.List;

import org.db.Deadlines;
import org.db.Familles;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class DeadlinesManager extends HibernateUtil {
 
    public Deadlines add(Deadlines deadlines) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(deadlines);
        session.getTransaction().commit();
        return deadlines;
    }
    public Deadlines delete(Long id) {
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
}
