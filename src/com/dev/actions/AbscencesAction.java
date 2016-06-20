package com.dev.actions;

import java.util.List;
import java.util.Map;

import org.db.Abscences;
import org.db.Personnes;

import com.model.AbscencesManager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AbscencesAction extends ActionSupport{
    private static final long serialVersionUID = 9149826260758390091L;
    private Abscences abscences;
    private List<Object[]> abscencesList;
    private List<Personnes> personnesList;
    private int countAbscences;
    private int pourcentage;
    private int id;
    Map session = (Map) ActionContext.getContext().get("session");
 
    private AbscencesManager abscencesManager;
 
    public AbscencesAction() {
    	abscencesManager = new AbscencesManager();
    }
 
    public String execute() {
    	this.abscencesList = abscencesManager.list();
    	this.countAbscences = abscencesManager.count(((int) session.get("id")));
    	this.pourcentage = ((this.countAbscences*100)/10);
        System.out.println("absences called");
        return "SUCCESS";
    }
 
    public String add() {
        System.out.println("test "+getAbscences().getDate_abscence());
        try {
        	abscencesManager.add(getAbscences());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.abscencesList = abscencesManager.list();
        return "SUCCESS";
    }
 
    public String delete() {
    	abscencesManager.delete((int)getId());
        return "SUCCESS";
    }
 
    public Abscences getAbscences() {
        return abscences;
    }
 
    public List<Object[]> getAbscencesList() {
        return abscencesList;
    }
 
    public void setAbscences(Abscences abscences) {
        this.abscences = abscences;
    }
 
    public void setAbscencesList(List<Object[]> abscencesList) {
        this.abscencesList = abscencesList;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
    public int getPourcentage(){
    	return pourcentage;
    }
    public void setPourcentage(int pourcentage){
    	this.pourcentage = pourcentage;
    }
}
