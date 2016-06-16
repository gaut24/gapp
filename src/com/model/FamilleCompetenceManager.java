package com.model;

import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import com.dev.actions.HibernateUtil;


public class FamilleCompetenceManager extends HibernateUtil {
	private Map<String, Object> userSession ;
		 public List listFC() {
		       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		        session.beginTransaction();
		        List l1 = null ;
		        try {
		        	Query q = session.createQuery("SELECT  F.nom as nom_famille, C.nom as nom_competence  FROM  Familles F, Competences C WHERE F.id_famille = C.id_famille");
		        	l1 = q.list();
		        } catch (HibernateException e) {
		            e.printStackTrace();
		            session.getTransaction().rollback();
		        }
		        session.getTransaction().commit();
		        return l1;
		    }
		 public List listF() {
		       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		        session.beginTransaction();
		        List l1 = null ;
		        try {
		        	Query q = session.createQuery("SELECT  nom FROM  Familles");
		        	l1 = q.list();
		        } catch (HibernateException e) {
		            e.printStackTrace();
		            session.getTransaction().rollback();
		        }
		        session.getTransaction().commit();
		        return l1;
		    }

}
