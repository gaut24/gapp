package com.dev.actions;

import java.util.List;

import org.db.Competences;
import org.db.Groupes;
import org.db.Personnes;
import com.opensymphony.xwork2.ActionSupport;
import com.model.CompetenceManager;
import com.model.MembresGroupeManager;
import com.model.TuteurManager;



public class MembresGroupeAction extends ActionSupport {
 
    private static final long serialVersionUID = 9149826260758390091L;
    private Personnes membres;
    private List<Personnes> membresList;
    private Long id;
 
    private MembresGroupeManager membresManager;
 
    public MembresGroupeAction() {
    	membresManager = new MembresGroupeManager();
    }
 
    public String execute() {
        this.membresList = membresManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
 

 

 
    public Personnes getMembres() {
        return membres;
    }
 
    public List<Personnes> getMembresList() {
        return membresList;
    }
 
    public void setMembres(Personnes membres) {
        this.membres = membres;
    }
 
    public void setMembresList(List<Personnes> membres) {
        this.membresList = membresList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
}