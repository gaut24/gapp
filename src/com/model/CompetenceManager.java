package com.model;

import java.util.List;

import org.db.Competences;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;
 
 
public class CompetenceManager extends HibernateUtil {
 
    public Competences add(Competences competences) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(competences);
        session.getTransaction().commit();
        return competences;
    }
    public Competences delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Competences competences = (Competences) session.load(Competences.class, id);
        if(null != competences) {
            session.delete(competences);
        }
        session.getTransaction().commit();
        return competences;
    }
 
    public List<Competences> list() {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Competences> competences = null;
        try {
             
        	competences = (List<Competences>)session.createQuery("from Competences order by id_famille ASC").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return competences;
    }
}