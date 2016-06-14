package com.dev.actions;

import java.util.List;

import org.db.Familles;
import org.db.Groupes;

import com.model.FamilleManager;
import com.model.GroupesManager;
import com.opensymphony.xwork2.ActionSupport;

public class GroupesAction extends ActionSupport{
	private Groupes groupes;
    private List<String> groupesList;
    private List<String> groupesList2;
    private Long id;
 
    private GroupesManager groupesManager;
 
    public GroupesAction() {
    	groupesManager = new GroupesManager();
    }
 
    public String execute() {
        this.groupesList = groupesManager.list();
        this.groupesList2 = groupesManager.list2();
        System.out.println("groupe called");
        return "SUCCESS";
    }
 
    public String add() {
        System.out.println(getGroupes());
        try {
        	groupesManager.add(getGroupes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.groupesList = groupesManager.list();
        return SUCCESS;
    }
 
    public String delete() {
    	groupesManager.delete(getId());
        return SUCCESS;
    }
 
    public Groupes getGroupes() {
        return groupes;
    }
 
    public List<String> getGroupesList() {
        return groupesList;
    }
    
    public List<String> getGroupesList2() {
        return groupesList2;
    }
 
    public void setGroupes(Groupes groupes) {
        this.groupes = groupes;
    }
 
    public void setGroupesList(List<String> groupesList) {
        this.groupesList = groupesList;
    }
    
    public void setGroupesList2(List<String> groupesList2) {
        this.groupesList2 = groupesList2;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
}
