package com.dev.actions;

import java.util.List;

import org.db.Personnes;
import org.hibernate.SessionFactory;

import com.model.SearchEleveDAO;
import com.model.SearchEleveManager;
import com.opensymphony.xwork2.ActionSupport;

public class RechercheEleveAction extends ActionSupport{
	
    private Personnes personnesEleve2;
    private List<Personnes> eleveSearch;
    private Long id;
    private String eleveNom;
 
    private SearchEleveManager searchEleveManager;
 
    public RechercheEleveAction() {
    	searchEleveManager = new SearchEleveManager();
    }
 
    @Override
    public String execute() throws Exception {
			this.personnesEleve2 = (Personnes) searchEleveManager.list();
            System.out.println("execute called");
            return "SUCCESS";
    }
 
 
    public Personnes getPersonnes() {
        return personnesEleve2;
    }
 
    public List<Personnes> getEleve() {
        return eleveSearch;
    }
 
    public void setPersonnes(Personnes personnes) {
        this.personnesEleve2 = personnesEleve2;
    }
 
    public void setEleve(List<Personnes> personnes) {
        this.eleveSearch = eleveSearch;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
    public String getEleveNom(){
    	return eleveNom;
    }
    public void setEleveNom(String eleveNom){
    	this.eleveNom = eleveNom;
    }
}
