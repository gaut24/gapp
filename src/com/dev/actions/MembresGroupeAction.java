package com.dev.actions;

import java.util.List;
import java.util.Map;

import org.apache.catalina.Session;
import org.db.Competences;
import org.db.Groupes;
import org.db.Personnes;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.model.CompetenceManager;
import com.model.MembresGroupeManager;
import com.model.TuteurManager;



public class MembresGroupeAction extends ActionSupport {
 
    private static final long serialVersionUID = 9149826260758390091L;
    private List<String> membres;
    private List<String> membresList;
    private Long id;
    Map session = (Map) ActionContext.getContext().get("session");
    
    private MembresGroupeManager membresManager;
    
    public MembresGroupeAction() {
    	membresManager = new MembresGroupeManager();
    }
 
    public String execute() {
        this.membresList = membresManager.list(session.get("groupe").toString(), (int)session.get("id"));
        System.out.println("membre called");
        return SUCCESS;
    }
 

 

 
    public List<String> getMembres() {
        return membres;
    }
 
    public List<String> getMembresList() {
        return membresList;
    }
 
    public void setMembres(List<String> membres) {
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