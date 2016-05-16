package com.dev.actions;

import java.util.List;

import org.db.Competences;

import com.model.CompetenceManager;
import com.opensymphony.xwork2.ActionSupport;
 
 
public class CompetenceAction extends ActionSupport {
 
    private static final long serialVersionUID = 9149826260758390091L;
    private Competences competences;
    private List<Competences> competencesList;
    private Long id;
 
    private CompetenceManager competenceManager;
 
    public CompetenceAction() {
    	competenceManager = new CompetenceManager();
    }
 
    public String execute() {
        this.competencesList = competenceManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
 
    public String add() {
        System.out.println(getCompetences());
        try {
        	competenceManager.add(getCompetences());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.competencesList = competenceManager.list();
        return SUCCESS;
    }
 
    public String delete() {
    	competenceManager.delete(getId());
        return SUCCESS;
    }
 
    public Competences getCompetences() {
        return competences;
    }
 
    public List<Competences> getCompetencesList() {
        return competencesList;
    }
 
    public void setCompetences(Competences competences) {
        this.competences = competences;
    }
 
    public void setCompetencesList(List<Competences> competences) {
        this.competencesList = competencesList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
}