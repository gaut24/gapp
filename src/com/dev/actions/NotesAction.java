package com.dev.actions;

import java.util.List;
import java.util.Map;

import org.db.Releves_notes;

import com.model.NotesManager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NotesAction extends ActionSupport{
	private Releves_notes releves_notes;
    private List<Releves_notes> releves_notesList;
    private Long id;
    private String id_personneNote;
    Map session = (Map) ActionContext.getContext().get("session");
 
    private NotesManager notesManager;
 
    public NotesAction() {
    	notesManager = new NotesManager();
    }
 
    public String execute() {
        //this.releves_notesList = notesManager.list();
    	System.out.println(getReleves_notes().getResultat());
        System.out.println("notes called");
        return SUCCESS;
    }
 
    public String add() {
    	String parseNotes[]=getReleves_notes().getResultat().replaceAll(" ", "").split(","); 
    	String parseId[]=getId_personneNote().replaceAll(" ", "").split(","); 
    	String parseCom[]=getReleves_notes().getCommentaire().replaceAll(", ", ",").split(","); 
   
        try {
        	//notesManager.add(getReleves_notes());
        	
        	for(int i = 0; i<parseNotes.length; i++){
            	System.out.println(notesManager.listTest((int)getReleves_notes().getId_personne(), (int)session.get("id"), (int)Integer.parseInt(parseId[i]), parseNotes[i], parseCom[i]));
            	if(notesManager.listTest((int)getReleves_notes().getId_personne(), (int)session.get("id"), (int)Integer.parseInt(parseId[i]), parseNotes[i], parseCom[i]) == 0){
            		NotesManager.add((int)getReleves_notes().getId_personne(), (int)session.get("id"), (int)Integer.parseInt(parseId[i]), parseNotes[i], parseCom[i]);
            	}
            	else{
            		NotesManager.update((int)getReleves_notes().getId_personne(), (int)session.get("id"), (int)Integer.parseInt(parseId[i]), parseNotes[i], parseCom[i]);
            	}
            	 }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.releves_notesList = notesManager.list();
        return SUCCESS;
    }
 
    /*public String delete() {
    	notesManager.delete(getId());
        return SUCCESS;
    }*/
 
    public Releves_notes getReleves_notes() {
        return releves_notes;
    }
 
    public List<Releves_notes> getReleves_notesList() {
        return releves_notesList;
    }
 
    public void setReleves_notes(Releves_notes releves_notes) {
        this.releves_notes = releves_notes;
    }
 
    public void setReleves_notesList(List<Releves_notes> releves_notesList) {
        this.releves_notesList = releves_notesList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }

	public String getId_personneNote() {
		return id_personneNote;
	}

	public void setId_personneNote(String id_personneNote) {
		this.id_personneNote = id_personneNote;
	}
}
