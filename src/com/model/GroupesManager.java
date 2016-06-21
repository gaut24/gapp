package com.model;

import java.util.List;

import org.db.Groupes;
import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class GroupesManager {
	public Groupes add(Groupes groupes) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(groupes);
        session.getTransaction().commit();
        return groupes;
    }
    public Groupes delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Groupes groupes = (Groupes) session.load(Groupes.class, id);
        if(null != groupes) {
            session.delete(groupes);
        }
        session.getTransaction().commit();
        return groupes;
    }
    public Groupes update(int id, String groupe) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query q = session.createQuery("from Groupes where num_groupe ='"+groupe+"'");
        Groupes groupes = (Groupes)q.list().get(0);  
        groupes.setId_tuteur(id);
        session.update(groupes);
        return groupes;
    }
 
    public List<String> list() {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<String> groupes = null;
        try {
             
            groupes = (List<String>)session.createQuery("select num_groupe from Groupes").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return groupes;
    }
    public List<String> list2() {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<String> groupes = null;
        try {
             
            groupes = (List<String>)session.createQuery("from Groupes").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return groupes;
    }
public List<String> list3() {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<String> groupes = null;
        try {
             
            groupes = (List<String>)session.createQuery("select P.nom, P.prenom, G.num_groupe from Groupes G, Personnes P where G.id_tuteur=P.id_personne").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return groupes;
    }
}
