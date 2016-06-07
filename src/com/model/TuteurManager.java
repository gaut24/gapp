package com.model;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.db.Groupes;
import org.db.Personnes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class TuteurManager extends HibernateUtil    {
Personnes pers = new Personnes(); 
private Map<String, Object> userSession ;
//int  IDgroupe = (int) userSession.get("id");
	 public List list() {
		  //Session session = HibernateUtil.getSessionFactory().openSession();
	       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        List l1 = null ;
	       // Iterator tuteur;
	        try {
	          
	        	//tuteur = (List<Personnes>)session.createQuery("SELECT p2.* FROM Groupes g, Personnes p, Personnes p2 WHERE g.num_groupe = p.id_groupe AND g.num_groupe= = \"GR-1\" AND g.id_tuteur = p2.id.personne").list();
	        	//  ((Query) groupes).setString("num", IDgroupe);
	        	//tuteur = session.createQuery("SELECT g.num_groupe, p2.prenom  FROM  Personnes p2, Groupes g WHERE p2.id_groupe = g.num_groupe  ").list();
	        	Query q = session.createQuery("SELECT p1.prenom, p1.nom  FROM  Personnes p1, Personnes p2, Groupes g WHERE p2.id_groupe = g.num_groupe AND g.id_tuteur = p1.id_personne ");
	        	 l1 = q.list();
	        /*	Iterator it=l1.iterator();
	        	while(it.hasNext() ){
	        		Object[] tuple = (Object[]) it.next();
	        		String p = (String) tuple[0];
	        		String g = (String) tuple[1];
	        		System.out.print(p);
	        		//System.out.println(g);
	        		
	        	}*/
	        	/*for (int i=0; i<=tuteur.size() ;i++){
	        	System.out.println("donnees: " + tuteur.get(i));
	        	}*/
	        	
	        	//  System.out.println("test : " + tuteur.get(0));
	        	//  System.out.println("le num est : " + IDgroupe);
	        } catch (HibernateException e) {
	            e.printStackTrace();
	            session.getTransaction().rollback();
	        }
	        
	        session.getTransaction().commit();
	       // session.close();
	        return l1;
	    }
}
