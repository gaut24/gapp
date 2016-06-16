package com.dev.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.db.Personnes;

import com.model.RechercheEleveManager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class RechercheEleveAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Personnes eleve;
    private List<Personnes> eleveList;
    private Long id;
    private String eleveNom;
    
    private Personnes personnes = new Personnes();
 
    private RechercheEleveManager rechercheEleveManager;
 
    public RechercheEleveAction() {
    	rechercheEleveManager = new RechercheEleveManager();
    }
 
    public String execute() {
    	ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<String, Object>();
        Personnes eleve = (Personnes)rechercheEleveManager.list(eleveNom.substring(0, eleveNom.indexOf(",")));
        personnes.setNom(eleve.getNom());
        personnes.setPrenom(eleve.getPrenom());
        context.put("nom", eleve.getNom()); 
        context.put("prenom", eleve.getPrenom()); 
        context.put("groupe", eleve.getId_groupe()); 
        context.put("id", eleve.getId_personne()); 
        System.out.println("eleve called "+eleve.getNom());
        stack.push(context);
        return "SUCCESS";
    }
 
    public Personnes getEleve() {
        return eleve;
    }
 
    public List<Personnes> getEleveList() {
        return eleveList;
    }
 
    public void setPersonnes(Personnes eleve) {
        this.eleve = eleve;
    }
 
    public void setEleveList(List<Personnes> eleveList) {
        this.eleveList = eleveList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
    public String getEleveNom() {
        return eleveNom;
    }
    public void setEleveNom(String eleveNom) {
		this.eleveNom = eleveNom;
	}
}
