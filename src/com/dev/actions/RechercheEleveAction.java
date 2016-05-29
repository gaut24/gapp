package com.dev.actions;

import java.util.List;

import org.db.Competences;
import org.db.Personnes;
import org.hibernate.SessionFactory;

import com.model.CompetenceManager;
import com.model.SearchEleveDAO;
import com.model.SearchEleveManager;
import com.opensymphony.xwork2.ActionSupport;

public class RechercheEleveAction extends ActionSupport{
	
    private Personnes personnes;
    private List<Personnes> eleveSearch;
    private Long id;
 
    private SearchEleveManager searchEleveManager;
 
    public RechercheEleveAction() {
    	searchEleveManager = new SearchEleveManager();
    }
 
    @Override
    public String execute() throws Exception {
         
        SearchEleveDAO searchEleveDAO = (SearchEleveDAO) new SearchEleveManager();
        Personnes personnesEleve = searchEleveDAO.getEleve(personnes.getNom());
        if(personnesEleve == null) return "INPUT";
        else{
        personnes.setId_personne(personnesEleve.getId_personne());
    	personnes.setNom(personnesEleve.getNom());
    	personnes.setPrenom(personnesEleve.getPrenom());
        personnes.setEmail(personnesEleve.getEmail());
        personnes.setDroit(personnesEleve.getDroit());
		return "SUCCESS";
        }
    }
 
 
    public Personnes getPersonnes() {
        return personnes;
    }
 
    public List<Personnes> getEleve() {
        return eleveSearch;
    }
 
    public void setPersonnes(Personnes personnes) {
        this.personnes = personnes;
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
}
