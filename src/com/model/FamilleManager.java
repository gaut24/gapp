package com.model;
import java.util.ArrayList;
import java.util.List;

import org.db.Familles;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;
 
 
public class FamilleManager extends HibernateUtil {
 
    public Familles add(Familles familles) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(familles);
        session.getTransaction().commit();
        return familles;
    }
    public Familles delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Familles familles = (Familles) session.load(Familles.class, id);
        if(null != familles) {
            session.delete(familles);
        }
        session.getTransaction().commit();
        return familles;
    }
 
    public List<Familles> list() {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Familles> familles = null;
        try {
             
            familles = (List<Familles>)session.createQuery("from Familles").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return familles;
    }
}