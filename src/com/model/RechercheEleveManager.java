package com.model;

import java.util.List;

import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class RechercheEleveManager extends HibernateUtil{
	 
	    public Personnes list(String nom) {
	         
	        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        Personnes eleve = null;
	        try {
	            Query query = (Query) session.createQuery("from Personnes where nom=:nom");
	            query.setString("nom", nom);
	            eleve = (Personnes) query.uniqueResult(); 
	        } catch (HibernateException e) {
	            e.printStackTrace();
	            session.getTransaction().rollback();
	        }
	        session.getTransaction().commit();
	        return eleve;
	    }
	}
