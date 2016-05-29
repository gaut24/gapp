package com.model;

import java.util.List;

import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class SearchEleveManager {
	
	public Personnes getEleve(String nom) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from Personnes where nom=:nom");
        query.setString("nom", nom); 
        Personnes personnes = (Personnes) query.uniqueResult();
        if(personnes != null){
            System.out.println("User get from DB::"+personnes);
        }
        session.getTransaction().commit();
        return personnes;
    }
}
