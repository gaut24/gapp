package com.dev.actions;

import java.util.List;

import org.db.Familles;

import com.model.FamilleManager;
import com.opensymphony.xwork2.ActionSupport;
 
 
public class FamilleAction extends ActionSupport {
 
    private static final long serialVersionUID = 9149826260758390091L;
    private Familles familles;
    private List<Familles> famillesList;
    private Long id;
 
    private FamilleManager familleManager;
 
    public FamilleAction() {
    	familleManager = new FamilleManager();
    }
 
    public String execute() {
        this.famillesList = familleManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
 
    public String add() {
        System.out.println(getFamilles());
        try {
        	familleManager.add(getFamilles());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.famillesList = familleManager.list();
        return SUCCESS;
    }
 
    public String delete() {
    	familleManager.delete(getId());
        return SUCCESS;
    }
 
    public Familles getFamilles() {
        return familles;
    }
 
    public List<Familles> getFamillesList() {
        return famillesList;
    }
 
    public void setFamilles(Familles familles) {
        this.familles = familles;
    }
 
    public void setFamillesList(List<Familles> famillesList) {
        this.famillesList = famillesList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
}