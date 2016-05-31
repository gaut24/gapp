package com.model;

import java.util.List;

import org.db.Familles;
import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class SearchEleveManager {
	
	@SuppressWarnings("unchecked")
	public List<Personnes> list() {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Personnes> personnesEleve = null;
        try {
             
        	Query query = (Query)session.createQuery("from Personnes").list();
        	personnesEleve = (List<Personnes>) query;
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return personnesEleve;
    }
}
