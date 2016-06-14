package com.model;
import java.util.ArrayList;
import java.util.List;

import org.db.Abscences;
import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;
 
 
public class AbscencesManager extends HibernateUtil {
 
    public Abscences add(Abscences abscences) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(abscences);
        session.getTransaction().commit();
        return abscences;
    }
    public Abscences delete(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Abscences abscences = (Abscences) session.load(Abscences.class, id);
        if(null != abscences) {
            session.delete(abscences);
        }
        session.getTransaction().commit();
        return abscences;
    }
 
    public List<Object[]> list() {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Object[]> abscences = null;
        try {
            abscences = (List<Object[]>)session.createQuery("select P.nom, P.prenom, A.date_abscence, A.justificatif, A.id_abscence from Abscences A, Personnes P where A.id_personne = P.id_personne ORDER BY A.date_abscence DESC").list();
            
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return abscences;
    }

}