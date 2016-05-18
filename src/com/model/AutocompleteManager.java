package com.model;

import java.util.ArrayList;
import java.util.List;

import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class AutocompleteManager {
	public ArrayList<Personnes> list(String Nom) {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Personnes> personnes = null;
        try {
             
        	personnes = (List<Personnes>)session.createQuery("from Personnes where nom=:nom").list();
        	((Query) personnes).setString("nom", Nom+"%");
        	
        	
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return (ArrayList<Personnes>) personnes;
    }
}
