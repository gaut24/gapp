package com.dev.actions;

import java.util.ArrayList;

import org.db.Personnes;

import com.model.AutocompleteManager;

public class AutocompleteAction {
	// Received via Ajax request
    private String term;
    // Returned as responce
    private ArrayList<Personnes> list;

    public String execute() {
            try {
                    System.out.println("Parameter from ajax request : - " + term);
                    AutocompleteManager autocompleteManager = new AutocompleteManager();
                    list = autocompleteManager.list(term);
            } catch (Exception e) {
                    System.err.println(e.getMessage());
            }
            return "SUCCESS";
    }

    public ArrayList<Personnes> getList() {
            return list;
    }

    public void setList(ArrayList<Personnes> list) {
            this.list = list;
    }

    public String getTerm() {
            return term;
    }

    public void setTerm(String term) {
            this.term = term;
    }
}
