package com.model;

import java.util.List;

import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class RolesManager extends HibernateUtil {
	public List<Personnes> list() {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Personnes> personnes = null;
        try {
             
        	personnes = (List<Personnes>)session.createQuery("from Personnes order by droit DESC").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return personnes;
    }
}
