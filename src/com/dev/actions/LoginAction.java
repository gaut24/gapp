package com.dev.actions;


import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.db.Personnes;
import org.hibernate.Hibernate;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.servlet.http.Cookie;

import com.opensymphony.xwork2.ActionSupport;
 
public class LoginAction extends ActionSupport {
	
	
 
    private static final long serialVersionUID = 1L;    
    private String identifiant;
	private String password;
	
	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
    PersonnesDao dao = new PersonnesDao();
    Personnes personnes;
    
 
    @Override
    /*public void validate() {
        if (personnes.getLogin().length() == (0)) {
            this.addFieldError("personnes.login", "Name is required");
        }
        if (personnes.getPassword().length() == (0)) {
            this.addFieldError("personnes.password", "Password is required");
        }
    }*/
 
    public String execute() {
        if (dao.find(personnes.getLogin(), personnes.getPassword())) {
        	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    		Session session = sessionFactory.openSession();
    		session.beginTransaction();
    		String sql = "select id_personne from Personnes p where p.login=:name and p.password=:pass";
            Query query = session.createQuery(sql);
            query.setParameter("name", personnes.getLogin());
            query.setParameter("pass", personnes.getPassword());
    		Personnes personne = (Personnes) session.load(Personnes.class, (Serializable) query.list().get(0));
    		
    		int Droit = personne.getDroit();
    		switch (Droit)
    		{
    		  case 1:
    			  return "SUCCESSeleve";
    		  case 2:
    			  return "SUCCESSprof";
    		  case 3:
    			  return "SUCCESSadmin";
    		}
    		session.close();
        	
        } else {
            this.addActionError("Invalid username and password");
        }
        return "INPUT";
    }
     
 
    public Personnes getPersonnes() {
        return personnes;
    }
 
    public void setPersonnes(Personnes personnes) {
        this.personnes = personnes;
    }    
}
