package com.dev.actions;

import java.util.List;

import org.db.Competences;
import org.db.Personnes;

import com.model.CompetenceManager;
import com.model.RolesManager;
import com.opensymphony.xwork2.ActionSupport;

public class RolesAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Personnes personnes;
    private List<Personnes> personnesList;
    private Long id;
    private Boolean test;
 
    private RolesManager rolesManager;
 
    public RolesAction() {
    	rolesManager = new RolesManager();
    }
 
    public String execute() {
        this.personnesList = rolesManager.list();
        System.out.println("roles called");
        return "SUCCESS";
    }
 
 
    public Personnes getPersonnes() {
        return personnes;
    }
 
    public List<Personnes> getPersonnesList() {
        return personnesList;
    }
 
    public void setPersonnes(Personnes personnes) {
        this.personnes = personnes;
    }
 
    public void setPersonnesList(List<Personnes> personnes) {
        this.personnesList = personnesList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
}
