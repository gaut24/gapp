package com.model;

import java.util.List;

import org.db.Personnes;
import org.db.Releves_notes;
import org.db.Remarques;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.dev.actions.HibernateUtil;

public class NotesManager extends HibernateUtil{
	
	public static Releves_notes add(int id_personnes, int id_from, int id_comp, String resultat, String commentaire) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Releves_notes releves_notes = new Releves_notes(id_personnes, id_from, id_comp, resultat, commentaire);
        session.save(releves_notes);
        session.getTransaction().commit();
        return releves_notes;
    }
    public Releves_notes delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Releves_notes releves_notes = (Releves_notes) session.load(Releves_notes.class, id);
        if(null != releves_notes) {
            session.delete(releves_notes);
        }
        session.getTransaction().commit();
        return releves_notes;
    }
 
    public List<Releves_notes> list(int id) {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Releves_notes> releves_notes = null;
        try {
             
        	releves_notes = (List<Releves_notes>)session.createQuery("select id_personne, id_competence, resultat, commentaire from Releves_notes where id_from=15 and id_personne='"+id+"'").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return releves_notes;
    }
    public int listTest(int id_personnes, int id_from, int id_comp, String resultat, String commentaire) {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        int releves_notes = 0;
        try {
             
        	releves_notes = ((Long) session.createQuery("SELECT COUNT(*) from Releves_notes where id_personne='"+id_personnes+"' and id_from='"+id_from+"' and id_competence ='"+id_comp+"'").uniqueResult()).intValue();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return releves_notes;
    }
    public static Releves_notes update(int id_personnes, int id_from, int id_comp, String resultat, String commentaire) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query q = session.createQuery("from Releves_notes where id_personne='"+id_personnes+"' and id_from='"+id_from+"' and id_competence ='"+id_comp+"'");
        Releves_notes resultatNew = (Releves_notes)q.list().get(0);
        resultatNew.setResultat(resultat);
        resultatNew.setCommentaire(commentaire);
        session.update(resultatNew);
        return resultatNew;
    }
}
