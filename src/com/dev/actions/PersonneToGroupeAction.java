package com.dev.actions;

import java.util.List;

import org.db.Familles;
import org.db.Personnes;

import com.model.FamilleManager;
import com.model.PersonnesToGroupeManager;
import com.opensymphony.xwork2.ActionSupport;

public class PersonneToGroupeAction extends ActionSupport {
	private Personnes pers = new Personnes();
	private Personnes personnes;
    private List<String> personnesList;
    private List<Personnes> personnesList2;
    private Long id;
    private String eleveNomToGroupe;
    private String eleveToGroupe;
 
    private PersonnesToGroupeManager personnesToGroupeManager;
 
    public PersonneToGroupeAction() {
    	personnesToGroupeManager = new PersonnesToGroupeManager();
    }
 
    public String execute() {
        this.personnesList = personnesToGroupeManager.list();
        this.personnesList2 = personnesToGroupeManager.list2();
        System.out.println("gr called");
        System.out.println(personnesList2);
        return "SUCCESS";
    }
 
    public String update() {
        System.out.println(eleveNomToGroupe+eleveToGroupe);
        try {
        	personnesToGroupeManager.update(eleveNomToGroupe,eleveToGroupe);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.personnesList = personnesToGroupeManager.list();
        return "SUCCESS";
    }
 
 
    public Personnes getPersonnesToGroupe() {
        return personnes;
    }
 
    public List<String> getPersonnesToGroupeList() {
        return personnesList;
    }
    public List<Personnes> getPersonnesToGroupeList2() {
        return personnesList2;
    }
 
    public void setPersonnesToGroupe(Personnes personnes) {
        this.personnes = personnes;
    }
 
    public void setPersonnesToGroupeList(List<String> personnesList) {
        this.personnesList = personnesList;
    }
    public void setPersonnesToGroupeList2(List<Personnes> personnesList2) {
        this.personnesList2 = personnesList2;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }

	public String getEleveNomToGroupe() {
		return eleveNomToGroupe;
	}

	public void setEleveNomToGroupe(String eleveNomToGroupe) {
		this.eleveNomToGroupe = eleveNomToGroupe;
	}

	public String getEleveToGroupe() {
		return eleveToGroupe;
	}

	public void setEleveToGroupe(String eleveToGroupe) {
		this.eleveToGroupe = eleveToGroupe;
	}
}
