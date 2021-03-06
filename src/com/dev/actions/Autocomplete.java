package com.dev.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.db.Familles;
import org.db.Personnes;

import com.model.AutocompleteManager;

import com.opensymphony.xwork2.ActionSupport;

public class Autocomplete extends ActionSupport {
	
	private List<String> personnes;
	private List<String> tuteurs;
	private String eleve;
	
	public Autocomplete() {
	
	}
	public String execute() {
		this.tuteurs = AutocompleteManager.list2();
		this.personnes = AutocompleteManager.list();
		return "SUCCESS";
	}
	public String getEleve() {
		return this.eleve;
	}
	public List<String> getTuteurs() {
		return tuteurs;
	}
	public void setTuteurs(List<String> tuteurs) {
		this.tuteurs = tuteurs;
	}
	public List<String> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<String> personnes) {
		this.personnes = personnes;
	}
	public void setEleve(String eleve) {
		this.eleve = eleve;
	}
}