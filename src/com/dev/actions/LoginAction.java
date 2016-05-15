package com.dev.actions;


import javax.servlet.ServletContext;
 
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;
 
import com.dev.actions.*;
import org.db.Personnes;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
 
public class LoginAction implements Action, ModelDriven<Personnes>, ServletContextAware {
     
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
            personnes.setId_groupe(personnesDB.getId_groupe());
            int droit = personnesDB.getDroit();
            if(droit == 1) return "SUCCESSeleve";
            else if (droit == 2) return "SUCCESSprof";
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
     
}