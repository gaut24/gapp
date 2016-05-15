package com.dev.actions;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.db.Personnes;
 
public class PersonnesDaoImpl implements PersonnesDao {
     
    private SessionFactory sf;
    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); 
    public PersonnesDaoImpl(SessionFactory sf){
        this.sf = sf;
    }
 
    @Override
    public Personnes getUserByCredentials(String login, String password) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Personnes where login=:login and password=:password");
        query.setString("login", login); query.setString("password", password);
        Personnes personnes = (Personnes) query.uniqueResult();
        if(personnes != null){
            System.out.println("User Retrieved from DB::"+personnes);
        }
        tx.commit();session.close();
        return personnes;
    }
 
}

