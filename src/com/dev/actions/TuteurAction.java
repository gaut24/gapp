package com.dev.actions;

import java.util.List;

import org.db.Competences;
import org.db.Groupes;
import org.db.Personnes;
import com.opensymphony.xwork2.ActionSupport;
import com.model.CompetenceManager;
import com.model.TuteurManager;

public class TuteurAction {

  //  private static final long serialVersionUID = 9149826260758390091L;
    private Personnes tuteur;
    private List tuteurList;
    private Long id;
    
    private TuteurManager tuteurManager;
    
    public TuteurAction() {
    	tuteurManager = new TuteurManager();
    }
 
    public String execute() {
        this.tuteurList = tuteurManager.list();
        System.out.println("execute called");
        return "success";
    }
 
  
 
    public Personnes getTuteur() {
        return tuteur;
    }
 
    public List getTuteurList() {
        return tuteurList;
    }
 
    public void setTuteur(Personnes tuteur) {
        this.tuteur = tuteur;
    }
 
    public void setTuteurList(List tuteurList) {
        this.tuteurList =tuteurList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
}
