package com.dev.actions;

import java.util.List;

import org.db.Abscences;
import org.db.Personnes;

import com.model.AbscencesManager;
import com.opensymphony.xwork2.ActionSupport;

public class AbscencesAction extends ActionSupport{
    private static final long serialVersionUID = 9149826260758390091L;
    private Abscences abscences;
    private List<Object[]> abscencesList;
    private List<Personnes> personnesList;
    private Long id;
 
    private AbscencesManager AbscencesManager;
 
    public AbscencesAction() {
    	AbscencesManager = new AbscencesManager();
    }
 
    public String execute() {
    	this.abscencesList = AbscencesManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
 
    public String add() {
        System.out.println("test "+getAbscences());
        try {
        	AbscencesManager.add(getAbscences());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.abscencesList = AbscencesManager.list();
        return "success";
    }
 
    public String delete() {
    	AbscencesManager.delete(getId());
        return SUCCESS;
    }
 
    public Abscences getAbscences() {
        return abscences;
    }
 
    public List<Object[]> getAbscencesList() {
        return abscencesList;
    }
 
    public void setFamilles(Abscences abscences) {
        this.abscences = abscences;
    }
 
    public void setAbscencesList(List<Object[]> AbscencesList) {
        this.abscencesList = AbscencesList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
}
