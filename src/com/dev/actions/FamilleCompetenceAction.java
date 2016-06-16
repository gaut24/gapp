package com.dev.actions;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.model.FamilleCompetenceManager;


public class FamilleCompetenceAction extends ActionSupport{

	  //  private static final long serialVersionUID = 9149826260758390091L;
	    private List FamilleCompetenceList;
	    private List FamilleList;
		private Long id;

	    private FamilleCompetenceManager FamilleCompetenceManager;
	    
	    public FamilleCompetenceAction() {
	    	FamilleCompetenceManager = new FamilleCompetenceManager();
	    }
	 
	    public String execute() {
	        //this.setFamilleCompetenceList(FamilleCompetenceManager.list());
	    	this.FamilleCompetenceList = FamilleCompetenceManager.listFC();
	    	this.FamilleList = FamilleCompetenceManager.listF();
	        System.out.println("execute called");
	        return SUCCESS;
	    }

	    public List getFamilleCompetenceList() {
			return FamilleCompetenceList;
		}

		public void setFamilleCompetenceList(List familleCompetenceList) {
			FamilleCompetenceList = familleCompetenceList;
		}
		
	 
	    public Long getId() {
	        return id;
	    }
	 
	    public void setId(Long id) {
	        this.id = id;
	    }

		public List getFamilleList() {
			return FamilleList;
		}

		public void setFamilleList(List familleList) {
			FamilleList = familleList;
		}

}
