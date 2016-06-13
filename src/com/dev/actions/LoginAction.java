package com.dev.actions;


import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;
 
import com.dev.actions.*;
import org.db.Personnes;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
 
public class LoginAction implements Action, ModelDriven<Personnes>, ServletContextAware, SessionAware {
	private Map<String, Object> userSession ;
    @Override
    public String execute() throws Exception {
         
        SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
        PersonnesDao personnesDao = new PersonnesDaoImpl(sf);
        Personnes personnesDB = personnesDao.getUserByCredentials(personnes.getLogin(), personnes.getPassword());
        if(personnesDB == null) return "INPUT";
        else {
        	personnes.setId_personne(personnesDB.getId_personne());
        	personnes.setNom(personnesDB.getNom());
        	personnes.setPrenom(personnesDB.getPrenom());
            personnes.setEmail(personnesDB.getEmail());
            personnes.setDroit(personnesDB.getDroit());
            userSession.put("id", personnesDB.getId_personne());
            userSession.put("nom", personnesDB.getNom());
            userSession.put("prenom", personnesDB.getPrenom());
            userSession.put("email", personnesDB.getEmail());
            userSession.put("droit", personnesDB.getDroit());
            userSession.put("groupe", personnesDB.getId_groupe());
            int droit = personnesDB.getDroit();
            if(droit == 1) return "SUCCESSeleve";
            else if (droit == 2) return "SUCCESSprof";
            else if (droit == 4) return "SUCCESSrespo";
            else return "SUCCESSadmin";
            
        }
    }
 
    @Override
    public Personnes getModel() {
        return personnes;
    }
     
    private Personnes personnes = new Personnes();
     
    private ServletContext ctx;
 
    @Override
    public void setServletContext(ServletContext sc) {
        this.ctx = sc;
    }

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		userSession = session;
	}
	public String logout(){ 
		userSession.clear();
	    return "SUCCESS";  
	}  
	
     
}