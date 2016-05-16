package com.dev.actions;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.db.Groupes;
import org.db.Personnes;

public class GroupeDAO {
Personnes pers = new Personnes();
Session session;
	  public Personnes getTuteur() {
		  String numGroupe = pers.getId_groupe();
	
	        Query query = session.createQuery("from Personnes p, Groupes gr where gr.id_tuteur = p.id_personne and gr.num_groupe = :numGroupe  ");
	        query.setString("numGroupe", numGroupe); 
	        Personnes tuteur = (Personnes) query.uniqueResult();
	        if(tuteur != null){
	            System.out.println("User Retrieved from DB::"+tuteur);
	        }
	      session.close();
	        return tuteur;
	    }
}
