package com.model;

import java.util.List;

import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class PersonnesToGroupeManager extends HibernateUtil {
	
	public Personnes update(String nom, String groupe) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query q = session.createQuery("from Personnes where nom = :nom ");
        q.setParameter("nom", nom);
        Personnes personnes = (Personnes)q.list().get(0);  
        personnes.setId_groupe(groupe);
        session.update(personnes);
        return personnes;
    }
    
 
    public List<String> list() {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<String> personnesToGroupe = null;
        try {
             
        	personnesToGroupe = (List<String>)session.createQuery("from Personnes").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return personnesToGroupe;
    }
    public List<Personnes> list2() {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Personnes> personnesToGroupe = null;
        try {
             
        	personnesToGroupe = (List<Personnes>)session.createQuery("from Personnes where droit=1").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return personnesToGroupe;
    }
		public List listGroupe() {
		        
		        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		        session.beginTransaction();
		        List personnesToGroupe = null;
		        try {
		             
		        	personnesToGroupe = session.createQuery("select nom, prenom, id_groupe from Personnes where droit=1").list();
		             
		        } catch (HibernateException e) {
		            e.printStackTrace();
		            session.getTransaction().rollback();
		        }
		        session.getTransaction().commit();
		        return personnesToGroupe;
		    }
		public List listGroupe2() {
	        
	        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        List personnesToGroupe = null;
	        try {
	             
	        	personnesToGroupe = session.createQuery("select nom, prenom, id_groupe from Personnes where droit=2").list();
	             
	        } catch (HibernateException e) {
	            e.printStackTrace();
	            session.getTransaction().rollback();
	        }
	        session.getTransaction().commit();
	        return personnesToGroupe;
	    }
}
