package com.dev.actions;

import java.util.List;

import org.db.Deadlines;
import org.db.Familles;

import com.model.DeadlinesManager;
import com.model.FamilleManager;
import com.opensymphony.xwork2.ActionSupport;

public class DeadlinesAction extends ActionSupport {
 
    private static final long serialVersionUID = 9149826260758390091L;
    private Deadlines deadlines;
    private List<Deadlines> deadlinesList;
    private Long id;
 
    private DeadlinesManager deadlinesManager;
 
    public DeadlinesAction() {
    	deadlinesManager = new DeadlinesManager();
    }
 
    public String execute() {
        this.deadlinesList = deadlinesManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
 
    public String add() {
        System.out.println("testtt" + getDeadlines());
        try {
        	deadlinesManager.add(getDeadlines());
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.deadlinesList = deadlinesManager.list();
        return SUCCESS;
    }
 
    public String delete() {
    	deadlinesManager.delete(getId());
        return SUCCESS;
    }
 
    public Deadlines getDeadlines() {
        return deadlines;
    }
 
    public List<Deadlines> getDeadlinesList() {
        return deadlinesList;
    }
 
    public void setDeadlines(Deadlines deadlines) {
        this.deadlines =deadlines;
    }
 
    public void setDeadlinesList(List<Deadlines> deadlinesList) {
        this.deadlinesList = deadlinesList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
}
