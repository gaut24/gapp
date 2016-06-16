package org.db;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deadlines {
	@Id
	private int id_deadline;
	private String nom;
	private String num_groupe;
	private String date_deadline;
	
	public int getId_deadline() {
		return id_deadline;
	}
	public void setId_deadline(int id_deadline) {
		this.id_deadline = id_deadline;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNum_groupe() {
		return num_groupe;
	}
	public void setNum_groupe(String num_groupe) {
		this.num_groupe = num_groupe;
	}
	public String getDate_deadline() {
		return date_deadline;
	}
	public void setDate_deadline(String date_deadline) {
		this.date_deadline = date_deadline;
	}
	public Deadlines() {}
	public Deadlines(String nom, String groupe, String date) {
	      this.nom = nom;
	      this.num_groupe = groupe;
	      this.date_deadline = date;
	   }
	

}
