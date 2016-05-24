package com.model;

import java.util.ArrayList;
import java.util.List;

import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class AutocompleteManager {
    public static List<String> list() {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<String> personnes = null;
        try {
             
            personnes = (List<String>)session.createQuery("select nom,prenom from Personnes").list();
            
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return personnes;
    }
}
