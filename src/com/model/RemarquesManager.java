package com.model;

import java.util.List;

import org.db.Remarques;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class RemarquesManager extends HibernateUtil{
	public Remarques add(int prof, String groupe, String remarque) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Remarques remarques = new Remarques(prof, groupe, remarque);
        session.save(remarques);
        session.getTransaction().commit();
        return remarques;
    }
    public Remarques delete(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Remarques remarques = (Remarques) session.load(Remarques.class, id);
        if(null != remarques) {
            session.delete(remarques);
        }
        session.getTransaction().commit();
        return remarques;
    }
 
    public List<Remarques> list(String groupe) {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Remarques> remarques = null;
        try {
             
            remarques = (List<Remarques>)session.createQuery("from Remarques where id_to='"+groupe+"'").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return remarques;
    }
}
