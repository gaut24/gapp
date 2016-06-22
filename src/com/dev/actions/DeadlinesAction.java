package com.dev.actions;


import java.util.List;

import org.db.Deadlines;

import com.model.DeadlinesManager;

import com.opensymphony.xwork2.ActionSupport;

public class DeadlinesAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Deadlines deadlines;
    private List<Deadlines> deadlinesList;
    private List<Deadlines> deadlinesByGroup;
    private int id;
 
    private DeadlinesManager deadlinesManager;
 
    public DeadlinesAction() {
    	deadlinesManager = new DeadlinesManager();
    }
 
    public String execute() {
        this.deadlinesList = deadlinesManager.list();
        this.deadlinesByGroup = deadlinesManager.getDeadlinesByGroup();
        System.out.println(this.deadlinesByGroup);
        System.out.println("deadlines called");
        return "SUCCESS";
    }
 
    public String add() {
        String parseGroupes[]=getDeadlines().getNum_groupe().replaceAll(" ", "").split(",");      
        try {
        	for(int i = 0; i<parseGroupes.length; i++){
            	System.out.println(parseGroupes[i]);
            	deadlinesManager.add(getDeadlines().getNom(), parseGroupes[i], getDeadlines().getDate_deadline());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.deadlinesList = deadlinesManager.list();
        return "SUCCESS";
    }
    
    public String delete() {
    	deadlinesManager.delete(getId());
        return "SUCCESS";
    }
 
    public Deadlines getDeadlines() {
        return deadlines;
    }
 
    public List<Deadlines> getDeadlinesByGroup() {
    	return deadlinesByGroup;
    }
    
    public List<Deadlines> getDeadlinesList() {
        return deadlinesList;
    }
 
    public void setDeadlinesByGroup(List<Deadlines> deadlinesByGroup) {
    	this.deadlinesByGroup = deadlinesByGroup;
    }
    
    public void setDeadlines(Deadlines deadlines) {
        this.deadlines = deadlines;
    }
 
    public void setDeadlinesList(List<Deadlines> deadlinesList) {
        this.deadlinesList = deadlinesList;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }

}
