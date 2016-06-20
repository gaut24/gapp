package com.dev.actions;

import java.util.List;
import java.util.Map;

import org.db.Remarques;


import com.model.RemarquesManager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RemarquesAction extends ActionSupport{
	private Remarques remarques;
    private List<Remarques> remarquesList;
    private int id;
    Map session = (Map) ActionContext.getContext().get("session");
 
    private RemarquesManager remarquesManager;
 
    public RemarquesAction() {
    	remarquesManager = new RemarquesManager();
    }
 
    public String execute() {
        this.remarquesList = remarquesManager.list(session.get("groupe").toString());
        System.out.println("remarques called");
        return "SUCCESS";
    }
 
   public String add() {
        String parseRemarques[]=getRemarques().getId_to().replaceAll(" ", "").split(","); 
        System.out.println("test "+session.get("id").toString());
       try {
    	   for(int i = 0; i<parseRemarques.length; i++){
            	System.out.println(parseRemarques[i]);
            	remarquesManager.add((int)session.get("id"), parseRemarques[i], getRemarques().getText_remarque());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    }
    
    public String delete() {
    	remarquesManager.delete(getId());
        return "SUCCESS";
    }
 
    public Remarques getRemarques() {
        return remarques;
    }
 
    public List<Remarques> getRemarquesList() {
        return remarquesList;
    }
 
    public void setRemarques(Remarques remarques) {
        this.remarques = remarques;
    }
 
    public void setRemarquesList(List<Remarques> remarquesList) {
        this.remarquesList = remarquesList;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
}
