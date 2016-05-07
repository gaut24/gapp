package com.dev.actions;


import java.util.List;

import org.db.Personnes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
    
 
    /*@Override
    public void validate() {
        if (personnes.getLogin().length() == (0)) {
            this.addFieldError("personnes.login", "Name is required");
        }
        if (personnes.getPassword().length() == (0)) {
            this.addFieldError("personnes.password", "Password is required");
        }
    }*/
 
    @Override
    public String execute() {
        if (dao.find(personnes.getLogin(), personnes.getPassword())) {
        	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        	Session session = sessionFactory.openSession();
        	session = sessionFactory.openSession();
    		session.beginTransaction();
    		int droit = personnes.getDroit();
    		if(droit == 1){
    			System.out.println("1");
    		}
    		else if(droit == 2){
    			System.out.println("2");
    		}
    		session.close();
            return "SUCCESS";
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
