package com.model;

import java.util.List;
import java.util.Map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.db.Competences;
import org.db.Groupes;
import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
public class MembresGroupeManager  extends HibernateUtil {
	 
	 
	 
    public List<Personnes> list() {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Personnes> competences = null;
        try {
             
        	competences = (List<Personnes>)session.createQuery("from Personnes WHERE id_groupe='GR-1' ").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return competences;
    }
}